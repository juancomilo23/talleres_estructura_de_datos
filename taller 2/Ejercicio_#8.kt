package Solucio_taller_2

fun edificio(T:Int,E:Int,S:Int):Pair<Int,Int>{
    var Salones=T/E
    var Pisos=Salones/S
    return Pair(Salones,Pisos)
}

fun main(){
    print("Ingrese la cantidad de estudientes: ")
    val T= readLine()!!.toInt()
    print("Ingrese los salones por piso: ")
    val S= readLine()!!.toInt()
    print("ingrese los estudientes por salon: ")
    val E= readLine()!!.toInt()
    println("la cantidad de salones y pisos son: ${edificio(T,E,S)}")
}
