package Solucion_taller_6

class asensor{
    private var pisos:Int=0
    private var sotanos:Int=0
    private var pactual:Int=0
    constructor() //primario
    constructor(pisos: Int, sotanos: Int, pactual: Int) {
        this.pisos = pisos
        this.sotanos = sotanos
        this.pactual = pactual
    }
    //analizadores get
    fun getpisos()=this.pisos
    fun getsotanos()=this.sotanos
    fun getpactual()=this.pactual
    //modificadores set
    fun setp(nuevo:Int){
        if(nuevo!=0){
            this.pisos=nuevo
        }
    }
    fun sets(nuevo_a:Int){
        if(nuevo_a!=0){
            this.sotanos=nuevo_a
        }
    }
    fun setpa(nuevo_b:Int){
        if(nuevo_b!=0){
            this.pactual=nuevo_b
        }
    }
    //metodos
    fun primera():Int{
        require(this.pactual<this.pisos)
        if(this.pactual<this.pisos){
            if(this.pactual==-1){
                this.pactual=this.pactual+2
            }
            else{
                this.pactual=this.pactual+1
            }

        }
        return this.pactual
    }

}