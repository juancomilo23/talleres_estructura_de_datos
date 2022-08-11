package Solucion_taller_3

fun comis(ventas: Double): Double{
    val c : Double
    if (ventas >50_000){
        c = ventas*0.15
        return c
    }
    else {
        return 0.0
    }
}
fun main(){
    var salario : Double
    var comision :Double
    var pregunta : String
    var salario_neto :Double
    print("Salario mensual del empleado: ")
    salario = readLine()!!.toDouble()
    print("Ingrese las ventas realizadas: ")
    var ventas = readLine()!!.toDouble()
    println("La comisión es de ${comis(ventas)}")
    println("El salario neto es de ${comis(ventas)+salario}")
    print("Si desea continuar escriba s, de lo contrario ingrese n:  ")
    pregunta = readLine()!!.toString()
    while (pregunta=="s"){
        print("Salario mensual del empleado: ")
        salario = readLine()!!.toDouble()
        print("Ingrese las ventas realizadas: ")
        ventas = readLine()!!.toDouble()
        println("La comisión es de ${comis(ventas)}")
        println("El salario neto es de ${comis(ventas)+salario}")
        print("Si desea continuar escriba s, de lo contrario ingrese n:  ")
        pregunta = readLine()!!.toString()
    }

}