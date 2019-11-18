package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import org.jbox2d.common.*
import org.jbox2d.dynamics.*

class Rectangle(x: Number = 0,
                y: Number = 0,
                var width: Number = 0,
                var height: Number = 0,
                bodyType: BodyType = BodyType.STATIC,
                var fillColor: RGBA,
                var density: Float = 1f,
                var friction: Float = 0.2f,
                var strokeColor: RGBA = Colors.BLUE,
                var strokeThickness: Double = 0.0
) : Ebody(x = x, y = y) {

    private val shape = BoxShape(width = width, height = height)
    private val bd = BodyDef()
    private var fixture = FixtureDef()

    override lateinit var body: Body

    init {
        fixture.density = density
        fixture.shape = this@Rectangle.shape
        fixture.friction = this@Rectangle.friction
    }

    /**
     * Bei der Erstellung des Bodies ist die world noch nicht bekannt. Diese wird erst beim erzeugen des Korge
     * Objekts erstellt. Nach dem die Welt erstellt ist, wird initBody() aufgerufen, um das Body Objekt
     * fertig zu initialiseren
     *
     */
    override fun initBody() {
        body = world.createBody(bd)
        body.createFixture(fixture)
        body.setTransform(Vec2(x.toFloat(), y.toFloat()), angle = 0f)
        body.setViewWithContainer(SolidRect(width, height, fillColor).position(x, y))
        println(body.position)
    }

    override fun animate() {
    }

}



