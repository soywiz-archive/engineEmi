import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.Bodies.*
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

    //val k2 = Circle(0.0, 30.0, radius = 20F, density = 0.2F, fillColor = Colors.GREEN, bodyType = BodyType.DYNAMIC)

    //Engine.registerBody(k)
    //  val dach = Rectangle(x = -10.0, y = -100.0,width = 10000.0, height = 30.0, fillColor = Colors.AZURE, bodyType = BodyType.STATIC)
    // val boden = Rectangle(x = -20.0, y = 10.0, width = 200f, height = 50f, fillColor = Colors.RED, bodyType = BodyType.STATIC)
    //val dach = Rectangle(x = 0.0, y = 70.0, width = 200f, height = 10.0f, fillColor = Colors.BLUE, bodyType = BodyType.DYNAMIC)

    // val test = Rectangle(x = 400, y = 300, width = 10, height = 10, density = 1f, fillColor = Colors.RED, bodyType = BodyType.DYNAMIC)
    val boden = Rectangle(x = -0, y = 0, width = 10, height = 10, density = 1f, fillColor = Colors.BLUE, bodyType = BodyType.KINEMATIC)
    val boden2 = Rectangle(x = 30, y = 0, width = 10, height = 10, density = 1f, angle = 45f, fillColor = Colors.RED, bodyType = BodyType.KINEMATIC)
    val boden3 = Rectangle(x = 0, y = -20, width = 100, height = 1, density = 1f, angle = 0.5f, fillColor = Colors.LIGHTCORAL, bodyType = BodyType.KINEMATIC)






    repeat(100) {
        Engine.registerBody(Rectangle((-50..50).random(), (30..50).random(), restitution = 0.8f, width = 2, height = 2, density = ((0..100).random().toFloat() / (1..10).random().toFloat()), fillColor = Colors.GREEN, bodyType = BodyType.DYNAMIC))
        Engine.registerBody(Circle((-50..50).random(), (30..50).random(), 1, bodyType = BodyType.DYNAMIC, fillColor = Colors.PINK, density = 0.5f))
    }


    // Engine.registerBody(k2)

    //Engine.registerBody(test)

    // Engine.registerBody(boden)
    // Engine.registerBody(line)
    // Engine.registerBody(boden2)
    Engine.registerBody(boden3)
    Engine.registerBody(Line(0, 0, 80, 0, fillColor = Colors.AQUA, thickness = 10))
    //Engine.registerBody(test2)


    Engine.run()


}

