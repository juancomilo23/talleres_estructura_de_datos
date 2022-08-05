package Solucio_taller_2

import java.lang.Math.pow

import kotlin.math.sqrt

fun Area_rectangulo(b:Double,c:Double):Double=b*c
fun Hipotenusa(a:Double, b:Double, c:Double):Double= sqrt(pow(a-c,2.0)+pow(b,2.0))
fun Area_triangulo(a:Double,b:Double,c:Double):Double=((a-c)*b)/2


fun main(){
    print("Ingrese el lado a: ")
    val a= readLine()!!.toDouble()
    print("Ingrese el lado b : ")
    val b= readLine()!!.toDouble()
    print("Ingrese el lado c : ")
    val c= readLine()!!.toDouble()
    println ("esta es la Hipotenusa: ${Hipotenusa(a,b,c)}")
    println("al area del rectagulo es ${Area_rectangulo(b,c)}")
    println("al area del rectagulo es ${Area_triangulo(a,b,c)}")
    var perimetro=a+b+c+ Hipotenusa(a,b,c)
    var area_total= Area_rectangulo(b,c)+ Area_triangulo(a,b,c)
    println("el perimetro de la figura es ${perimetro}")
    println("el perimetro de la figura es ${area_total}")
}