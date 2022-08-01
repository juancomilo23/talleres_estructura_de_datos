package taller1

import javax.swing.text.html.HTML.Tag.I




/*
Entradas
* Valor de alquiler --> double-->valoralquiler
* Numero_estudientes-->int-->numero_estudiantes
salidas
! numero_bicicletas-->int-->numero_bicicletas
! valor_total_alquiler-->double-->total_alquiler
 */
fun valor_bicicleta(valoralquiler:Double,numero_estudiantes:Int):Pair<Int,Double> {
    val numero_bicicletas=numero_estudiantes/2
    val total_alquiler=numero_bicicletas*valoralquiler
    return Pair(numero_bicicletas,total_alquiler)
}

fun main(){
    print ("ingrese valor alquiler: ")
    var v= readLine()!!.toDouble()
    print("ingrese numero de estudiantes: ")
    var n= readLine()!!.toInt()
    var primera= valor_bicicleta(v,n).first
    var segunda= valor_bicicleta(v,n).second
    println("El numero de bicicletas es: ${primera} el valor a pagar es: ${segunda}")


}