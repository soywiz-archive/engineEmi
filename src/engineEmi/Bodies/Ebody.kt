package engineEmi.Bodies

import org.jbox2d.dynamics.*

abstract class Ebody(
        var x: Number,
        var y: Number) {

    lateinit var world : World
    abstract var body: Body

    open fun initForWorld(world: World) {
        this.world = world
        initBody()
    }

    abstract fun initBody()
    abstract fun animate()


}