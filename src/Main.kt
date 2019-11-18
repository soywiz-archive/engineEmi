import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*
import engineEmi.*
import engineEmi.CanvasElements.*

suspend fun main() {

   // val circle = Circle(radius = 32.0)
    //val meinKreis = Kreis(x = 100.0, y = 100.0, radius = 20.0, fillColor = Colors.LIGHTCORAL)
    val meinRechteck = Rechteck(100.0, 100.0, x = 100.0, y = 100.0, fillColor = Colors.GREEN)
    val meineGerade = Gerade(100.0, 200.0, 10.0, 10.0)
    val meinBild = Bild(100.0, 200.0, "korge.png")
    //Engine.registerCanvasElement(meinKreis)
    Engine.registerCanvasElement(meineGerade)
    Engine.registerCanvasElement(meinRechteck)
    Engine.registerCanvasElement(meinBild)

   // Engine.registerCanvasElement(circle)
    //val k = Circle(0.0,0.0, radius = 200F, fillColor = Colors.DARKCYAN, bodyType = BodyType.KINEMATIC)
    //val k2 = Circle(0.0,0.0, radius = 200F, fillColor = Colors.YELLOW, bodyType = BodyType.KINEMATIC)
    //Engine.registerBody(k)
    //Engine.registerBody(k2)
    Engine.main()


}


class Circle(radius: Double = 16.0, color: RGBA = Colors.GREEN) : Container() {
    var radius: Double = radius
        set(value) {
            field = value; updateGraphics()
        }

    var color: RGBA = color
        set(value) {
            field = value; updateGraphics()
        }



    val graphics = graphics {
    }

    init {
        updateGraphics()
    }

    private fun updateGraphics() {
        graphics.apply {
            clear()
            fill(color) {
                circle(0.0, 0.0, radius)
            }
        }
    }





}