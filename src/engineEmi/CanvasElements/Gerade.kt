
package engineEmi.CanvasElements

import com.soywiz.korim.color.*
import com.soywiz.korim.vector.*

/**
 * @property x X-Koordinate des Ursprungs der Geraden (Standard-Koordinatensystem)
 * @property y Y-Koordinate des Ursprungs der Geraden (Standard-Koordinatensystem)
 * @property toX X-Koordinate des Ziels der Geraden (Standard-Koordinatensystem))
 * @property toY Y-Koordinate des Ziels der Geraden (Standard-Koordinatensystem)
 * @property dicke Dicke der Geraden
 * @property fuellFarbe Füllfarbe als Colors Objekt
 * @property randFarbe Randfarbe als Colors Objekt
 * @constructor
 */
open class Gerade(var toX: Number = 0.0,
                  var toY: Number = 0.0,
                  x: Number = 0.0,
                  y: Number = 0.0,
                  var dicke: Number = 10,
                  fuellFarbe: RGBA = Colors.GREEN,
                  randFarbe: RGBA = Colors.GREEN) : CanvasElement(x = x, y = y) {

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
            fillStroke(Context2d.Color(fillColor), Context2d.Color(fillColor), Context2d.StrokeInfo(thickness = dicke.toDouble())) { moveTo(x, y); lineTo(x + toX.toDouble(), y + toY.toDouble()) }
        }
    }
}




