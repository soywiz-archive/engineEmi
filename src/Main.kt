import com.soywiz.korim.color.*
import engineEmi.*
import engineEmi.Bodies.*
import engineEmi.CanvasElements.*


/**
 * Startpunkt für alle Programme.
 * Hier werden [Ebody] und [CanvasElement] Objekte bei der [Engine] registriert.
 * Hierzu kann man die Methoden [Engine.registerCanvasElement], [Engine.registerBody] und [Engine.register] verwenden.
 * Als Letzter Befehl muss immer die [Engine.run] Funktion aufgerufen werden.
 */
suspend fun main() {


    val sonne = Stern(radius = 50)

    val merkur = Gesteinsplanet(Umlaufbahn(70), Colors.ORANGE, 3)
    val venus = Gesteinsplanet(Umlaufbahn(90), Colors.LIGHTCORAL, 6)
    val erde = Gesteinsplanet(Umlaufbahn(120), Colors.BLUE, 6)
    val mars = Gesteinsplanet(Umlaufbahn(150), Colors.SANDYBROWN, 3)
    val jupiter = Gasplanet(Umlaufbahn(180), Colors.BEIGE, 20, 5, Colors.BROWN)
    val saturn = Gasplanet(Umlaufbahn(230), Colors.CHOCOLATE, 25, 3, Colors.BROWN)
    val uranus = Gasplanet(Umlaufbahn(280), Colors.BEIGE, 17, 2, Colors.BROWN)
    val neptun = Gasplanet(Umlaufbahn(320), Colors.BLUEVIOLET, 17, 1, Colors.BROWN)

    val sonnenSystem = arrayOf(sonne, merkur, venus, erde, mars, jupiter, saturn, uranus, neptun)
    Engine.register(sonnenSystem)

    Engine.run()



}

