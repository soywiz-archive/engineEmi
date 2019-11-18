package engineEmi

import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*


open class Kreis(radius: Double = 10.0,
                 x: Double = 100.0,
                 y: Double = 100.0,
                 fillColor: RGBA = Colors.GREEN,
                 strokeColor: RGBA = Colors.RED
) : CanvasElement(x = x, y = y) {


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

    init {
        updateGraphics()
    }


    final override fun updateGraphics() {
        graphics.apply {
            clear()
            fill(fillColor) {
                circle(x, y, radius)
            }
        }
    }

    override suspend fun animate() {
        super.animate()
        this.x++
        this.y++
    }
}
