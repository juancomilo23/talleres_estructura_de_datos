package ean.programacionavanzada.tallerpilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto EAN Kotlin Collections
 * Autor: Universidad EAN - Marzo 11, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Ejercicio 01
 * Obtener el fondo de la pila
 * Método externo de la clase IStack
 */
fun <T> IStack<T>.bottom(): T {
    val copia : IStack<T> = TArrayStack()
    //Pasar todos los elementos de la pila origeinal a la copia
    while (!this.isEmpty) {
        val tope = this.peek()
        copia.push(tope)
        this.pop()
    }
    val fondo = copia.peek()
    while (!copia.isEmpty) {
        this.push(copia.peek())
        copia.pop()
    }
    return fondo
}

/**
 * Ejercicio 02
 * Función para sumar los números pares de tres cifras que hay en una pila de enteros
 */
fun sumarParesTresCifras(pila: IStack<Int>): Int {
    var suma : Int = 0
    while(!pila.isEmpty){
        var tope = pila.peek()
        if(tope<=999 && tope>=100 && tope%2==0) {
             suma+=tope
        }
        pila.pop()
    }
    return suma
}

/**
 * Ejercicio 03
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe  ningún número de dos cifras, retorne
 * null
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? {
    val pila1 = pila.copy()
    val lista : MutableList<Int> = mutableListOf()
    val lista2 : MutableList<Int> = mutableListOf()
    while (!pila1.isEmpty){
        lista.add(pila1.peek())
        if(pila1.peek()>=10 && pila1.peek()<=99){
            lista2.add(pila1.peek())
        }
        pila1.pop()
    }
    var mayor = Int.MIN_VALUE
    for (i in lista){
        if (i>=10 && i<=99){
            if (i > mayor){
                mayor = i
            }
        }
    }
    if (lista2.size == 0){
        return null
    }
    return mayor
}

/**
 * Ejercicio 04
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T): Unit {
    val aux : IStack<T> = TArrayStack()
    //Pasar todos los elementos de la pila p origeinal a la auxiliar
    while (!p.isEmpty) {
        val tope = p.peek()
        aux.push(tope)
        p.pop()
    }
    // Colocar el elemento en la pila p
    p.push(elem)
    // Pasar los elemento sde la pila auxiliar de regraso a la pila p
    while (!aux.isEmpty) {
    //    val tope = aux.peek()
        p.push(aux.peek())
        aux.pop()
    }
}

/**
 * Ejercicio 05
 * Función genérica para obtener el tamaño de una pila
 */
fun <T> tamañoPila(pila: IStack<T>): Int {
    val copia = pila.copy()
    var cont = 0
    while (!copia.isEmpty){
        copia.pop()
        cont++
    }
    return cont
}

/**
 * Ejercicio 06
 * Función genérica que permite Invertir una pila en otra. Recibe la pila y retorna la pila, pero invertida.
 */
fun <T> invertirPila(pila: IStack<T>): IStack<T> {
    val copia = pila.copy()
    val invertida : IStack<T> = TArrayStack()
    while(!pila.isEmpty){
        invertida.push(pila.peek())
        pila.pop()
    }
    return invertida
}


/**
 * Ejercicio 07
 * Función genérica que copia una pila en otra.
 * La función recibe la pila y retorna la copia.
 * No debe usarse el método copy de la pila
 */
fun <T> copiarPila(pila: IStack<T>): IStack<T> {
    val invertida = invertirPila(pila)
    val copia : IStack<T> = TArrayStack()
    while (!invertida.isEmpty){
        copia.push(invertida.peek())
        invertida.pop()
    }
    return copia
}

/**
 * Ejercicio 08
 * Función genérica que recibe una pila y un elemento y que elimina de la
 * pila todas las ocurrencias del elementoque se recibe como parámetro.
 * No debe retornar nada.
 */
fun <T> eliminarOcurrencias(pila: IStack<T>, elem : T): Unit {
    val aux : IStack<T> = TArrayStack()
    while (!pila.isEmpty){
        if ( pila.peek() != elem){
            aux.push(pila.peek())
            pila.pop()
        }
        else{
            pila.pop()
        }
    }
    while (!aux.isEmpty){
        pila.push(aux.peek())
        aux.pop()
    }
}

/**
 * Ejercicio 09
 * Invertir una lista de números utilizando una pila. La función no retorna,
 * debe modificar la lista
 */
