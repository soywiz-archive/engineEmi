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

    var fuellFarbe: RGBA = fuellFarbe
        set(value) {
            field = value; updateGraphics()
        }

    var randFarbe: RGBA = randFarbe
        set(value) {
            field = value; updateGraphics()
        }

    init {
        updateGraphics()
    }


    final override fun updateGraphics() {
        graphics.apply {
            clear()
            fill(fuellFarbe) {
                circle(x, y, radius)
            }
        }
    }
}

class AnimierterKreis : Kreis() {
    override suspend fun animate() {
        super.animate()
        x++
        y++
    }
}