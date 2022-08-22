package Taller05

fun alturas(lista: MutableList<Double>, num: Double): Int{
    var cont = 0
    for (i in lista ){
        if (i<num){
            cont++
        }
    }
    return cont.toInt()
}

fun promedio(lista: MutableList<Double>): Double{
    var suma : Double = 0.0
    for (i in lista){
        suma+=i
    }
    var prom = suma / lista.size
    return prom
}

fun main(){
    var lista : MutableList<Double> = mutableListOf()
    print("Ingrese la altura: ")
    var altura = readLine()!!.toDouble()
    while (altura in 0.0..3.0){
        print("Ingrese la altura: ")
        altura = readLine()!!.toDouble()
        lista.add(altura)
    }
    var prom = promedio(lista)
    var alt = alturas(lista,prom)
    println("El promedio de altura es de: $prom y la cantidad de alturas" +
            " por debajo de del promedio es: $alt")
}
