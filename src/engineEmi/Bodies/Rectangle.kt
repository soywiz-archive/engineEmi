package engineEmi.Bodies

import com.soywiz.korge.box2d.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import org.jbox2d.dynamics.*

class Rectangle(x: Number = 0,
                y: Number = 0,
                var width: Number = 0,
                var height: Number = 0,
                bodyType: BodyType = BodyType.STATIC,
                var fillColor: RGBA,
                var angle: Float = 0f,
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
        bd.type = bodyType
        bd.setPosition(x, y)
        bd.angle = angle
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
        val view = SolidRect(width, height, fillColor)
        view.position(x, y)
        view.apply { onOver { writeInfo() } }
        body.setView(view)

    }

    override fun animate() {
        writeInfo()
    }

    fun writeInfo() {
        println("Body: ${this.body.position.x}, ${this.body.position.y}")
        println("View: ${this.body.view!!.x}, ${this.body.view!!.y}")
    }



}



