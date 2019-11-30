import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.CanvasElements.*

abstract class Planet (var umlaufbahn: Umlaufbahn,
              var farbe : RGBA,
              radius : Int) : Kreis(fuellFarbe = farbe, radius = radius, randFarbe = farbe){


}