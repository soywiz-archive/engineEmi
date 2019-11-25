# Changelog

## 0.11 alpha 2019-11-25 
### Added
- Property skalierung bei Bild hinzugefügt. Nun kann ein Bild einfach auf die korrekte Größe skaliert werden (0.5 -> 50%, ...)
- `Image` Klasse bei den Bodies. Zeigt Bilder anstatt Geometrische Formen an.

### Issues
- Spawning multiple `Images` throws an exception (see [https://github.com/korlibs/korge/issues/45#issuecomment-558140737](https://github.com/korlibs/korge/issues/45#issuecomment-558140737) )

## 0.1 alpha 2019-11-22 
Testbranch umbenannt in dev. Die Implementierung von box2d und der korge engine wird nun priorisiert.
### Added
- Alle CanvasElements besitzen nun deutsche Namen und Propertiebezeichnungen, was die Abgrenzung zu den Bodies erleichtert
- Alle CanvasElements und Bodies können nun mit Zahlenwerten vom Typ `Number` initialisiert werden (kein Double, Int, Float mehr notwendig.) 