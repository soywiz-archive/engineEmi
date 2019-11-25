package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korma.geom.vector.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*

class Circle(x: Number = 0,
             y: Number = 0,
             var radius: Number = 0,
             bodyType: BodyType = BodyType.STATIC,
             var fillColor: RGBA,
             angle: Float = 0f,
             density: Float = 1f,
             friction: Float = 0.2f,
             restitution: Float = 0.0f,
             var strokeColor: RGBA = Colors.BLUE,
             var strokeThickness: Double = 0.0
) : Ebody(x = x, y = y, density = density, friction = friction, restitution = restitution, bodyType = bodyType
) {

    override val shape = CircleShape().apply { m_radius = radius.toFloat() }

    init {
        setup()
        bd.angle = angle
    }

    /**
     * Erzeugt den eigentlichen View
     */

    override suspend fun createView() {

        view = Graphics().apply { fill(fillColor) { circle(x, y, radius.toFloat() * 100) } }.scale(1f / 100f)

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



