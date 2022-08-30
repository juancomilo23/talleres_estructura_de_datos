package Taller05

fun ciudadbusq(lista : MutableList<String>, ciudad : String): Boolean {
    for (i in lista){
        if(i == ciudad){
            return true
        }
    }
    return false
}

fun main(){
    var ciudades : MutableList<String> = mutableListOf()
    print("Ingrese el nombre de una ciudad: ")
    var nombre = readLine()!!
    print("Ingrese el nombre de la ciudad que desea verificar: ")
    var ciudad = readLine()!!
    while (nombre!=""){
        print("Ingrese el nombre de una ciudad: ")
        ciudades.add(nombre)
        nombre = readLine()!!
    }
    if (ciudadbusq(ciudades,ciudad)){
        println("la ciudad $ciudad se encuentra en la lista")
    }
    else{
        println("La ciudad $ciudad no está en la lista")
    }
}