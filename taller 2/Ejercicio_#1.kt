package Solucio_taller_2

fun algebra(x:Int,y:Int):Int{
    var f=(x*2)-(2*x*y)+(2*y)
    return f
}

fun main(){
    print("Ingrese el valor de x: ")
    val x= readln()!!.toInt()
    print("Ingrese el valor de y: ")
    val y= readln()!!.toInt()
    println("El resultado de la funcion es: ${algebra(x,y)}")
}