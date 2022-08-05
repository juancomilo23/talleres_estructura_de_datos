package Solucio_taller_2

import kotlin.math.sin

fun escalera(x:Double,a:Double):Double{
    var y=x/ sin(a)
    return y
}

fun main(){
    print("Ingrese la altura de la escalera recostada: ")
    val x= readln()!!.toDouble()
    print("ingrese el angulo de la escalera: ")
    val a= readln()!!.toDouble()
    println("la altura de la escalera es: ${escalera(x,a)} metros")
}