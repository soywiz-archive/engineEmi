[engineEmi](../../index.md) / [engineEmi.CanvasElements](../index.md) / [CanvasElement](index.md) / [animate](./animate.md)

# animate

`open suspend fun animate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Muss in Subklassen überschrieben werden, falls man das Objekt animieren will.
Wird im default ca. 60 Mal pro Sekunde aufgerufen.
Änderungen der Parameter wie etwa x und y werden so direkt angezeigt, wenn man sie überschreibt.
Alternativ kann man auch bestehenden Objekten neue Animationen zuweisen. Die geht etwa mit Hilfe von [animate](./animate.md)

`open suspend fun animate(animationRoutine: () -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Bekommt eine animationsRoutine als Lamba, dass Objekte auch nachträglich mit Animationen bestückt werden können

### Parameters

`animationRoutine` - Enthält die Anweisungen, welche die Parameter (etwa x und y Koordinaten für eine Bewegung) verändern.