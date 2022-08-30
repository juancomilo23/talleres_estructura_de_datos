package Taller05

fun verbos(list:MutableList<String>): Int {
    var cont = 0
    for (i in list){
        if (i.endsWith("ar")|| i.endsWith("er") || i.endsWith("ir")){
            cont++
        }
    }
    return cont
}

fun main() {
    var num : Int
    print("Cuántas palabras desea ingresar?:  ")
    num = readLine()!!.toInt()
    var lista : MutableList<String> = mutableListOf()
    repeat(num){
        print("Ingrese una palabra: ")
        var palabra = readLine()!!
        lista.add(palabra)
    }
    println("De las $num palabras digitadas ${verbos(lista)} son verbos")
}