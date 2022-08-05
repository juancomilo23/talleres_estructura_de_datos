package Solucio_taller_2

fun suelo(sueldo_em:Double):Pair<Double,Double>{
    var aumento:Double=0.0
    var nuevo_sueldo:Double=0.0
    if (sueldo_em<=800000.0){
        aumento=sueldo_em*0.10
        nuevo_sueldo=sueldo_em+aumento
    }else if(sueldo_em>800000.0 && sueldo_em<=1200000.0){
        aumento=sueldo_em*0.08
        nuevo_sueldo=sueldo_em+aumento
    }else if (sueldo_em>1200000.0) {
        aumento = sueldo_em * 0.05
        nuevo_sueldo = sueldo_em + aumento
    }else{

    }
    return Pair(aumento,nuevo_sueldo)
}

fun main(){
    print("Ingrese el sueldo de la persona: ")
    val sueldo_em= readLine()!!.toDouble()
    println("el aumento del sueldo y el salario final son: ${suelo(sueldo_em)}")

}