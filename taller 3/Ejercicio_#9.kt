package Solucion_taller_3

fun factorial(num:Int): Int{
    var facto : Int = 1
    for (i in 1..num){
        facto *=i
    }
    return facto
}

fun main(){
    var num : Int
    print("Ingrese el número entero positivo: ")
    num = readLine()!!.toInt()
    for (i in 1..num){
        println(factorial(i))
    }
}