package engineEmi

import com.soywiz.korge.*
import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import com.soywiz.korim.color.*
import engineEmi.Bodies.*


object Engine {

    var canvasElements = mutableListOf<CanvasElement>()
    var bodies = mutableListOf<Ebody>()
    var viewHeight = 0.0
        private set
    var viewWidth = 0.0
        private set

    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {

        viewWidth = this.width
        viewHeight = this.height

        views.clearColor = Colors.DIMGRAY
        // Physik


        if (!bodies.isEmpty()) {
            worldView {
                position(400, 400)
                bodies.map { registerBodyWithWorld(it) }
                bodies.onEach { it.body }

/*
                 createBody  {
                    setPosition(0, -10)
                }.fixture {
                    shape = BoxShape(100, 20)
                    density = 0f
                }.setViewWithContainer(solidRect(100, 20, Colors.BLUE).position(-50, -10))*/
            }


            }

        }

    /* // Physikfreie Zone
     if (!canvasElements.isEmpty()) {
         canvasElements.map { it.prepareElement() }
         canvasElements.map { addChild(it) }
         launch {
             while (true) {
                 canvasElements.map { it.animate() }
                 delay(16.milliseconds)
             }
         }
     }*/



    fun WorldView.registerBodyWithWorld(body: Ebody) {
        body.initForWorld(this.world)

    }

    fun registerCanvasElement(canvasElement: CanvasElement) {
        canvasElements.add(canvasElement)
    }

    fun registerBody(body: Ebody) {
        bodies.add(body)
    }

    fun register(o: Any) {
        if (o is Ebody)
            registerBody(o)
        else if (o is CanvasElement)
            registerCanvasElement(o)
        else
            Log.log("Objekt ${o} vom Typ ${o::class} kann nicht registriert werden.")
    }


}
