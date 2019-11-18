import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*
import engineEmi.*
import engineEmi.Bodies.*
import engineEmi.Bodies.Circle
import engineEmi.CanvasElements.*
import org.jbox2d.dynamics.*


suspend fun main() {

   // val circle = Circle(radius = 32.0)
    //val meinKreis = Kreis(x = 100.0, y = 100.0, radius = 20.0, fillColor = Colors.LIGHTCORAL)
    val meinRechteck = Rechteck(100.0, 100.0, x = 100.0, y = 100.0, fillColor = Colors.GREEN)
    val meineGerade = Gerade(100.0, 200.0, 10.0, 10.0)
    // val meinBild = Bild(100.0, 200.0, "korge.png")
    //Engine.registerCanvasElement(meinKreis)
    //Engine.registerCanvasElement(meineGerade)
    //  Engine.registerCanvasElement(meinRechteck)
    //Engine.registerCanvasElement(meinBild)

   // Engine.registerCanvasElement(circle)

    val k2 = Circle(0.0, 3.0, radius = 200F, density = 0.0F, fillColor = Colors.GREEN, bodyType = BodyType.KINEMATIC)
    //Engine.registerBody(k)
    //  val dach = Rectangle(x = -10.0, y = -100.0,width = 10000.0, height = 30.0, fillColor = Colors.AZURE, bodyType = BodyType.STATIC)
    val boden = Rectangle(x = -0.5, y = -15.0, width = 1000.0, height = 100.0, fillColor = Colors.AZURE, bodyType = BodyType.STATIC)
    val dach = Rectangle(x = -0.5, y = +15.0, width = 1000.0, height = 100.0, fillColor = Colors.AZURE, bodyType = BodyType.STATIC)

    Engine.registerBody(k2)
    Engine.registerBody(boden)
    // Engine.registerBody(dach)

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