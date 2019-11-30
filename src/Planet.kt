import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.CanvasElements.*
import kotlin.math.*

abstract class Planet(var umlaufbahn: Umlaufbahn,
                      var farbe: RGBA,
                      var farbeHuelle: RGBA = farbe,
                       var dickeHuelle : Int = 0,
              radius : Int) : Kreis(fuellFarbe = farbe, radius = radius, randFarbe = farbeHuelle, randDicke = dickeHuelle){


    override suspend fun animate() {
        super.animate()
        val mittelPunktSonnenSystemHorizontal = Engine.view.width / 2.0
        val mittelPunktSonnenSystemVertikal = Engine.view.height / 2.0

        x = mittelPunktSonnenSystemHorizontal + cos(umlaufbahn.winkel % (2 * PI)) * umlaufbahn.radius
        y = mittelPunktSonnenSystemVertikal + sin(umlaufbahn.winkel % (2 * PI)) * umlaufbahn.radius
        umlaufbahn.winkel = umlaufbahn.umlaufGeschwindigkeit + umlaufbahn.winkel
    }

}