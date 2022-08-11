package Solucion_taller_3

fun primo(num: Int): Boolean = divisores(num)==2

fun main(){
    val num : Int
    print("Ingrese un número entero: ")
    num = readLine()!!.toInt()
    for (i in 2..num){
        if (primo(i)==true){
            println(i)
        }
    }

}