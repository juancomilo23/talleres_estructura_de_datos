package Solucion_taller_3

fun perfectNum(num : Int): Boolean = diviso(num)==num

fun main(){
    var num : Int
    print("Ingrese un número entero positivo: ")
    num = readLine()!!.toInt()
    var cont = 0
    for (i in 1..num){
        if ((perfectNum(i))==true){
            println("$i es perfecto")
            cont++
        }
    }
    print("La cantidad de números pefectos de 1 a $num es de: $cont")
}