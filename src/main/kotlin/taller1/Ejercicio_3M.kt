package taller1

import kotlin.math.PI
import kotlin.math.pow

/*
!Entradas
*Radio-->double-->R
*Altura-->Double-->H
!salidas
*Volumen-->Double-->V
 */

fun volumen(R:Double,H:Double):Double{
    var V=(0.333*Math.PI)* R.pow(2.0) *H
    return V
}

fun main(){
    print("ingrese el radio del cono: ")
    val R= readLine()!!.toDouble()
    print("ingrese la altura del cono: ")
    val H= readLine()!!.toDouble()
    println("el volumen del cono es ${volumen(R,H)}.")
}