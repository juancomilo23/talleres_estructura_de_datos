package Taller05

fun elviejo(lista : MutableList<Pair<String,Int>>): String{
    var masviejo = ""
    var edad = Int.MAX_VALUE
    for ((nombre, año) in lista){
        if (edad>año ){
            edad = año
            masviejo = nombre
        }
    }
    return masviejo
}

fun main(){
    var N : Int
    var lista : MutableList<Pair<String,Int>> = mutableListOf()
    print("Ingrese el número de estudiantes: ")
    N = readLine()!!.toInt()
    repeat(N){
        print("Ingrese el nombre del estudiante: ")
        var nombre = readLine()!!
        print("Ingrese el año de nacimiento del estudiante: ")
        var año= readLine()!!.toInt()
        lista.add(Pair(nombre,año))
    }
    println("El estudiante más viejo es: ${elviejo(lista)}")
}
