import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*
import engineEmi.*

suspend fun main() {

   // val circle = Circle(radius = 32.0)
    val meinKreis = Kreis(posX = 100.0, posY = 100.0, radius = 20.0, fillColor = Colors.LIGHTCORAL)
    Engine.registerCanvasElement(meinKreis)
   // Engine.registerCanvasElement(circle)
    Engine.main()

}


class Circle(radius: Double = 16.0, color: RGBA = Colors.GREEN) : Container() {
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





}