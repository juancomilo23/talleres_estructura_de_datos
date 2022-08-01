package taller1

/*
!Entrada
*Nota 1--> int-->n1
*NOta 2--> Int->n2
*Nota 3-->Int-->n3
!Salida
*Nota final-->Double-->nf
 */

fun notas(n1:Int,n2:Int,n3:Int):Double{
    var c1=n1*0.25
    var c2=n2*0.25
    var c3=n3*0.50
    var nf=c1+c2+c3
    return nf
}

fun main(){
    print("ingrese la primera nota: ")
    val n1= readLine()!!.toInt()
    print("Ingrese la segunda nota: ")
    val n2= readLine()!!.toInt()
    print("Ingrese la tercera nota: ")
    val n3= readLine()!!.toInt()
    println("la nota final optenida por el alumno fu de ${notas(n1, n2, n3)}.")
}