fun invertirLista(lista: IList<Int>){
    val pila: IStack<Int> = TArrayStack()
    val copia = lista.copy()
    for (i in lista){
        pila.push(i)
    }
    lista.clear()
    while(!pila.isEmpty){
        lista.add(pila.peek())
        pila.pop()
    }
}


/**
 * Ejercicio 10
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean{
    val frase1 = frase.toLowerCase()
    var pila :IStack<Char> = TArrayStack()
    var frase2 = frase1.replace(" ", "")
    for (i in frase2){
        pila.push(i)
    }
    return igualesPilas(pila, invertirPila(pila))
}


/**
 * Ejercicio 11
 * Determinar si dos pilas son iguales
 */
fun <T> igualesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean {
    val aux1 = pila1.copy()
    val copia1 = pila1.copy()
    val copia2 = pila2.copy()
    while (!aux1.isEmpty) {
        if (pila1.peek() == pila2.peek()) {
            pila1.pop()
            pila2.pop()
        }
        aux1.pop()
    }
    if (pila1.isEmpty && pila2.isEmpty){
        return true
    }
    return false
}

class ProbarPila {

    @Test
    fun primeraPrueba() {
        val pila: IStack<Int> = TArrayStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        println("La pila es $pila")
        println("El tope es ${pila.peek()}")
        println("El fondo es ${pila.bottom()}")

        pila.pop()
        println("Ahora la pila es $pila")

        guardarEnElFondo(pila, 10)
        println("Ahora la pila queda $pila")


    }

    @Test
    fun segundaPrueba() {
        val p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(2500)
        p.push(100)
        p.push(125)
        p.push(81)

        assertEquals(350, sumarParesTresCifras(p))

    }

    @Test
    fun PruebaEjercicio03() {
        val pila : IStack<Int> = TArrayStack()
        pila.push(1)
        pila.push(26)
        pila.push(32)
        pila.push(48)
        pila.push(5)

        println("El mayor número de dos cifras es: ${mayorDeDosCifras(pila)}")
        assertEquals(48, mayorDeDosCifras(pila))

    }

    @Test
    fun PruebaEjercicio05() {
        val pc : IStack<Char> = TArrayStack()
        pc.push('x')
        pc.push('y')
        pc.push('z')
        pc.push('m')
        print("La pila es $pc y su tamaño es ${tamañoPila(pc)}")
        assertEquals(4, tamañoPila(pc))
    }

    @Test
    fun PruebaEjercicio06() {
        val pila : IStack<Int> = TArrayStack()
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)
        pila.push(7)

        assertEquals("ArrayStack: [top: 2, 3, 4, 5, 6, 7]", invertirPila(pila).toString())
    }

    @Test
    fun PruebaEjercicio07() {
        val pila : IStack<Int> = TArrayStack()
        pila.push(25)
        pila.push(32)
        pila.push(46)
        pila.push(58)
        pila.push(62)
        pila.push(74)

        assertEquals("ArrayStack: [top: 74, 62, 58, 46, 32, 25]", copiarPila(pila).toString())
    }

    @Test
    fun PruebaEjercicio08() {
        val pila : IStack<Int> = TArrayStack()
        pila.push(25)
        pila.push(32)
        pila.push(46)
        pila.push(58)
        pila.push(46)
        pila.push(74)

        //println( eliminarOcurrencias(pila,46))

        assertEquals("ArrayStack: [top: 74, 58, 32, 25]", eliminarOcurrencias(pila,46).toString())
    }

    @Test
    fun PruebaEjercicio09() {
        var lista : IList<Int> = TList()
        lista.add(1)
        lista.add(2)
        lista.add(3)
        lista.add(4)
        lista.add(5)
        lista.add(6)

        //println(invertirLista(lista).toString())

        assertEquals("ArrayList(tam=6, info=[6,5,4,3,2,1]", invertirLista(lista).toString())
    }

    @Test
    fun PruebaEjercicio10() {
        val frase = "Luz azul"
        assertEquals(true, palindrome(frase))
    }

    @Test
    fun PruebaEjercicio11() {
        val pila1 : IStack<Int> = TArrayStack()
        val pila2 : IStack<Int> = TArrayStack()
        pila1.push(25)
        pila1.push(32)
        pila1.push(46)
        pila1.push(58)
        pila1.push(62)
        pila1.push(74)
        pila2.push(25)
        pila2.push(32)
        pila2.push(46)
        pila2.push(58)
        pila2.push(62)
        pila2.push(74)

        println()

        assertEquals(true, igualesPilas(pila1,pila2))
        //assertEquals(false, igualesPilas(pila1,pila2))
    }


}