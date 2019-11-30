import com.soywiz.korim.color.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import engineEmi.*
import engineEmi.Bodies.*
import engineEmi.CanvasElements.*
import org.jbox2d.dynamics.*


/**
 * Startpunkt für alle Programme.
 * Hier werden [Ebody] und [CanvasElement] Objekte bei der [Engine] registriert.
 * Hierzu kann man die Methoden [Engine.registerCanvasElement], [Engine.registerBody] und [Engine.register] verwenden.
 * Als Letzter Befehl muss immer die [Engine.run] Funktion aufgerufen werden.
 */
suspend fun main() {


    val sonne = Stern(radius = 50)

    val merkur = Gesteinsplanet(Umlaufbahn(10),Colors.ORANGE,3)
    val venus = Gesteinsplanet(Umlaufbahn(20),Colors.LIGHTCORAL,6)
    val erde = Gesteinsplanet(Umlaufbahn(30),Colors.BLUE,6)
    val mars  = Gesteinsplanet(Umlaufbahn(40),Colors.SANDYBROWN,3)
    val jupiter = Gasplanet(Umlaufbahn(78),Colors.BEIGE, 69, 5, Colors.BROWN)
    val saturn = Gasplanet(Umlaufbahn(90),Colors.CHOCOLATE, 58, 3, Colors.BROWN)
    val uranus = Gasplanet(Umlaufbahn(78),Colors.BEIGE, 25, 2, Colors.BROWN)
    val neptun = Gasplanet(Umlaufbahn(100),Colors.BLUEVIOLET, 25, 1, Colors.BROWN)

    val planeten = arrayOf(merkur, venus, erde, mars, jupiter, saturn, uranus, neptun)


    Engine.run()



}

