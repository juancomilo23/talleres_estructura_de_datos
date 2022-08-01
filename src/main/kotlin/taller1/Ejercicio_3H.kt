package taller1

/*
?Entrada
*Distancia que va a rrecorer-->Int-->D
*Velocidad a la que va-->Int-->V
!Salida
*Tiempo de recorrido-->Double-->T
 */

fun viaje(D:Int,V:Int):Int{
    var T=D/V
    return T
}
 fun main(){
     print("Ingrese la distancia recorrida en Km: ")
     val D= readLine()!!.toInt()
     print("Ingrese la velocidad en km/H: ")
     val V= readLine()!!.toInt()
     println("el tiempo requerido en ir a cirta ciudad es de ${viaje(D,V)}")
 }
