package taller1

/*
? modelado de la funcion
* Entradas
* poblacion colombina-->Int-->pc
!salidas
!personas desempleadas-->Int-->pd
 */
fun dane(pc:Int):Int{
    val pd=pc*0.0815
    return pd.toInt()
}

fun main(){
    print("Digite la poblacion colombiana: ")
    val pc= readln()!!.toInt()
    println("la poblacion desempleada es: ${dane(pc)}")
}