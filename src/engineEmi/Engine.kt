package engineEmi

import com.soywiz.korge.*
import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korgw.*
import com.soywiz.korim.color.*
import com.soywiz.korim.format.*
import com.soywiz.korim.vector.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.vector.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*
import kotlin.js.*


object Engine{

    var canvasElements = mutableListOf<CanvasElement>()



    suspend fun main() = Korge(quality = GameWindow.Quality.PERFORMANCE, title = "engineEmi") {
        views.clearColor = Colors.GREEN
        solidRect(300, 200, Colors.DARKCYAN)
        graphics {
            fill(Colors.DARKCYAN) {
                rect(-100, -100, 300, 200)
            }
            fill(Colors.AQUAMARINE) {
                circle(0, 0, 100)
            }
            fill(Colors.AQUAMARINE) {
                circle(100, 0, 100)
            }
            position(100, 100)
        }.interactive()
       worldView {

            position(400, 400).scale(20)

            createBody {
                setPosition(0, -10)
            }.fixture {
                shape = BoxShape(100, 20)
                density = 0f
            }.setViewWithContainer(solidRect(100, 20, Colors.RED).position(-50, -10).interactive())

            // Dynamic Body
            createBody {
                type = BodyType.DYNAMIC
                setPosition(0, 7)
            }.fixture {
                shape = BoxShape(2f, 2f)
                density = 0.5f
                friction = 0.2f
            }.setView(solidRect(2f, 2f, Colors.GREEN).anchor(.5, .5).interactive())

            createBody {
                type = BodyType.DYNAMIC
                setPosition(0.75, 13)
            }.fixture {
                shape = BoxShape(2f, 2f)
                density = 1f
                friction = 0.2f
            }.setView(graphics {
                fill(Colors.BLUE) {
                    rect(-1f, -1f, 2f, 2f)
                }
            }.interactive())

            createBody {
                type = BodyType.DYNAMIC
                setPosition(0.5, 15)
            }.fixture {
                shape = CircleShape().apply { m_radius = 2f }
                density = 22f
                friction = 3f
            }.setView(graphics {
                fillStroke(Context2d.Color(Colors.BLUE), Context2d.Color(Colors.RED), Context2d.StrokeInfo(thickness = 30.0)) {
                    circle(0, 0, 200)
                    //rect(0, 0, 400, 20)
                }
                fill(Colors.DARKCYAN) {
                    circle(100, 100, 20)
                }
                scale(1f / 100f)
            }.interactive())
        }
        image(resourcesVfs["korge.png"].readBitmap())
    }

    fun <T : View> T.interactive(): T = this.apply {
        alpha = 0.5
        onOver { alpha = 1.0 }
        onOut { alpha = 0.5 }
    }

    /**
     * Registriert die CanvasElemente bei der Engine so dass sie bekannt werden
     *
     * @param canvasElement
     */
    fun registerCanvasElement(canvasElement: CanvasElement){
        canvasElements.add(canvasElement)
    }

    /**
     * Registriert alle CanvasElements einer Collection
     *
     * @param elements
     */
    fun registerCanvasElements(elements : Collection<CanvasElement>){
        elements.map { canvasElements.add(it) }
    }

    /**
     * Ruft drawOnContext(context) für alle registrierten CanvasElements auf
     *
     */
    fun drawAllCanvasElements(){
        canvasElements.map { it.drawOnContext() }
    }

    fun updateAllCanvasElements(){
        canvasElements.map { it.frameDidRender() }
    }

    /**
     * Cleared den Context, um z.B. ein neues Frame in der Animation zu zeichnen
     *
     */

}
