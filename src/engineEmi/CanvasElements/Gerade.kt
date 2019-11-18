
package engineEmi.CanvasElements

import com.soywiz.korim.color.*
import engineEmi.*

open class Gerade(var toX: Double = 0.0,
                  var toY: Double = 0.0,
                  x: Double = 0.0,
                  y: Double = 0.0,
                  fillColor: RGBA = Colors.GREEN,
                  strokeColor: RGBA = Colors.GREEN) : CanvasElement(x = x, y = y) {

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
        super.width = toX - x
        super.height = toY - y
    }

    final override fun updateGraphics() {
        graphics.apply {
            clear()
            fill(fillColor) {
                lineTo(toX, toY)
            }
        }
    }

}

