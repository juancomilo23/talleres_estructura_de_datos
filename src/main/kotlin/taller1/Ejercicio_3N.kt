package taller1

/*
?entrada
*cantidad de computadores-->Double-->n
?Salida
*cantidad de cables-->Double-->cdc
 */
 fun computo(n: Double):Double{
     var cdc=n*((n-1)/2)
    return cdc
 }

fun main(){
    print("ingrse la cantidad de computadores: ")
    val n= readln()!!.toDouble()
    println("los cables a comprar son ${computo(n)} ")
}