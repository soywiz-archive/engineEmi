[engineEmi](../../index.md) / [engineEmi.Bodies](../index.md) / [Ebody](./index.md)

# Ebody

`abstract class Ebody`

Wrapper-Klasse für box2d Body. Ebodies beinhalten einen Body (Das Objekt, auf welchem die physikalischen Simulationen ausgeführt werden. Sie können leichter instanziiert werden und besitzen nebem dem Body sowohl eine Fixture, als auch eine Shape

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Wrapper-Klasse für box2d Body. Ebodies beinhalten einen Body (Das Objekt, auf welchem die physikalischen Simulationen ausgeführt werden. Sie können leichter instanziiert werden und besitzen nebem dem Body sowohl eine Fixture, als auch eine Shape`Ebody(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, bodyType: BodyType)` |

### Properties

| Name | Summary |
|---|---|
| [bd](bd.md) | `val bd: BodyDef` |
| [body](body.md) | `lateinit var body: Body` |
| [bodyType](body-type.md) | Der BodyType. Kann versch. Werte annehmen BodyType.STATIC für unbewegliche (statische Objekte), BodyType.DYNAMIC für beweglice Objekte, welche nach den Gesetzen der Physik interagieren, BodyType.KINEMATIC] für Objekte, die sich unter Nutzerkontroll bewegen dürfen`var bodyType: BodyType` |
| [density](density.md) | Dichte (Masse im Vergleich zur Umgebung)`var density: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [fixture](fixture.md) | `var fixture: FixtureDef` |
| [friction](friction.md) | Reibungskoeffizient geg. anderen Ebody-Objekten`var friction: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [restitution](restitution.md) | Restitution: So etwas wie Weichheit bzw. "Bounciness"`var restitution: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [shape](shape.md) | shape, bd und fixture müssen in den Subklassen überschrieben werden -&gt; s. Box2D body`abstract val shape: Shape` |
| [view](view.md) | `lateinit var view: View` |
| [world](world.md) | `lateinit var world: World` |
| [x](x.md) | X-Koordinate (Achtung: Box2D-Koordinatensystem!)`var x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |
| [y](y.md) | Y-Koordinate (Achtung: Box2D-Koordinatensystem!)`var y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html) |

### Functions

| Name | Summary |
|---|---|
| [createBodyAttachToFixture](create-body-attach-to-fixture.md) | FÜgt Body und Fixture zusammen`open fun createBodyAttachToFixture(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [createFixture](create-fixture.md) | Erzeugt die Fixture.`open fun createFixture(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [createView](create-view.md) | Überschreiben! Erzeugt den konkreten View und legt ihn in der Property view an. Siehe Beispiele in [Circle](../-circle/index.md) oder [Rectangle](../-rectangle/index.md)`abstract suspend fun createView(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [initBody](init-body.md) | Bei der Erstellung des Bodies ist die World noch nicht bekannt. Diese wird erst beim Erzeugen des Korge Objekts erstellt. Nach dem die Welt erstellt ist, wird [initBody](init-body.md) aufgerufen, um das EBody-Objekt fertig zu initialiseren`open suspend fun initBody(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [initForWorld](init-for-world.md) | Initialisiert den Ebody mit der (Box2D)-World der Engine`open suspend fun initForWorld(world: World): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setup](setup.md) | Erzeugt die Fixture und fügt Body und Fixture zusammen`fun setup(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [Circle](../-circle/index.md) | `class Circle : `[`Ebody`](./index.md) |
| [Image](../-image/index.md) | `class Image : `[`Ebody`](./index.md) |
| [Line](../-line/index.md) | `class Line : `[`Ebody`](./index.md) |
| [Rectangle](../-rectangle/index.md) | Erzeugt einen [Ebody](./index.md) mit einer rechteckigen Form.`class Rectangle : `[`Ebody`](./index.md) |
