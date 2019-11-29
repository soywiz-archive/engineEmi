[engineEmi](../../index.md) / [engineEmi](../index.md) / [Engine](./index.md)

# Engine

`object Engine`

Die Game-Engine. Sie ist ein Singleton und wird mit [Engine.run](run.md) gestartet.

### Properties

| Name | Summary |
|---|---|
| [bodies](bodies.md) | Alle registrieten Objekte des Typs [Ebody](../../engine-emi.-bodies/-ebody/index.md)`var bodies: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`Ebody`](../../engine-emi.-bodies/-ebody/index.md)`>` |
| [canvasElements](canvas-elements.md) | Alle registrieten Objekte vom Typ [CanvasElement](../../engine-emi.-canvas-elements/-canvas-element/index.md)`var canvasElements: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`CanvasElement`](../../engine-emi.-canvas-elements/-canvas-element/index.md)`>` |
| [showCoords](show-coords.md) | `var showCoords: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [view](view.md) | `var view: `[`MyView`](../-my-view/index.md) |
| [viewHeight](view-height.md) | `var viewHeight: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [viewWidth](view-width.md) | `var viewWidth: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

### Functions

| Name | Summary |
|---|---|
| [main](main.md) | `suspend fun main(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [register](register.md) | Registriert einen [Ebody](../../engine-emi.-bodies/-ebody/index.md) oder ein [CanvasElement](../../engine-emi.-canvas-elements/-canvas-element/index.md) bei der Engine`fun register(o: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [registerBody](register-body.md) | Registriert einen [Ebody](../../engine-emi.-bodies/-ebody/index.md) bei der Engine (Physikobjekte)`fun registerBody(body: `[`Ebody`](../../engine-emi.-bodies/-ebody/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [registerBodyWithWorld](register-body-with-world.md) | `suspend fun WorldView.registerBodyWithWorld(body: `[`Ebody`](../../engine-emi.-bodies/-ebody/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [registerCanvasElement](register-canvas-element.md) | Registriert ein [CanvasElement](../../engine-emi.-canvas-elements/-canvas-element/index.md) bei der Engine (reguläre Objekte)`fun registerCanvasElement(canvasElement: `[`CanvasElement`](../../engine-emi.-canvas-elements/-canvas-element/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [run](run.md) | Startet die Engine. Kann Parameter zur Konfiguration übernehmen`suspend fun run(showCoords: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
