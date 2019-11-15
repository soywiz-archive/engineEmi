package engineEmi


import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import kotlin.math.cos
import kotlin.math.sin

abstract class CanvasElement(  posX : Double,
                               posY : Double
                             ) : Container(){

    init {
        x = posX
        y = posY
    }

    var posX = posX
    set(value){
        x = posX
        field = value
    }
    var posY = posY
        set(value){
            y = posY
            field = value
        }

    var fillStyle = ""
    get() {
       println("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen fillColor" )
        return field
    }
    set(value) {
        field = value
        println("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen fillColor" )
    }
    var strokeStyle = ""
        get() {
            println("DEPRECATED/ÜBERHOLT: " + ::strokeStyle.name + ". Verwenden Sie stattdessen strokeColor" )
            return field
        }
        set(value) {
            field = value
            println("DEPRECATED/ÜBERHOLT: " + ::strokeStyle.name + ". Verwenden Sie stattdessen strokeColor" )
        }

    open fun animate(){

    }

    val centerX: Double
        get() {
            return width / 2 + posX
        }

    val centerY: Double
        get() {
            return height / 2 + posY
        }

}
