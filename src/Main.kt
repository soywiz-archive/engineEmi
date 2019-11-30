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
    Engine.run()
}

