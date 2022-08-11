package Solucion_taller_3

fun main(){
    var n : Int

    print("Hasta que número deseas hallar la suma: ")
    n = readLine()!!.toInt()

    var suma = 0
    var i = 1
    repeat(n){
        suma += i
        println("$i : $suma")
        i++
    }
}