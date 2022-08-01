package taller1

/*
?Entradas
?Año de nacimineto-->Int-->nacimineto
!salida
!Edad-->Int-->edad
 */

fun edadper(nacimiento:Int):Int{
    var edad=2022-nacimiento
    return edad
}

fun main(){
    print("cual es su año de nacimineto: ")
    val nacimiento= readln()!!.toInt()
    println("la edad el ususario es : ${edadper(nacimiento)} años")
}