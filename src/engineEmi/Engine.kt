package engineEmi

import com.soywiz.klock.*
import com.soywiz.korge.*
import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import com.soywiz.korim.color.*
import com.soywiz.korio.async.*
import engineEmi.Bodies.*
import engineEmi.CanvasElements.*
import engineEmi.Engine.bodies
import engineEmi.Engine.canvasElements

/**
 * Die Game-Engine. Sie ist ein Singleton und wird mit [Engine.run] gestartet.
 * @property canvasElements Alle registrieten Objekte vom Typ [CanvasElement]
 * @property bodies Alle registrieten Objekte des Typs [Ebody]
 *
 */
object Engine {
    var canvasElements = mutableListOf<CanvasElement>()
    var bodies = mutableListOf<Ebody>()
    var view = ViewWindow()
    var viewHeight = 0.0
        private set
    var viewWidth = 0.0
        private set
    var showCoords = false

    /**
     * Startet die Engine. Kann Parameter zur Konfiguration übernehmen
     * @param showCoords Zeigt ein Koordinatensystem zum Debugging
     */
    suspend fun run(showCoords: Boolean = false) {
        this.showCoords = showCoords
        main()
    }


    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {
        view.width = this.views.virtualWidth
        view.height = this.views.virtualHeight

        views.clearColor = Colors.WHITE
        // Physik
        worldView {
            position(400, 400).scale(10)
            // X: -20 bis +50
            // Y: -20 bis +20

            if (!bodies.isEmpty()) {
                bodies.run {
                    onEach { registerBodyWithWorld(it) }
                    onEach { it.body }
                }
            }


        }


        //Physikfreie Zone
        if (!canvasElements.isEmpty()) {
            canvasElements.run {
                map { it.prepareElement() }
                map { addChild(it) }
            }
            launch {
                while (true) {
                    canvasElements.map { it.animate() }
                    delay(16.milliseconds)
                }
            }

        }
    }


    suspend fun WorldView.registerBodyWithWorld(body: Ebody) {
        body.initForWorld(this.world)

    }

    /**
     * Registriert ein [CanvasElement] bei der Engine (reguläre Objekte)
     * @param canvasElement CanvasElement
     */
    fun registerCanvasElement(canvasElement: CanvasElement) {
        canvasElements.add(canvasElement)
    }

    /**
     * Registriert einen [Ebody] bei der Engine (Physikobjekte)
     * @param body Ebody
     */
    fun registerBody(body: Ebody) {
        bodies.add(body)
    }


    /**
     * Registriert einen [Ebody] oder ein [CanvasElement] bei der Engine
     * Es ist auch möglich Arrays und Collections zu registrieren.
     * [Ebody] und [CanvasElement] dürfen in den Arrays oder Collections nicht gemischt vorkommen
     * @param o Any
     */
    fun register(o: Any) {
        when{
            o is Array<*> -> o.map {it?.let { register(it) }}
            o is Collection<*> -> o.map {it?.let { register(it)}}
            o is Ebody -> registerBody(o)
            o is CanvasElement -> registerCanvasElement(o)
        }
    }




}

class ViewWindow {
    var height = 0
    var width = 0
}
