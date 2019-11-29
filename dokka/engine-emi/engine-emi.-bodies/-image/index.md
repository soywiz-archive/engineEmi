[engineEmi](../../index.md) / [engineEmi.Bodies](../index.md) / [Image](./index.md)

# Image

`class Image : `[`Ebody`](../-ebody/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Image(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 0, bodyType: BodyType = BodyType.STATIC, width: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 1, height: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 1, angle: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0f, imageFile: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "hut.png", density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f, friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.2f, restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0.0f, strokeColor: RGBA = Colors.BLUE, strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = 0.0, scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f / 100f, preInitializedBitmap: Bitmap? = null)` |

### Properties

| Name | Summary |
|---|---|
| [height](height.md) | `var height: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [image](image.md) | `lateinit var image: Bitmap` |
| [imageFile](image-file.md) | `val imageFile: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [preInitializedBitmap](pre-initialized-bitmap.md) | `val preInitializedBitmap: Bitmap?` |
| [scale](scale.md) | `var scale: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [shape](shape.md) | shape, bd und fixture müssen in den Subklassen überschrieben werden -&gt; s. Box2D body`var shape: PolygonShape` |
| [strokeColor](stroke-color.md) | `var strokeColor: RGBA` |
| [strokeThickness](stroke-thickness.md) | `var strokeThickness: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [width](width.md) | `var width: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |

### Functions

| Name | Summary |
|---|---|
| [createView](create-view.md) | Überschreiben! Erzeugt den konkreten View und legt ihn in der Property view an. Siehe Beispiele in [Circle](../-circle/index.md) oder [Rectangle](../-rectangle/index.md)`suspend fun createView(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [initBody](init-body.md) | Bei der Erstellung des Bodies ist die World noch nicht bekannt. Diese wird erst beim Erzeugen des Korge Objekts erstellt. Nach dem die Welt erstellt ist, wird [initBody](../-ebody/init-body.md) aufgerufen, um das EBody-Objekt fertig zu initialiseren`suspend fun initBody(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [writeInfo](write-info.md) | `fun writeInfo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
