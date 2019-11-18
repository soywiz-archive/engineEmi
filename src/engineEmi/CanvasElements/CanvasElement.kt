package engineEmi


import com.soywiz.korge.view.*
import com.soywiz.korim.color.*
import kotlin.math.cos
import kotlin.math.sin

abstract class CanvasElement(
                               x : Double,
                               y : Double
                             ) : Container(){

    init {
        super.x = x
        super.y = y
    }

    var posX = x
    set(value){
        Log.log("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen x" )
        x = posX
        field = value
    }
    var posY = y
        set(value){
            Log.log("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen y" )
            y = posY
            field = value
        }

    var fillStyle = ""
    get() {
       Log.log("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen fillColor" )
        return field
    }
    set(value) {
        field = value
        Log.log("DEPRECATED/ÜBERHOLT: " + ::fillStyle.name + ". Verwenden Sie stattdessen fillColor" )
    }
    var strokeStyle = ""
        get() {
            Log.log("DEPRECATED/ÜBERHOLT: " + ::strokeStyle.name + ". Verwenden Sie stattdessen strokeColor" )
            return field
        }
        set(value) {
            field = value
            Log.log("DEPRECATED/ÜBERHOLT: " + ::strokeStyle.name + ". Verwenden Sie stattdessen strokeColor" )
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
