[engineEmi](../../index.md) / [engineEmi.CanvasElements](../index.md) / [Kreis](./index.md)

# Kreis

`open class Kreis : `[`CanvasElement`](../-canvas-element/index.md)

Zeichnet einen Kreis

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Kreis(radius: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 10.0, x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 100.0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 100.0, fuellFarbe: RGBA = Colors.GREEN, randFarbe: RGBA = Colors.RED)` |

### Properties

| Name | Summary |
|---|---|
| [fuellFarbe](fuell-farbe.md) | Füllfarbe als Colors-Objekt`var fuellFarbe: RGBA` |
| [radius](radius.md) | Radius`var radius: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [randFarbe](rand-farbe.md) | Randfarbe als Colors-Objekt`var randFarbe: RGBA` |

### Functions

| Name | Summary |
|---|---|
| [updateGraphics](update-graphics.md) | Zeichnet das Objekt. Siehe Implementierung von [Kreis](./index.md) oder [Rechteck](../-rechteck/index.md) für Beispiele`fun updateGraphics(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [AnimierterKreis](../-animierter-kreis/index.md) | `class AnimierterKreis : `[`Kreis`](./index.md) |
