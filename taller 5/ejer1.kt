package Taller05

fun siglo(list: MutableList<Int>): Triple<Int, Int, Double>{
    var sigloPasado = 0
    var estesiglo = 0
    var suma = 0.0
    for (i in list){
        if (i <20){
            estesiglo++
            suma += i
        }
        else{
            sigloPasado++
            suma+= i
        }
    }
    var prom = suma / list.size
    return Triple(sigloPasado,estesiglo,prom)
}

fun main() {
    var lista: MutableList<Int> = mutableListOf()
    print("Ingrese la edad: ")
    var edad = readLine()!!.toInt()
    while (edad>0){
        print("Ingrese la edad: ")
        edad = readLine()!!.toInt()
        lista.add(edad)
    }
    var (sigloPasado, esteSiglo, promedio) = siglo(lista)
    println("Hay $sigloPasado estudiantes del siglo pasado ")
    println("Hay $esteSiglo estudiantes de este siglo ")
    println("El promedio de las edades es: $promedio")
}