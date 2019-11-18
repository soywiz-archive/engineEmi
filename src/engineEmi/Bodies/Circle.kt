package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korim.vector.*
import com.soywiz.korma.geom.vector.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*

class Circle(x: Double = 0.0,
             y: Double = 0.0,
             var bodyType : BodyType = BodyType.STATIC,
             var radius : Float,
             var fillColor : RGBA,
             var strokeColor : RGBA = Colors.BLUE,
             var strokeThickness: Double = 0.0,
             private var density: Float = 0.0F,
             private var friction: Float = 0.0F
           ) : Ebody(x = x, y = y) {

    var shape = CircleShape().apply { m_radius = radius }
    var bodyDef = bodyDef {
        type = bodyType
        setPosition(x, y)
    }


    var view = Graphics().apply {

        fillStroke(Context2d.Color(strokeColor), Context2d.Color(strokeColor), Context2d.StrokeInfo(thickness = strokeThickness)) {
                circle(x, y, radius)
                //rect(0, 0, 400, 20)

        }
        fill(fillColor) {
            circle(x, y, radius)
        }

    }.scale(1f / 100f)



    lateinit var body : Body


    override fun initBody() {
        this.body = world.createBody(bodyDef).fixture {
            shape = this@Circle.shape
            density = this@Circle.density
            friction = this@Circle.friction
        }.setView(view)
    }

    override fun animate(){
        //  body.linearVelocity = Vec2(1F, 10F)
    }
}



