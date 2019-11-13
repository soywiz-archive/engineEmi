package engineEmi

import org.w3c.dom.CanvasRenderingContext2D
import kotlin.browser.window

@JsName("$")
 external fun jq(selector: String): dynamic


object Engine{
    val canvas = Canvas().init()
    val context = canvas.getContext("2d") as CanvasRenderingContext2D
    val height = canvas.height.toDouble()
    val width = canvas.width.toDouble()

    var canvasElements = mutableListOf<CanvasElement>()


    fun main() {
        jq("document").ready {
            window.requestAnimationFrame { draw() }
        }
    }

    /**
     * Die eigentliche Zeichenmethode
     *
     */
    fun draw() {
        clearContext()
        drawAllCanvasElements()
        updateAllCanvasElements()
        Animations.run()
        window.requestAnimationFrame { draw() }
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
    fun clearContext(){
        context.clearRect(0.0, 0.0, width, height)
        context.beginPath()
    }

}
