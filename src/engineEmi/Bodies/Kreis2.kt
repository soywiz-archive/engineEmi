package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import com.soywiz.korim.vector.*
import com.soywiz.korma.geom.vector.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*

class Kreis2(x : Double,
             y : Double,
             var type : BodyType = BodyType.STATIC,
             var radius : Float,
             var fillColor : RGBA,
             var strokeColor : RGBA = Colors.GREEN,
             var strokeThickness : Double = 0.0 ) : Ebody(x = x, y = y) {

    var shape = CircleShape().apply { m_radius = radius }
    var density = 0.0F
    var friction = 0.0F



    var fixture = FixtureDef().apply {


        shape = CircleShape().apply { m_radius = radius }
        density = 0.0F
        friction = 0.0F
    }

    var view = Graphics().apply {
            fill(fillColor) {
                circle(x, y, radius)
            }
            if (strokeColor != null){
                fillStroke(Context2d.Color(strokeColor!!), Context2d.Color(strokeColor!!), Context2d.StrokeInfo(thickness = strokeThickness)) {
                    circle(x, y, radius)
                    //rect(0, 0, 400, 20)
                }
            }
        }.scale(1f/100f)
}



