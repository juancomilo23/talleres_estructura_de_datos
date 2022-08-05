package Solucio_taller_2

fun main(){
    print("ingrese el nombre de la persona 1: ")
    var p1= readLine()!!.toString()
    print("ingrese el edad de la persona 1: ")
    var pe1= readLine()!!.toInt()
    print("ingrese el nombre de la persona 2: ")
    var p2= readLine()!!.toString()
    print("ingrese el edad de la persona 2: ")
    var pe2= readLine()!!.toInt()
    print("ingrese el nombre de la persona 3: ")
    var p3= readLine()!!.toString()
    print("ingrese el edad de la persona 3: ")
    var pe3= readLine()!!.toInt()
    if (pe1 >= pe2 && pe1 >= pe3) {
        println("la persona de mayor edad es ${p1} y su edad es ${pe1}")
    } else if (pe2 >= pe1 && pe2 >= pe3) {
        println("la persona de mayor edad es ${p2} y su edad es ${pe2}")
    } else if (pe3 >= pe1 && pe3 >= pe2) {
        println("la persona de mayor edad es ${p3} y su edad es ${pe3}")
    } else {
        println("todos tiene la mima edad")
    }

}

private operator fun Boolean.compareTo(pe3: Int): Int {

    return TODO("Provide the return value")
}