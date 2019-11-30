import com.soywiz.korim.color.*

class Gasplanet(umlaufbahn: Umlaufbahn,
                farbe : RGBA,
                radius : Int,
                 dickeHuelle : Int = 3,
                 farbeHuelle : RGBA = Colors.BROWN) : Planet(umlaufbahn = umlaufbahn, farbe = farbe, radius = radius, dickeHuelle = dickeHuelle, farbeHuelle = farbeHuelle)