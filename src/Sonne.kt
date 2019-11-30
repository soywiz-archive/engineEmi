import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.CanvasElements.*

class Stern(radius : Int) : Kreis(fuellFarbe = Colors.YELLOW, radius = radius) {

    override suspend fun animate() {
        super.animate()
        x = Engine.view.width/2.0
        y = Engine.view.height/2.0
    }
}