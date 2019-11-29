package engineEmi.CanvasElements


import com.soywiz.korge.view.*


abstract class CanvasElement(
        x: Number,
        y: Number) : Container() {

    init {
        super.x = x.toDouble()
        super.y = y.toDouble()
    }

    /**
     * Autoskalierender Vektor->Bitmap Wandler
     */
    val graphics = sgraphics {
    }

    /**
     * Hier werden die Animationsbefehle gespeichert.
     */
    var animationRoutine: () -> Any = {}

    /**
     * Muss in Subklassen überschrieben werden, falls man das Objekt animieren will.
     * Wird im default ca. 60 Mal pro Sekunde aufgerufen.
     * Änderungen der Parameter wie etwa x und y werden so direkt angezeigt, wenn man sie überschreibt.
     * Alternativ kann man auch bestehenden Objekten neue Animationen zuweisen. Die geht etwa mit Hilfe von [animate(animationsRoutine)]
     */
    open suspend fun animate() {
        animationRoutine()
    }

    /**
     * Bekommt eine animationsRoutine als Lamba, dass Objekte auch nachträglich mit Animationen bestückt werden können
     * @param animationRoutine Enthält die Anweisungen, welche die Parameter (etwa x und y Koordinaten für eine Bewegung) verändern.
     */
    open suspend fun animate(animationRoutine: () -> Any) {
        this.animationRoutine = animationRoutine
    }

    /**
     * Bereite das Element vor (wird in Subklassen überschrieben).
     * Siehe Implementierung von [Kreis] oder [Rechteck] für Beispiele
     */
    open suspend fun prepareElement() {}

    /**
     * Zeichnet das Objekt. Siehe Implementierung von [Kreis] oder [Rechteck] für Beispiele
     */
    abstract fun updateGraphics()
}
