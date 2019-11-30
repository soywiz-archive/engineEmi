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


    var erde = Planet(Umlaufbahn(), Colors.BLUE, 30)

    Engine.register(erde)

    Engine.run()



}

