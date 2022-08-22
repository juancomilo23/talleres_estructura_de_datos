package Taller05

fun preciocarro(lista: MutableList<Pair<String,Double>>, placa:String): Double{
    var p=-1.0
    for ((plac,precio) in lista){
        if (plac==placa){
            p=precio
        }
    }
    return p
}

fun main(){
    var lista : MutableList<Pair <String, Double>> = mutableListOf()
    var placa : String
    var precio : Double
    print("Ingrese la placa: ")
    placa = readLine()!!
    print("Ingrese el precio: ")
    precio = readLine()!!.toDouble()
    lista.add(Pair(placa,precio))
    while (placa!="" && precio >0){
        lista.add(Pair(placa,precio))
        print("Ingrese la placa: ")
        placa = readLine()!!
        print("Ingrese el precio: ")
        precio = readLine()!!.toDouble()
    }
    print("Ingrese la placa que quiere buscar: ")
    var placa2 = readLine()!!

    var valor = preciocarro(lista,placa2)
    println(valor)

}