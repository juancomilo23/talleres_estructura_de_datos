package Solucio_taller_2

fun distancia(x1:Double,x2:Double,y1:Double,y2:Double):Double{
    var d=(y2-y1)*2+(x2-x1)*2
    return d
}
fun pendiente(x1:Double,x2:Double,y1:Double,y2:Double):Double{
    var m=(y2-y1)/(x2-x1)
    return m
}
fun punto_medio(x1:Double,x2:Double,y1:Double,y2:Double):Pair<Double,Double>{
    var xm=(x1+x2)/2
    var ym=(y1+y2)/2
    return Pair(xm,ym)
}

fun main(){
    print("ingrese la cordenada x1: ")
    val x1= readLine()!!.toDouble()
    print("ingrese la cordenada y1: ")
    val y1= readLine()!!.toDouble()
    print("ingrese la cordenada x2: ")
    val x2= readLine()!!.toDouble()
    print("ingrese la cordenada y2: ")
    val y2= readLine()!!.toDouble()
    println("Segun las cordenadas ingresadas la distancia entre los puntos es ${distancia(x1,x2, y1, y2)}," +
            "la pendiente de la recta que une los puntos es ${pendiente(x1,x2,y1,y2)}" +
            "y el punto medio es ${punto_medio(x1,x2,y1,y2)}")
}