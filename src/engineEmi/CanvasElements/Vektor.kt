package engineEmi

import kotlin.math.PI

class Vector(var angle : Double, var speed : Double) {
    var angleRad = 0.0
    init {
        angleRad = angle * PI / 180
    }

    constructor(angle : Int, speed : Int) : this(angle.toDouble(), speed.toDouble())

    fun invert() : Vector = Vector(-angle, speed)
}