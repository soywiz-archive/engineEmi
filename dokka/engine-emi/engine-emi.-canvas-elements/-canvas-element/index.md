[engineEmi](../../index.md) / [engineEmi.CanvasElements](../index.md) / [CanvasElement](./index.md)

# CanvasElement

`abstract class CanvasElement : Container`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CanvasElement(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [animationRoutine](animation-routine.md) | Hier werden die Animationsbefehle gespeichert.`var animationRoutine: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [graphics](graphics.md) | Autoskalierender Vektor-&gt;Bitmap Wandler`val graphics: Graphics` |

### Functions

| Name | Summary |
|---|---|
| [animate](animate.md) | Muss in Subklassen überschrieben werden, falls man das Objekt animieren will. Wird im default ca. 60 Mal pro Sekunde aufgerufen. Änderungen der Parameter wie etwa x und y werden so direkt angezeigt, wenn man sie überschreibt. Alternativ kann man auch bestehenden Objekten neue Animationen zuweisen. Die geht etwa mit Hilfe von [animate](animate.md)`open suspend fun animate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Bekommt eine animationsRoutine als Lamba, dass Objekte auch nachträglich mit Animationen bestückt werden können`open suspend fun animate(animationRoutine: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [prepareElement](prepare-element.md) | Bereite das Element vor (wird in Subklassen überschrieben). Siehe Implementierung von [Kreis](../-kreis/index.md) oder [Rechteck](../-rechteck/index.md) für Beispiele`open suspend fun prepareElement(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateGraphics](update-graphics.md) | Zeichnet das Objekt. Siehe Implementierung von [Kreis](../-kreis/index.md) oder [Rechteck](../-rechteck/index.md) für Beispiele`abstract fun updateGraphics(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [Bild](../-bild/index.md) | Lässt ein Bild anzeigen.`open class Bild : `[`CanvasElement`](./index.md) |
| [Gerade](../-gerade/index.md) | `open class Gerade : `[`CanvasElement`](./index.md) |
| [Kreis](../-kreis/index.md) | Zeichnet einen Kreis`open class Kreis : `[`CanvasElement`](./index.md) |
| [Rechteck](../-rechteck/index.md) | Zeichnet ein Rechteck`open class Rechteck : `[`CanvasElement`](./index.md) |
