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

    var canvasElements = mutableListOf<CanvasElement>()


    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "My Awesome Box2D Game!") {
        setupCircle()
    }

    fun Stage.setupCircle() {
        val circle = Circle(radius = 32.0)
        addChild(circle)
        launch {
            while (true) {
                circle.x++
                circle.y++

                delay(16.milliseconds)
            }
        }
    }

    class Circle(radius: Double = 16.0, color: RGBA = Colors.WHITE) : Container() {
        var radius: Double = radius
            set(value) {
                field = value; updateGraphics()
            }

        var color: RGBA = color
            set(value) {
                field = value; updateGraphics()
            }

        val graphics = graphics {
        }

        init {
            updateGraphics()
        }

        private fun updateGraphics() {
            graphics.apply {
                clear()
                fill(color) {
                    circle(0.0, 0.0, radius)
                }
            }
        }






        /**
         * Registriert die CanvasElemente bei der Engine so dass sie bekannt werden
         *
         * @param canvasElement
         */
        fun registerCanvasElement(canvasElement: CanvasElement) {
            canvasElements.add(canvasElement)
        }

        /**
         * Registriert alle CanvasElements einer Collection
         *
         * @param elements
         */
        fun registerCanvasElements(elements: Collection<CanvasElement>) {
            elements.map { canvasElements.add(it) }
        }
/*

        */
/**
         * Ruft drawOnContext(context) für alle registrierten CanvasElements auf
         *
         *//*

        fun drawAllCanvasElements() {
            canvasElements.map { it.drawOnContext() }
        }

        fun updateAllCanvasElements() {
            canvasElements.map { it.frameDidRender() }
        }
*/

        /**
         * Cleared den Context, um z.B. ein neues Frame in der Animation zu zeichnen
         *
         */

    }
}
