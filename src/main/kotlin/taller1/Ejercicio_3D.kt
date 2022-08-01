package taller1

/*
?modemado de la funcion
!Entradas
!pesos colombianos -->Int-->colo
*Salidas
*Cantidad dolares-->Int-->dolares
*/

fun dolarescol(colo:Int):Int{
    val dolares=colo/4289
    return dolares
}

fun main(){
    print("Digite los pesos colombianos: ")
    val colo= readln()!!.toInt()
    println("la contidad de dolares es: ${dolarescol(colo)} ")
}

