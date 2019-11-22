package engineEmi

import com.soywiz.klock.*
import com.soywiz.korge.*
import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import com.soywiz.korim.color.*
import com.soywiz.korio.async.*
import engineEmi.Bodies.*


object Engine {

    var canvasElements = mutableListOf<CanvasElement>()
    var bodies = mutableListOf<Ebody>()
    var viewHeight = 0.0
        private set
    var viewWidth = 0.0
        private set
    var showCoords = false


    suspend fun run(showCoords: Boolean = false) {
        this.showCoords = showCoords
        main()
    }

    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {

        viewWidth = this.width
        viewHeight = this.height

        views.clearColor = Colors.DIMGRAY
        // Physik


        worldView {
            position(400, 400).scale(10)
                // X: -20 bis +50
                // Y: -20 bis +20

            if (showCoords) {
                Log.log("Zeige Koordinatensystem")
                val coordSystem = listOf(Line(-50, 0, 150, 0, fillColor = Colors.YELLOW, thickness = 10))

                coordSystem.onEach { registerBodyWithWorld(it) }
                coordSystem.onEach { it.body }

            }

            if (!bodies.isEmpty()) {
                bodies.onEach { registerBodyWithWorld(it) }
                bodies.onEach { it.body }
            }
            }


        //Physikfreie Zone
     if (!canvasElements.isEmpty()) {
         canvasElements.map { it.prepareElement() }
         canvasElements.map { addChild(it) }
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

    suspend fun registerCanvasElement(canvasElement: CanvasElement) {
        canvasElements.add(canvasElement)
    }

    suspend fun registerBody(body: Ebody) {
        bodies.add(body)
    }

    suspend fun register(o: Any) {
        if (o is Ebody)
            registerBody(o)
        else if (o is CanvasElement)
            registerCanvasElement(o)
        else
            Log.log("Objekt ${o} vom Typ ${o::class} kann nicht registriert werden.")
    }


}
