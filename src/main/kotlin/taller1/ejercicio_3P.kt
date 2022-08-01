package taller1

/*
?Entrada
!MB pelicula-->Int-->mbp
?salida
!timempo descarga min-->int-->tdm
!tiempo descarga segundos-->Int-->tds
 */

fun pelicula(mbp:Int):Pair<Int,Int>{
    var tds=mbp/4
    var tdm=mbp/240
    return Pair(tdm,tds)
}

fun main(){
    print("Ingrese la cantidad de mb que pesa la pelicula: ")
    var mbp= readLine()!!.toInt()
    var primera= pelicula(mbp).first
    var segunda= pelicula(mbp).second
    println("la pelicula demora ${primera} minutos y ${segunda} segundos.")
}