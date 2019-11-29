[engineEmi](../../index.md) / [engineEmi.Bodies](../index.md) / [Rectangle](./index.md)

# Rectangle

`class Rectangle : `[`Ebody`](../-ebody/index.md)

Erzeugt einen [Ebody](../-ebody/index.md) mit einer rechteckigen Form.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Rectangle(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, width: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, height: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, bodyType: BodyType = BodyType.STATIC, fillColor: RGBA, angle: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0f, density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f, friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.2f, restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.0f, strokeColor: RGBA = Colors.BLUE, strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = 0.0)` |

### Properties

| Name | Summary |
|---|---|
| [angle](angle.md) | Drehwinkel in Radiant`var angle: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [fillColor](fill-color.md) | Füllfarbe. Ist ein Colors Objekt`var fillColor: RGBA` |
| [height](height.md) | Höhe`var height: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [shape](shape.md) | shape, bd und fixture müssen in den Subklassen überschrieben werden -&gt; s. Box2D body`val shape: PolygonShape` |
| [strokeColor](stroke-color.md) | Randfarbe Ist ein Colors Objekt`var strokeColor: RGBA` |
| [strokeThickness](stroke-thickness.md) | Randbreite`var strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [width](width.md) | Breite`var width: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |

### Functions

| Name | Summary |
|---|---|
| [createView](create-view.md) | Erzeugt den eigentlichen View`suspend fun createView(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [writeInfo](write-info.md) | `fun writeInfo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
