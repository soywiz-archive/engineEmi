[engineEmi](../../index.md) / [engineEmi.CanvasElements](../index.md) / [Bild](./index.md)

# Bild

`open class Bild : `[`CanvasElement`](../-canvas-element/index.md)

Lässt ein Bild anzeigen.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Bild(x: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 100.0, y: `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)` = 100.0, bildDatei: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, skalierung: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1.0f)` |

### Properties

| Name | Summary |
|---|---|
| [bildDatei](bild-datei.md) | Dateiname des Bildes (ggf. mit Pfadangabe). Wurzel ist das "resoures" Verzeichnis`var bildDatei: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [skalierung](skalierung.md) | Skaliert das Bild um den angegebenen Faktor`var skalierung: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |

### Functions

| Name | Summary |
|---|---|
| [prepareElement](prepare-element.md) | Bereite das Element vor (wird in Subklassen überschrieben). Siehe Implementierung von [Kreis](../-kreis/index.md) oder [Rechteck](../-rechteck/index.md) für Beispiele`open suspend fun prepareElement(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [updateGraphics](update-graphics.md) | Zeichnet das Objekt. Siehe Implementierung von [Kreis](../-kreis/index.md) oder [Rechteck](../-rechteck/index.md) für Beispiele`fun updateGraphics(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
