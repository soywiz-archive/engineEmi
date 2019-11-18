package engineEmi


import com.soywiz.korge.view.*

abstract class CanvasElement(
                               x : Double,
                               y : Double
                             ) : Container(){

    init {
        super.x = x
        super.y = y
    }


    val graphics = graphics {
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

    open suspend fun animate() {}

    open suspend fun prepareElement() {}

    val centerX: Double
        get() {
            return width / 2 + posX
        }

    val centerY: Double
        get() {
            return height / 2 + posY
        }

    abstract fun updateGraphics()
}
