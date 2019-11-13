import engineEmi.Engine
import engineEmi.Kreis

fun main(){
    var meinKreis = Kreis(posX = 100.0, posY = 100.0 , fillStyle = "red", radius = 100.0, context = Engine.context)
    Engine.registerCanvasElement(meinKreis)
    Engine.main()
}