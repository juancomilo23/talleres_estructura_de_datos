package Solucion_taller_3

fun comision(ventas: Double): Double{
    val com: Double
    if (ventas<50_000){
        com = ventas*0.07
        return com
    }
    else if (ventas in 50_000.0..100_000.0){
        com = (ventas*0.09)+5000
        return com
    }
    else if (ventas in 100_000.0..200_000.0){
        com = (ventas*0.11)+10000
        return com
    }
    else if (ventas in 200_000.0..500_000.0){
        com = (ventas*0.13)+20000
        return com
    }
    else {
        com = (ventas*0.15)+40000
        return com
    }
}

fun main(){
    var ventas : Double
    print("Ingrese el valor de las ventas: ")
    ventas= readLine()!!.toDouble()
    while (ventas>0){
        println("La comisión es de: ${comision(ventas)}")
        print("Ingrese el valor de las ventas: ")
        ventas = readLine()!!.toDouble()
    }
}
