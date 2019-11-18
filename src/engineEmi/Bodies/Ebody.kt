package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import org.jbox2d.dynamics.*

abstract class Ebody(
            var x : Double,
            var y : Double
          //  var type : BodyType = BodyType.STATIC
            ) {

    var bodyDef = BodyDef().apply {
        type = BodyType.STATIC
        setPosition(x,y)
    }

}