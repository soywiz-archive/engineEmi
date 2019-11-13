package engineEmi

import org.w3c.dom.CanvasRenderingContext2D
import kotlin.math.cos
import kotlin.math.sin

abstract class CanvasElement(
        var posX: Double = 0.0,
        var posY: Double = 0.0,
        var fillStyle: String = "",
        var strokeStyle: String = "",
        var shadowColor: String = "",
        var shadowBlur: String = "",
        var shadowOffsetX: Double = 0.0,
        var shadowOffsetY: Double = 0.0,
        var context: CanvasRenderingContext2D? = null) {

    abstract val width : Double
    abstract val height : Double

    val centerX : Double
        get (){
            return width/2+posX
        }

    val centerY : Double
        get(){
            return height/2+posY
        }

    constructor(posX: Double, posY: Double) : this() {
        this.posX = posX
        this.posY = posY
    }

    fun prepareContext() {
        this.context?.beginPath()
    }

    fun finishDrawingOn() {
        this.context?.fillStyle = this.fillStyle
        this.context?.strokeStyle = this.strokeStyle
        this.context?.shadowColor = shadowColor
        this.context?.save()
        this.context?.stroke()
        this.context?.fill()
    }

    fun drawOnContext(){
        prepareContext()
        callConcreteDrawMethod()
        finishDrawingOn()
    }

    fun moveWithVector(vector : Vector){
        posX+= cos(vector.angleRad)*vector.speed
        posY+= sin(vector.angleRad)*vector.speed
    }

    /**
     * Has to be overwritten inside the subclasses.
     * will call the actual draw function which differs from Subclass to subclass.
     * e.g. for Kreis
     * context?.arc(posX, this.posY, this.radius,0.0,2 * kotlin.math.PI)
     * e.g for rect
     * context?.rect(posX, this.posY, this.height, this.width)
     */
    abstract fun callConcreteDrawMethod()

    /**
     * Is called on each rendered frame
     *
     */
    open fun animate(){
        context?.beginPath()
    }

    /**
     * Is called on each rendered frame.
     * Use it for everything reoccurring besides animation-stuff
     */
    open fun frameDidRender(){}
}