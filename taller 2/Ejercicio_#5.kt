package Solucio_taller_2

import kotlin.math.PI
import kotlin.math.pow

fun RadioP(r:Double):Double{
    var a= PI*(r.pow(2))
    return a
}
fun RadioG(R:Double):Double{
    var A= PI*(R.pow(2))
    return A
}


fun main(){
    print("Ingrese el radio del circulo pequeño: ")
    val r= readLine()!!.toDouble()
    print("Ingrese el radio del circulo grande: ")
    val R= readLine()!!.toDouble()
    var Final= RadioG(R)- RadioP(r)
    println("El area de la corona circular es: ${Final}" )
}

