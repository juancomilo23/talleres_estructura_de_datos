package taller1

/*
?Entrada
*Costo por hora-->Double-->Cph
*Horas Parqueadas-->Int-->Horas
!Salida
* Total pago-->Double-->total
 */
fun parqueadero(Cph:Double,Horas:Int): Double {
    var total=Cph*Horas
    return total
}
fun main(){
    print("ingrese el costo or hora: ")
    val Cph= readln()!!.toDouble()
    print("ingrese las horas que estubo en el parqueadero: ")
    val Horas= readln()!!.toInt()
    println("el costo total del paqueadero es: ${parqueadero(Cph, Horas)} mil pesos")
}