package Taller06

class Ascensor {
    //Atributos de la clase
    private var numPisos : Int = 0
    private var numSotanos : Int = 0
    private var pActual : Int = 1

    //Constructor primario
    constructor()

    //Constructor secundario
    constructor(pActual: Int, numPisos:Int, numSotanos:Int){
        this.pActual= pActual
        this.numPisos = numPisos
        this.numSotanos = numSotanos
    }

    fun getnumPisos()= this.numPisos
    fun getnumSotanos()= this.numSotanos
    fun getpActual()=this.pActual

    fun setnumPisos(nuevoValor: Int){
        this.numPisos=nuevoValor
    }
    fun setnumSotanos(nuevoValor: Int){
        this.numPisos=nuevoValor
    }
    fun setpActual(nuevoValor: Int){
        this.numPisos=nuevoValor
    }
    fun atender() =this.numPisos+this.numSotanos

    //Métodos que determina el piso en el que quedará
    fun deterPiso1(){
        if (pActual<numPisos ){
            when (this.pActual) {
                -1-> this.pActual=1
                else -> this.pActual++
            }
        }
        else {
            println("El ascensor se encuentre en el último piso ")
        }
    }

    fun deterPiso2() {
        if (this.pActual>-this.numSotanos){
            when (this.pActual){
                1-> this.pActual=-1
                else-> this.pActual--
            }
        }
    }

}
fun main(){
    var asc = Ascensor()
    var opc = 0
    do{
        println("0. Salir\n1. Crear\n2. Subir\n3. Bajar\n4. Num pisos\n5. piso actual")
        print("Escoja una opción: ")
        opc = readLine()!!.toInt()
        when (opc){
            1-> {
                print("Entre el piso actual: ")
                val pActual = readLine()!!.toInt()
                print("Entre el número de pisos: ")
                val numPisos = readLine()!!.toInt()
                print("Entre el número de sótanos: ")
                val numSotanos = readLine()!!.toInt()
                asc = Ascensor(pActual,numPisos,numSotanos)
                println("Ascensor creado con éxito! ")
            }
            2-> {
                asc.deterPiso1()
                println("El piso al que sube es ${asc.getpActual()}  ")
            }
            3->{
                asc.deterPiso2()
                println("El piso al que baja es ${asc.getpActual()}  ")
            }
            4-> println("El número de pisos que puede atender el ascensor es de ${asc.atender()}")
            5-> println("El número en el que se encuentra es ${asc.getpActual()} ")
        }
    }while (opc != 0)
}
