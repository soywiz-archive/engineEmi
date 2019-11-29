package engineEmi.CanvasElements

import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*

/**
 * Zeichnet ein Rechteck
 * @property x X-Koordinate der linken oberen Ecke des Rechtecks
 * @property y Y-Koordinate der linken oberen Ecke des Rechtecks
 * @property höhe Höhe des Rechtecks
 * @property breite Breite des Rechtecks
 * @property fuellFarbe Füllfarbe. Colors-Objekt
 * @property randFarbe Randfarbe. Colors-Objekt
 * @constructor
 */
open class Rechteck(höhe: Number = 0.0,
                    breite: Number = 0.0,
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
        super.width = breite.toDouble()
        super.height = höhe.toDouble()
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

