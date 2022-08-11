package Solucion_taller_3

fun salario(horas:Double) =
    when {
        horas <= 35 -> horas *  15_000
        horas > 35 && horas <= 60 -> 525_000 + ((horas -35) * 18_000)
        else -> 975_000 + ((horas - 60) * 25_000)
    }



fun main(){
    print("Ingrese el número de trabajadores: ")
    var empleados = readLine()!!.toInt()
    for (i in 1..empleados){
        print("Ingrese las horas que trabaja semanalmente el trabajador $i: ")
        var horas= readLine()!!.toDouble()
        println("El salario del trabajador $i es de ${salario(horas)}")
    }

}