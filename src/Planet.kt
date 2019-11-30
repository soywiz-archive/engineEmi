import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.CanvasElements.*

abstract class Planet (var umlaufbahn: Umlaufbahn,
              var farbe : RGBA,
                       var farbeHuelle : RGBA = farbe,
                       var dickeHuelle : Int = 0,
              radius : Int) : Kreis(fuellFarbe = farbe, radius = radius, randFarbe = farbeHuelle, randDicke = dickeHuelle){


}