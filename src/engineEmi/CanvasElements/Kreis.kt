package engineEmi.CanvasElements

import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*


open class Kreis(radius: Number = 10.0,
                 x: Number = 100.0,
                 y: Number = 100.0,
                 fuellFarbe: RGBA = Colors.GREEN,
                 randFarbe: RGBA = Colors.RED
) : CanvasElement(x = x, y = y) {


    var radius: Number = radius
        set(value) {
            field = value; updateGraphics()
        }

    var fillColor: RGBA = fuellFarbe
        set(value) {
            field = value; updateGraphics()
        }

    var strokeColor: RGBA = randFarbe
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
