package Solucio_taller_2

import kotlin.math.pow

fun Operador(num1:Double,num2:Double,o:String):Pair<Double,String>{
    var calculo=0.0
    var operador=""
    if (o=="+") {
        calculo=num1+num2
        operador="Suma"
    }else if (o=="-"){
        calculo=num1-num2
        operador="Resta"
    }else if(o=="*"){
        calculo=num1*num2
        operador="Multiplicacion"
    }else if(o=="/"){
        calculo=num1/num2
        operador="Divicion"
    }else if (o=="%"){
        calculo=num1%num2
        operador="Modulo"
    }else if (o=="**"){
        calculo=num1.pow(num2)
        operador="exponente"
    }else{
        operador="no existe un operador"
    }
    return Pair(calculo,operador)
}
fun operador(num1:Double,num2:Double,o:String):Pair<Double,String> {
    var calculo: Double = 0.0
    var operacion: String = ""
    when (o) {
        "+" -> {
            calculo = num1 + num2
            operacion = "Suma"
        }

        "-" -> {
            calculo = num1 - num2
            operacion = "Resta"
        }

        "*" -> {
            calculo = num1 * num2
            operacion = "Multiplicacion"
        }

        "/" -> {
            calculo = num1 / num2
            operacion = "Divicion"
        }

        "%" -> {
            calculo = num1 % num2
            operacion = "Modulo"
        }

        "**" -> {
            calculo = num1.pow(num2)
            operacion = "Exponente"
        }

        else -> {
            operacion = "no hay operador"
        }

    }
    return Pair(calculo,operacion)
}

fun main(){
    println("Ingrese el primer numero: ")
    val num1 = readLine()!!.toDouble()
    println("Ingrese el segundo numero: ")
    val num2 = readLine()!!.toDouble()
    println("Ingrese uno de los siguientes operadores (+,-,*,/,%,**) :")
    val o= readLine()!!.toString()
    println("El total es ${Operador(num1,num2,o)}")
    println("El total es ${operador(num1,num2,o)}")
}