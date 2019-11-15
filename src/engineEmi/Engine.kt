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
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*
import kotlin.js.*
import kotlin.reflect.*


object Engine {

    var views = mutableListOf<CanvasElement>()
    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {
        setupCircle()
    }

    fun Stage.setupCircle() {
        Engine.views.map { addChild(it) }

        launch {
            while (true) {
                Engine.views.map { it.animate() }
                delay(16.milliseconds)
            }
        }
    }

    fun registerCanvasElement(canvasElement: CanvasElement){
    //        println("DEPRECATED/ÜBERHOLT: Verwenden Sie stattdessen registerElement()" )
        views.add(canvasElement)
    }

    /*fun registerElement(view : View){
        views.add(view)
    }*/



}
