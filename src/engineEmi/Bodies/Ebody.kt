package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*

abstract class Ebody(
        var x: Number,
        var y: Number,
        var density: Float,
        var friction: Float,
        var restitution: Float,
        var bodyType: BodyType) {


    /**
     * shape, bd und fixture müssen in den Subklassen überschrieben werden
     * -> s. Box2D body
     */
    abstract val shape: Shape
    val bd = BodyDef()
    var fixture = FixtureDef()
    lateinit var body: Body
    lateinit var view: View

    lateinit var world: World

    open fun initForWorld(world: World) {
        this.world = world
        initBody()
    }

    fun setup() {
        createFixture()
        createBodyAttachToFixture()
    }

    /**
     * Bei der Erstellung des Bodies ist die world noch nicht bekannt. Diese wird erst beim erzeugen des Korge
     * Objekts erstellt. Nach dem die Welt erstellt ist, wird initBody() aufgerufen, um das Body Objekt
     * fertig zu initialiseren
     */

    open fun initBody() {
        body = world.createBody(bd)
        body.createFixture(fixture)
        createView()
        body.setView(view)
    }

    /**
     * Überschreiben!
     * Erzeugt den konkreten View und legt ihn in der Property view an
     */
    abstract fun createView()

    open fun createFixture() {
        fixture.density = density
        fixture.shape = shape
        fixture.friction = friction
        fixture.restitution = restitution
    }

    open fun createBodyAttachToFixture() {
        bd.type = bodyType
        bd.setPosition(x, y)
    }


}