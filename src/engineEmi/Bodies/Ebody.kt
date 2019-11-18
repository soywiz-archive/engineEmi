package engineEmi.Bodies

import org.jbox2d.dynamics.*

abstract class Ebody(
        var x : Double,
        var y: Double,
        var bodyType: BodyType

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