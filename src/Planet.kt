import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.CanvasElements.*

abstract class Planet (var umlaufbahn: Umlaufbahn,
              var farbe : RGBA,
              radius : Int) : Kreis(fuellFarbe = farbe, radius = radius){

    override suspend fun animate() {
        x = Engine.view.width/2.0
        y = Engine.view.height/2.0
    }
}