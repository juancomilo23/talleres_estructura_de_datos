package taller1

/*
?entrada
!# de personas-->Int-->Np
?salida
!agua contaminadax año-->Int--> aca
 */

fun bateria(Np:Int):Int{
    var aca=4*175*Np
    return aca
}

fun main(){
    print("ingrese la cantidad de personas en la ciudad: ")
    val Np= readln()!!.toInt()
    println("la cantidad de agua contaminada es: ${bateria(Np)}")
}
