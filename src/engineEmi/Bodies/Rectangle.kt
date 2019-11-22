package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import org.jbox2d.dynamics.*

class Rectangle(x: Number = 0,
                y: Number = 0,
                var width: Number = 0,
                var height: Number = 0,
                bodyType: BodyType = BodyType.STATIC,
                var fillColor: RGBA,
                var angle: Float = 0f,
                density: Float = 1f,
                friction: Float = 0.2f,
                restitution: Float = 0.0f,
                var strokeColor: RGBA = Colors.BLUE,
                var strokeThickness: Double = 0.0
) : Ebody(x = x, y = y, density = density, friction = friction, restitution = restitution, bodyType = bodyType
) {

    override val shape = BoxShape(width = width, height = height)


    init {
        setup()
        bd.angle = angle
    }

    /**
     * Erzeugt den eigentlichen View
     */

    override fun createView() {
        view = SolidRect(width, height, fillColor).apply { anchor(.5, .5) }
        view.apply {
            onOver {
                //writeInfo()
            }
        }
    }

    fun writeInfo() {
        println("Body: ${this.body.position.x}, ${this.body.position.y}")
        println("View: ${this.body.view!!.x}, ${this.body.view!!.y}")
    }
}



