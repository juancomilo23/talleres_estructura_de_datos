package Solucio_taller_2
fun main(){
    print("digite el dia de la semana: ")
    var dia= readln()!!.toString().lowercase()
    println("el dia de hoy es $dia y el dia de mañana es :${dia(dia)}")
}
fun dia(x:String):String{
    val mañana:String
    mañana=when(x){
        "lunes"->"martes"
        "martes"->"miercoles"
        "miercoles"->"jueves"
        "jueves"->"viernes"
        "viernes"->"sabado"
        "sabado"->"domingo"
        "domingo"->"lunes"
        else ->"no es un dia  de la semana"
    }
    return mañana
}