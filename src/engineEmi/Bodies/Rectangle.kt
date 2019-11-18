package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korim.vector.*
import com.soywiz.korma.geom.vector.*
import org.jbox2d.dynamics.*

class Rectangle(x: Double = 0.0,
                y: Double = 0.0,
                width: Double = 0.0,
                height: Double = 0.0,
                var bodyType: BodyType = BodyType.STATIC,
                var fillColor: RGBA,
                var strokeColor: RGBA = Colors.BLUE,
                var strokeThickness: Double = 0.0
) : Ebody(x = x, y = y) {

    var shape = BoxShape(width, height)
    var density = 0.0F
    var friction = 0.0F
    var bodyDef = bodyDef {
        type = bodyType
        setPosition(x, y)
    }


    var view = Graphics().apply {

        fillStroke(Context2d.Color(strokeColor), Context2d.Color(strokeColor), Context2d.StrokeInfo(thickness = strokeThickness)) {
            rect(x, y, width, height)
            //rect(0, 0, 400, 20)

        }
        fill(fillColor) {
            rect(x, y, width, height)
        }

    }.scale(1f / 100f)


    lateinit var body: Body


    override fun initBody() {
        this.body = world.createBody(bodyDef).fixture {
            shape = this@Rectangle.shape
            density = this@Rectangle.density
            friction = this@Rectangle.friction
        }.setView(view)
    }

    override fun animate() {

    }
}



