package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import org.jbox2d.dynamics.*

abstract class Ebody(
            var x : Double,
            var y : Double

          //  var type : BodyType = BodyType.STATIC
            ) {
    lateinit var world : World

    fun initForWorld(world: World){
        this.world = world
        initBody()
    }

    abstract fun initBody()

    abstract fun animate()

}