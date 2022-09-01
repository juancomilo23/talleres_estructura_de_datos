package Solucion_taller_6

import kotlin.math.PI
import kotlin.math.sqrt

class pendulo{
    private var l:Double=0.0
    private var a:Double=0.0
    constructor() //primario
    constructor(l: Double, a: Double) {
        this.l = l
        this.a = a
    }
    //analizadores get
    fun getlongitud()=this.l
    fun getaceleracion()=this.a
    //modificadores set
    fun setl(nuevo:Double){
        if(nuevo!=0.0){
            this.l=nuevo
        }
    }
    fun seta(nuevo_a:Double){
        if(nuevo_a!=0.0){
            this.a=nuevo_a
        }
    }
    //metodos
    fun periodo_oscilacion()=2*PI *sqrt(this.a/this.l)
}

data class Pendulo2(
    private var l:Double=0.0,
    private var a:Double=0.0
){
    //metodos
    fun periodo_oscilacion()=2* PI* sqrt(this.a/this.l)
}

fun main() {
    var x = pendulo()
    var opc: Int
    do {
        println("0.salir\n1.crear\n2.imprimir\n3.Calcular periodo de oscilacion")
        print("escoja una opcion")
        opc = readLine()!!.toInt()
        when (opc) {
            1 -> {
                print("longitud: ")
                val longitud = readLine()!!.toDouble()
                print("Aceleracion: ")
                val aceleracion = readLine()!!.toDouble()
                x = pendulo(longitud, aceleracion)
            }
            2 -> {
                println("la longitud es de ${x.getlongitud()} y la aceleracion ${x.getaceleracion()}")
            }

            3 -> {
                println("el periodo de aceleracion: ${x.periodo_oscilacion()}")
            }
        }
    }
    while (opc!=0)
}