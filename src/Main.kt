import engineEmi.Engine
import engineEmi.Kreis

fun main(){
    val meinKreis = Kreis(posX = 100.0, posY = 100.0 , fillStyle = "blue", radius = 100.0, context = Engine.context)
    Engine.registerCanvasElement(meinKreis)
    Engine.main()
    // test
}