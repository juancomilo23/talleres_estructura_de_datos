package Solucio_taller_2

fun paseo(sb:Int,g:Int,f:Int):Int{
    var buses=Math.ceil(((g*2+f)/sb).toDouble())
    return buses.toInt()
}
fun main(){
    print("Ingrese cuantas sillas tiene el bus: ")
    val sb= readln()!!.toInt()
    print("Ingrse la cantidad de gorditos que iran al paseo: ")
    val g= readln()!!.toInt()
    print("Ingrse la cantidad de faquitos que iran al paseo: ")
    val f= readln()!!.toInt()
    println("la cantidad de buses que se necesitan son ${paseo(sb, g, f)}")

}