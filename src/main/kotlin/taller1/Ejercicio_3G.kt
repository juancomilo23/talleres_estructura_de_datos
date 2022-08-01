package taller1

/*
?Entrada
*Metros cuadrados por pintar-->Int-->Mp
*costo x metro cuadrado-->Double-->cmc
!Salida
*Total cobro pintura-->Double-->tcp
 */

fun pinturas(Mp:Int,cmc:Double):Double{
    var tcp=cmc*Mp
    return tcp
}

fun main(){
    print("¿Cuantos metros cuadrados se van a pintar ?: ")
    val Mp= readLine()!!.toInt()
    print("costo por metro cuadrado: ")
    val cmc= readLine()!!.toDouble()
    println("el costo total de la pintura es de ${pinturas(Mp, cmc)} mil pesos ")
}