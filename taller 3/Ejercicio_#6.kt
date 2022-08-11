package Solucion_taller_3

fun main(){
    print("digite numero entero positivo multiplicar")
    var numero= readLine()!!.toInt()
    println("TABLA DE MULTIPLICAR DE $numero")
    repeat(10){
        if(it>0){
        println("$numero x $it = ${numero*it}")
        }
    }
}
