package engineEmi.CanvasElements

import com.soywiz.korge.view.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*

/**
 * Lässt ein Bild anzeigen.
 * @property bildDatei Dateiname des Bildes (ggf. mit Pfadangabe). Wurzel ist das "resoures" Verzeichnis
 * @property skalierung Skaliert das Bild um den angegebenen Faktor
 * @constructor
 */
open class Bild(x: Number = 100.0,
                y: Number = 100.0,
                var bildDatei: String,
                var skalierung: Float = 1.0f
) : CanvasElement(x = x, y = y) {


    init {
        updateGraphics()
    }

    final override fun updateGraphics() {
    }


    override suspend fun prepareElement() {
        super.prepareElement()
        image(resourcesVfs[bildDatei].readBitmap()) {
            position(x, y)
        }.scale(skalierung)

    }
}
