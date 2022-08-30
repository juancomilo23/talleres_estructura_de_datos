package Taller05

import kotlin.math.sqrt

fun distancia(x:Double,y:Double): Double = sqrt((x*x)+(y*y))

fun cuadrante(x: Double, y:Double):Int{
    var c : Int
    when {
        x>0.0 && y>0 -> c = 1
        x<0.0 && y>0 -> c = 2
        x<0.0 && y<0 -> c = 3
        x>0.0 && y<0 -> c = 4
        else -> c = 0
    }
    return c
}

fun info(lista: MutableList<Pair<Double,Double>>): Triple<Pair<Double,Double>, Double,Int>{
    var a : Double = 0.0
    var b : Double = 0.0
    var d : Double = 0.0
    var c : Int =0
    for ((x,y) in lista){
        if (distancia(x,y)>d ){
            d = distancia(x,y)
            a=x
            b=y
            c= cuadrante(a,b)
        }
    }
    return Triple(Pair(a,b),d,c)
}

fun main(){
    var N : Int
    print("Ingrese el número de puntos: ")
    N = readLine()!!.toInt()
    var x : Double
    var y : Double
    var lista : MutableList<Pair<Double,Double>> = mutableListOf()
    repeat(N){
        print("Ingrese la coordenada x: ")
        x = readLine()!!.toDouble()
        print("Ingrese la coordenada y: ")
        y = readLine()!!.toDouble()

        lista.add(Pair(x,y))
    }
    val (coor, dist, cuadran) = info(lista)
    println("El punto es $coor, tiene la mayor distancia al origen: $dist, y se encuentra en el" +
            " cuadrante # $cuadran")
}
