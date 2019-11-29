[engineEmi](../../index.md) / [engineEmi.Bodies](../index.md) / [Circle](./index.md)

# Circle

`class Circle : `[`Ebody`](../-ebody/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Circle(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, radius: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, bodyType: BodyType = BodyType.STATIC, fillColor: RGBA, angle: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0f, density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f, friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.2f, restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.0f, strokeColor: RGBA = Colors.BLUE, strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = 0.0)` |

### Properties

| Name | Summary |
|---|---|
| [fillColor](fill-color.md) | Füllfarbe. Colors-Objekt`var fillColor: RGBA` |
| [radius](radius.md) | Radius`var radius: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [shape](shape.md) | shape, bd und fixture müssen in den Subklassen überschrieben werden -&gt; s. Box2D body`val shape: CircleShape` |
| [strokeColor](stroke-color.md) | Randfarbe. Colors-Objekt`var strokeColor: RGBA` |
| [strokeThickness](stroke-thickness.md) | Randdicke`var strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

### Functions

| Name | Summary |
|---|---|
| [createView](create-view.md) | Erzeugt den eigentlichen View`suspend fun createView(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [writeInfo](write-info.md) | `fun writeInfo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
