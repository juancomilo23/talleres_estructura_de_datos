package Taller05

fun estuPerdieron(notas: MutableList<Double>): Pair<Int,Double>{
    var perdieron = 0
    var suma = 0.0
    for (i in notas) {
        suma += i
        if (i < 60) {
            perdieron++
        }
    }
    var promedio = suma / notas.size
    return Pair(perdieron, promedio)
}

fun main(){
    var N : Int
    print("Ingrese el número de estudiantes: ")
    var lista : MutableList<Double> = mutableListOf()
    N = readLine()!!.toInt()
    repeat(N){
        print("Ingrese la nota: ")
        var nota = readLine()!!.toDouble()
        lista.add(nota)
    }
    var (perdieron,promedio) = estuPerdieron(lista)
    println("El número de estudiantes que ganaron el curso es de: ${N-perdieron}")
    println("El número de estudiantes que perdieron el curso es de: $perdieron")
    println("El promedio del curso es de: $promedio")
}