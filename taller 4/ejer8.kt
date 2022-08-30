package Taller05

fun areatriangulo(b:Double, h: Double): Double = (b*h)/2

fun mayora(lista :MutableList<Triple<String, Double, Double>>): String{
    var trimayora = 0.0
    var nombremayora = ""
    for ((nombre, base, altura) in lista){
        var area = areatriangulo(base,altura)
        if (area >trimayora){
            trimayora = area
            nombremayora = nombre
        }
    }
    return nombremayora
}

fun areanombre(lista :MutableList<Triple<String, Double, Double>>, nombre2:String): Double{
    for ((nombre, base, altura) in lista){
        if (nombre==nombre2){
            return areatriangulo(base, altura)
        }
    }
    return -1.0
}

fun main(){
    var lista : MutableList<Triple<String,Double,Double>> = mutableListOf()
    var N : Int
    print("Ingrese el número de triéngulos: ")
    N = readLine()!!.toInt()
    print("Ingrese el nombre del triángulo que busca: ")
    var nombre2 = readLine()!!
    repeat(N){
        print("Ingrese el nombre: ")
        var nombre = readLine()!!
        print("Ingrese la base:  ")
        var base = readLine()!!.toDouble()
        print("Ingrese la altura: ")
        var altura = readLine()!!.toDouble()
        lista.add(Triple(nombre,base,altura))
    }
    println("El nombre del triángulo con mayor área en la lista es: ${mayora(lista)}")
    println("El área es de ${areanombre(lista,nombre2)}")
}