package engineEmi.CanvasElements

import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*

/**
 * Zeichnet einen Kreis
 * @property radius Radius
 * @property x X-Koordiante des Mittelpunkts (Standard-Koordinatensystem)
 * @property y Y-Koordiante des Mittelpunkts (Standard-Koordinatensystem)
 * @property fuellFarbe Füllfarbe als Colors Objekt
 * @property randFarbe Randfarbe als Colors Objekt
 * @constructor
 */
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
}
