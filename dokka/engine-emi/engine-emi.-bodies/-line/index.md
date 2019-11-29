[engineEmi](../../index.md) / [engineEmi.Bodies](../index.md) / [Line](./index.md)

# Line

`class Line : `[`Ebody`](../-ebody/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Line(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, toX: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, toY: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, bodyType: BodyType = BodyType.STATIC, fillColor: RGBA, thickness: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 1.0, density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f, friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.2f, restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.0f)` |

### Properties

| Name | Summary |
|---|---|
| [fillColor](fill-color.md) | `var fillColor: RGBA` |
| [shape](shape.md) | shape, bd und fixture müssen in den Subklassen überschrieben werden -&gt; s. Box2D body`val shape: EdgeShape` |
| [thickness](thickness.md) | `var thickness: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [toX](to-x.md) | `var toX: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [toY](to-y.md) | `var toY: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |

### Functions

| Name | Summary |
|---|---|
| [createView](create-view.md) | Überschreiben! Erzeugt den konkreten View und legt ihn in der Property view an. Siehe Beispiele in [Circle](../-circle/index.md) oder [Rectangle](../-rectangle/index.md)`suspend fun createView(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [writeInfo](write-info.md) | `fun writeInfo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
