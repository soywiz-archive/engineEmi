package engineEmi

import com.soywiz.klock.*
import com.soywiz.korge.*
import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.scene.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import com.soywiz.korim.color.*
import com.soywiz.korim.format.*
import com.soywiz.korim.vector.*
import com.soywiz.korinject.*
import com.soywiz.korio.async.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.shape.*
import com.soywiz.korma.geom.vector.*
import engineEmi.Bodies.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*
import kotlin.js.*
import kotlin.reflect.*


object Engine {

    var canvasElements = mutableListOf<CanvasElement>()
    var bodies = mutableListOf<Ebody>()


    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {

        // Physik
        if (!Engine.bodies.isEmpty()) {
            worldView {
                position(400, 400).scale(20)
                bodies.map { registerBodyWithWorld(it) }
                bodies.map { it }
                bodies.map { it.animate() }
            }
        }

        // Physikfreie Zone
        if (!Engine.canvasElements.isEmpty()) {
            launch {
                while (true) {
                    Engine.bodies.map { it.animate() }
                    delay(16.milliseconds)
                }
            }
        }


    }


    fun WorldView.registerBodyWithWorld(body: Ebody) {
        body.initForWorld(this.world)

    }

    fun registerCanvasElement(canvasElement: CanvasElement) {
        canvasElements.add(canvasElement)
    }

    fun registerBody(body: Ebody) {
        bodies.add(body)
    }

    fun register(o : Any){
        if (o is Ebody)
            registerBody(o)
        else if (o is CanvasElement)
            registerCanvasElement(o)
        else
            Log.log("Objekt ${o} vom Typ ${o::class} kann nicht registriert werden.")
    }

}
