package engineEmi.CanvasElements

import com.soywiz.korge.view.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*


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
