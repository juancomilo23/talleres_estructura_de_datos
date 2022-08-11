package Solucion_taller_3

fun divisores(num:Int): Int{
    var divi = 0
    for (i in 1..num){
        if (num%i==0){
            divi++
        }
    }
    return divi
}

fun main(){
    val num : Int
    print("Ingrese un número entero positivo: ")
    num = readLine()!!.toInt()
    println("La cantidad de divisores de $num es de ${divisores(num)}")
}