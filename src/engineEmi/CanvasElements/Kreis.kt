
package engineEmi

import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*


open class Kreis(radius : Double = 10.0,
                 x : Double = 100.0,
                 y : Double = 100.0,
                 fillColor : RGBA = Colors.GREEN,
                 strokeColor : RGBA = Colors.RED
                 ) : CanvasElement(x = x, y = y){

    var radius: Double = radius
        set(value) {
            field = value; updateGraphics()
        }

    var fillColor: RGBA = fillColor
        set(value) {
            field = value; updateGraphics()
        }

    var strokeColor: RGBA = strokeColor
        set(value) {
            field = value; updateGraphics()
        }

    val graphics = graphics {
    }

    init{
        updateGraphics()
    }

    private fun updateGraphics() {
        graphics.apply {
            clear()
            fill(fillColor) {
                circle(x, y, radius)
            }
        }
    }

    override fun animate() {
        super.animate()
        this.x++
        this.y++
    }
}
