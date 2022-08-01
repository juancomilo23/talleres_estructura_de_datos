package taller1

import kotlin.math.pow
/*
?entradas
?cantidad dinero-->int-->C
?tasa de interes-->Double-->i
?cantidad años-->Double-->n
!salida
!dinero invertido-->Int-->Vp
 */
fun dinero_invertido(C:Int,i:Double,n:Double):Int {
    val Vp= (C / (1+i)).pow (n)
    return Vp.toInt()
}
 fun main(){
     print("ingrese la cantidad de dinero: ")
     val C= readLine()!!.toInt()
     print("ingrese la tasa de interes: ")
     val i= readLine()!!.toDouble()
     print("ingrese la cantidad de años: ")
     val n= readLine()!!.toDouble()
     println("el dinero invertido es de ${dinero_invertido(C,i,n)}")
 }
