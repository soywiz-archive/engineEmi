[engineEmi](../../index.md) / [engineEmi.CanvasElements](../index.md) / [AnimierterKreis](./index.md)

# AnimierterKreis

`class AnimierterKreis : `[`Kreis`](../-kreis/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AnimierterKreis()` |

### Functions

| Name | Summary |
|---|---|
| [animate](animate.md) | Muss in Subklassen überschrieben werden, falls man das Objekt animieren will. Wird im default ca. 60 Mal pro Sekunde aufgerufen. Änderungen der Parameter wie etwa x und y werden so direkt angezeigt, wenn man sie überschreibt. Alternativ kann man auch bestehenden Objekten neue Animationen zuweisen. Die geht etwa mit Hilfe von [animate](../-canvas-element/animate.md)`suspend fun animate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
