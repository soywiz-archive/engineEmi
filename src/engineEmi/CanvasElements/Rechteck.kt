package engineEmi.CanvasElements

import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*


open class Rechteck(height: Number = 0.0,
                    width: Number = 0.0,
                    x: Number = 0.0,
                    y: Number = 0.0,
                    fuellFarbe: RGBA = Colors.GREEN,
                    randFarbe: RGBA = Colors.RED
) : CanvasElement(x = x, y = y) {


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
        super.width = width.toDouble()
        super.height = height.toDouble()
    }

    final override fun updateGraphics() {
        graphics {
            clear()
            fill(fillColor) {
                rect(-x, -y, width, height)
            }
            position(x, y)
        }
    }
}

