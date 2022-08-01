package taller1

/*
!Entrada
*precio articulo-->Double-->pa
!Salida
*precio con descuento-->Double-->pd
*precio final-->Double-->pf
 */

fun tienda(pa:Double):Pair<Double,Double>{
    var Descuento=pa*0.05
    var pd=pa-Descuento
    var iva=pd*0.19
    var pf=pd+iva
    return Pair(pd,pf)
}

fun main(){
    print("Ingrese el valor del producto: ")
    val pa= readLine()!!.toDouble()
    val primera= tienda(pa).first
    val segunda= tienda(pa).second
    println("el valor con escuento es de: ${primera} mil pesos y el valor total con el iva es de: ${segunda} mil pesos.")
}
