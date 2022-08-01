package taller1

/*
Entradas
Base-->Doble-->base
Altura-->Doble--> atura
salids
area-->Doble-->area
 */


fun area_trinagulo(base:Double,altura:Double):Double{
    return (base * altura) / 2
}
//funcion principal
fun main() {
    print("ingrese base: ")
    var b= readLine()!!.toDouble()
    print("ingrese altura: ")
    var a= readLine()!!.toDouble()
    println("el area es: ${area_trinagulo(b,a)}")
}

