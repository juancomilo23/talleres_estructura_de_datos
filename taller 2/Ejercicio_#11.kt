package Solucio_taller_2

import kotlin.math.floor

fun decena_unidad(numero:Int):Pair<Int,Int>{
    var unidad=numero%10
    var decena= floor(numero/10.0)
    return Pair(decena.toInt(),unidad)
}

fun romano_unidad(numero:Int):String{
    require(numero in 1..9)
    var romano=""
    romano=when(numero){
        1->"I"
        2->"II"
        3->"III"
        4->"IV"
        5->"v"
        6->"VI"
        7->"VII"
        8->"VIII"
        9->"IX"
        else->""
    }
    return romano
}

fun romano_decena(numero:Int):String{
    require(numero in 0..9)
    var romano=""
    romano=when(numero){
        1->"X"
        2->"XX"
        3->"XXX"
        4->"XL"
        5->"L"
        6->"LX"
        7->"LXX"
        8->"LXXX"
        9->"XC"
        else->""
    }
    return romano
}

fun main(){
    print("digite numero: ")
    var numero= readLine()!!.toInt()
    if(numero<=99){
        if(numero>=0) {
            var unidad = decena_unidad(numero).second
            var decena = decena_unidad(numero).first
            var romano_u = romano_unidad(unidad)
            var romano_d = romano_decena(decena)
            println("${romano_d}${romano_u}")
        }
        else{
            println("Error")
        }
    }
    else{
        println("El numero debe ser menor a 100")
    }
}