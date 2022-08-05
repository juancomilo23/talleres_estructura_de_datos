package Solucio_taller_2

fun sueldo(sueldo:Double): Triple<Double, Double, Double> {
    var a=sueldo*0.4
    var c=sueldo*0.15
    var f=sueldo-a-c
    return Triple(a,c,f)
}

fun main(){
    print("ingrese el suelo de la personas: ")
    val s= readln()!!.toDouble()
    val primera= sueldo(s).first
    val segunda=sueldo(s).second
    val tercera= sueldo(s).third
    println("la persona gasta en arriendo ${primera} pesos y en comida ${segunda} pesos y al final le queda ${tercera} pesos")
}