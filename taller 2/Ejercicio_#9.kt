package Solucio_taller_2

fun main(){
    print("ingrese un numero: ")
    val x= readLine()!!.toInt()
    print("ingrese un numero: ")
    val y= readLine()!!.toInt()
    if (x>y)
        println("el numero mayor es ${x}")
    else
        println("el numero mayor es ${y}")
}