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

    var views = mutableListOf<CanvasElement>()
    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "Engine Emi") {
       // setupCircle()
        worldView{
            position(400, 400).scale(20)
            addBody()
        }
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

    fun WorldView.addBody(){
        val k = Kreis2(0.0,15.0, radius = 2F, fillColor = Colors.GREEN)

       createBody {
           type = k.type
           setPosition(k.x, k.y)
       }.fixture {
           shape = k.shape
           density = k.density
           friction = k.friction
       }.setView(
               graphics{
                   fillStroke(Context2d.Color(Colors.BLUE), Context2d.Color(Colors.RED), Context2d.StrokeInfo(thickness = 30.0)) {
                       circle(k.x, k.y, k.radius)
                       //rect(0, 0, 400, 20)
                   }
                   fill(k.fillColor) {
                       circle(k.x, k.y, k.radius)
                   }
                   scale(1f / 100f)
               }
       )

    }

    fun registerCanvasElement(canvasElement: CanvasElement){
    //        println("DEPRECATED/ÜBERHOLT: Verwenden Sie stattdessen registerElement()" )
        views.add(canvasElement)
    }

    /*fun registerElement(view : View){
        views.add(view)
    }*/



}
