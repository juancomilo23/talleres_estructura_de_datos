package Solucion_taller_3

fun diviso(num:Int): Int{
    var divi = 0
    for (i in num-1 downTo 1 ){
        if (num%i==0){
            divi+=i
        }
    }
    return divi
}
fun main(){
    var num :  Int
    print("Ingrese un número entero positivo:  ")
    num = readLine()!!.toInt()
    print(diviso(num))
}