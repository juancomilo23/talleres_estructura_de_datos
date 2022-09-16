package ean.programacionavanzada.taller

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Pilas
 * Autor: Universidad EAN - Marzo 18, 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*

/**
 * Objeto que permite convertir una expresión infija normal a una expresión en notación
 * postfija. Utiliza pilas para realizar la conversión.
 */
object Evaluador {

    //-------------------------------------
    // Métodos
    //-------------------------------------

    /**
     * Verifica que la expresión tiene los símbolos de agrupación bien balanceados
     * @return true si la expresión está balanceados
     */
    fun estánSímbolosAgrupaciónBalanceados(expresion: IList<String>): Boolean {
        var pilaSimbolos: IStack<String> = TLinkedStack()
        for (i in expresion){
            if (i == "(" || i == "[" || i == "{"){
                pilaSimbolos.push(i)
            }
            else if (i == ")" || i == "]" || i == "}" ){
                if (pilaSimbolos.isEmpty){
                    return false
                }
                when {
                    i == ")" && pilaSimbolos.peek()!="("-> return false
                    i == "}" && pilaSimbolos.peek()!="{"-> return false
                    i == "]" && pilaSimbolos.peek()!="["-> return false
                }
                pilaSimbolos.pop()
            }
        }
        if (!pilaSimbolos.isEmpty){
            return false
        }
        else{
            return true
        }
    }

    /**
     * Transforma la expresión, cambiando los simbolos de agrupación [] y {} por ()
     */
    fun reemplazarDelimitadoresPorParéntesis(expresion: IList<String>): Unit {
        for (i in expresion){
            if (i=="{" || i=="["){
                expresion[expresion.indexOf(i)] = "("
            }
            if (i=="}"|| i=="]"){
                expresion[expresion.indexOf(i)] = ")"
            }
        }
    }

    /**
     * Realiza la conversión de la notación infija a postfija
     * @return la expresión convertida a postfija
     */
    fun convertirAPostfijo(expresion: IList<String>): IList<String> {
        val pila: IStack<String> = TLinkedStack()
        val lista: IList<String> = TList()
        for (i in expresion){
            if ( i =="+" ||i =="-" ||i =="*" ||i =="/" ||i =="%"){
                pila.push(i)
            }
            if (i ==")"){
                lista.add(pila.peek())
                pila.pop()
            }
            if (i != "+" && i != "-" && i != "*" && i != "/" && i != "%" && i != "(" && i != ")"){
                lista.add(i)
            }
        }
        return lista
    }

    /**
     * Realiza la evaluación de la expresión postfija almacenada en la lista
     * llamada "expresión". REaliza las operaciones de acuerdo al algoritmo
     * presentado.
     */
    fun evaluarExpresiónPostfija(expression: IList<String>): Int {
        val pila: IStack<Int> = TLinkedStack()
        for (i in expression){
            if (i == "+" ||i == "-" ||i == "*" ||i == "/" || i == "%"){
                var a = pila.peek()
                pila.pop()
                var b = pila.peek()
                pila.pop()
                var resultado = 0
                when {
                    i =="+" -> resultado = b+a
                    i =="-" -> resultado = b-a
                    i =="*" -> resultado = b*a
                    i =="/" -> resultado = b/a
                    i =="%" -> resultado = b%a
                }
                pila.push(resultado)
            }
            else{
                pila.push(i.toInt())
            }
        }
        return pila.peek()
    }
}
