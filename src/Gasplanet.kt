import com.soywiz.korim.color.*

class Gasplanet(umlaufbahn: Umlaufbahn,
                farbe : RGBA,
                radius : Int,
                var radiusGasHülle : Int = 0) : Planet(umlaufbahn = umlaufbahn, farbe = farbe, radius = radius)