package taller1

fun main() {
    var es = "Manuel"
    val p = 95
    val e = 18
    var result =
        if (e>18){
            if (p >= 90) {
                "La beca del estudiante ${es} es 200.000"}
            else if (p >= 75 && p < 90) {
                "La beca del estudiante ${es} es 1.000"}
            else if (p >= 60 && p < 75) {
                "La beca del estudiante ${es} es 500"}
            else{
                "La beca del estudiante ${es} es la carta de incentivo a estudio"}
        }
        else{
            if (p >= 90) {
                "La beca del estudiante ${es} es 3.000"}
            else if (p >= 80 && p < 90) {
                "La beca del estudiante ${es} es 2.000"}
            else if (p >= 60 && p < 75) {
                "La beca del estudiante ${es} es 1.000"}
            else{
                "La beca del estudiante ${es} es la carta de incentivo a estudio"}}
    println (result)}