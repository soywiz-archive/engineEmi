package engineEmi

import com.soywiz.klock.*
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.*
import com.soywiz.korma.interpolation.*


open class Bild(x: Double = 100.0,
                y: Double = 100.0,
                var imageFile: String
) : CanvasElement(x = x, y = y) {


    init {
        updateGraphics()
    }

    final override fun updateGraphics() {
    }

    override suspend fun animate() {
        super.animate()
        this.tween(
                this::rotation[(-16).degrees],
                time = 1.seconds, easing = Easing.EASE_IN_OUT
        )
        this.tween(
                this::rotation[(+16).degrees],
                time = 1.seconds, easing = Easing.EASE_IN_OUT
        )
    }

    override suspend fun prepareElement() {
        super.prepareElement()
        image(resourcesVfs[imageFile].readBitmap()) {
            position(x, y)
        }

    }
}
