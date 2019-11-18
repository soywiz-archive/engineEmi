package engineEmi

import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*


open class Rechteck(height: Double = 0.0,
                    width: Double = 0.0,
                    x: Double = 0.0,
                    y: Double = 0.0,
                    fillColor: RGBA = Colors.GREEN,
                    strokeColor: RGBA = Colors.RED
) : CanvasElement(x = x, y = y) {


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
        super.width = width
        super.height = height
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

