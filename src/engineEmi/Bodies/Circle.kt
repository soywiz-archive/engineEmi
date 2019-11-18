
package engineEmi.Bodies

import com.soywiz.korim.color.*
import org.jbox2d.collision.shapes.*
import org.jbox2d.dynamics.*

class Circle(x: Number = 0,
             y: Number = 0,
             bodyType: BodyType = BodyType.STATIC,
             var radius : Float,
             var fillColor : RGBA,
             var strokeColor : RGBA = Colors.BLUE,
             var strokeThickness: Double = 0.0,
             private var density: Float = 0.0F,
             private var friction: Float = 0.0F
) : Ebody(x = x, y = y) {


    private val shape = CircleShape().apply { m_radius = radius }
    private val bd = BodyDef()
    private var fixture = FixtureDef()

    override lateinit var body: Body

    init {
        fixture.density = density
        fixture.shape = this@Circle.shape
        fixture.friction = this@Circle.friction
    }

    /**
     * Bei der Erstellung des Bodies ist die world noch nicht bekannt. Diese wird erst beim erzeugen des Korge
     * Objekts erstellt. Nach dem die Welt erstellt ist, wird initBody() aufgerufen, um das Body Objekt
     * fertig zu initialiseren
     *
     */
    override fun initBody() {
        body = Body(bd, world)
        body.createFixture(fixture)
    }

    override fun animate() {

    }
    }




