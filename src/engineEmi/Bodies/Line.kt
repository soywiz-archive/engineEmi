package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korim.vector.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.common.*
import org.jbox2d.dynamics.*

class Line(x: Number = 0,
           y: Number = 0,
           var toX: Number = 0,
           var toY: Number = 0,
           bodyType: BodyType = BodyType.STATIC,
           var fillColor: RGBA,
           var thickness: Number = 1.0,
           density: Float = 1f,
           friction: Float = 0.2f,
           restitution: Float = 0.0f) : Ebody(x = x, y = y, density = density, friction = friction, restitution = restitution, bodyType = bodyType) {

    override val shape = EdgeShape().apply {
        set(Vec2(x.toFloat(), y.toFloat()), Vec2(toX.toFloat(), toY.toFloat()))
    }


    init {
        setup()
    }

    override suspend fun createView() {
        //view = SolidRect(toX.toInt()-x.toInt(), 1, fillColor).apply { anchor(.5,.5) }
        view = Graphics().apply { fillStroke(Context2d.Color(fillColor), Context2d.Color(fillColor), Context2d.StrokeInfo(thickness = thickness.toDouble())) { moveTo(x, y); lineTo(x + toX.toDouble(), y + toY.toDouble()) } }.scale(1f, 1f / 100f)
        view.apply {
            onOver {
                writeInfo()
            }
        }


    }

    fun writeInfo() {
        println("Body: ${this.body.position.x}, ${this.body.position.y}")
        println("View: ${this.body.view!!.x}, ${this.body.view!!.y}")
    }
}