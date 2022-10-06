package ean.estructuradedatos.taller

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 18 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.TList
import ean.collections.TArray
import ean.collections.IList
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Métodos interno definido externamente de la clase
 */
fun Int.isEven(): Boolean = this % 2 == 0
fun Int.lastDigit(): Int = this % 10
/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int =
    when (n) {
        0, 1 -> 1
        else -> n *(factorial(n-1))
    }


/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int =
    when (n) {
        1, 2 -> 1
        else -> fibonacci(n-1) + fibonacci(n-2)
    }

/**
 * Permite determinar el término n,m del triángulo de Pascal
 * n = fila, m = término
 */
fun pascal(n: Int, m: Int): Int {
    when {
        m == n + 1 || m == 1 || n <= 1 -> return 1
        else -> return pascal(n - 1, m - 1) + pascal(n - 1, m)
    }
}

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int =
    when (b) {
        0 -> 1
        1 -> a
        else -> a * (elevar(a,b-1))
    }

/**
 * Halla la suma de todos los números enteros entre 1 y n
 */
fun sumatoria(n: Int): Int = TODO("COmpletar")

/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int =
    when (n) {
        1 -> 1
        else -> n * n + sumaCuadrados(n-1)
    }

/**
 * Hallar el valor de la serie 1/(2i+1) desde  1 hasta n
 */
fun serie(n: Int): Double =
    when {
        n == 1 -> (1/(2*n.toDouble()+1))
        else -> (1/(2*n.toDouble()+1)) + serie(n-1)
    }

/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */
fun contarDigitos(n: Int): Int {
    require(n > 0)
    when {
        n < 10 -> return  1
        else -> return 1 + contarDigitos(n / 10)
    }
}

/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int =
    when {
        n < 10 -> n
        else ->  (n.lastDigit()) + sumarDigitos(n / 10)
    }

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - tiene una cifra y es 0, 3, 6, o 9
 *  - tiene más de una cifra y la suma de sus dígitos es múltiplo de 3
 *  - en cualquier otro caso, el número no es múltiplo de 3
 *
 *  - NO PUEDEN USAR LA OPERACIÓN MÓDULO (%)
 */
fun esMultiploDe3(n: Int): Boolean {
    when {
        n < 10 && n == 0 || n == 3 || n == 6 || n == 9 -> return true
        n > 10 && esMultiploDe3(sumarDigitos(n)) -> return true
        else -> return false
    }
}

/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int =
    when {
        n < 10 && n % 2 == 0 -> 1
        n < 10 && n % 2 != 0 -> 0
        else -> {
            if (n.lastDigit() % 2 == 0){
                1 + cantidadDigitosPares(n/10)
            }
            else {
                cantidadDigitosPares(n/10)
            }

        }
    }
/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el numero 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean {
    when {
        (n == 0 || n == 1) -> return true
        n < 10 -> return false
        else -> {
            if ( n.lastDigit()!=1 && n.lastDigit() != 0){
                return false
            }
            else {
                return esNumeroBinario(n / 10)
            }
        }
    }
}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean {
    /*
    si el numero n posee un solo digito, entonces
       si n y el digito son iguales -> retorne true sino retorne false
    sino si el número n tiene más de un dígito, entonces
       si el ultimo dígito del número n es igual al dígito, entonces
         listo, lo encontramos, retorne true
       sino
         halle el resto de n
         mire si el resto de n posee el dígito indicado
     */
    when {
        n < 10 -> {
            if (n ==digito){
                return true
            }
            else {
                return false
            }
        }
        else -> {
            if (n.lastDigit() == digito){
                return true
            }
            else {
                return poseeDigito(n / 10, digito)
            }
        }
    }
}

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int {
    when {
        n < 10 -> return n
        else -> {
            if (n.lastDigit() > digitoMasGrande(n/10)){
                return n.lastDigit()
            }
            else {
                return digitoMasGrande(n/10)
            }
        }
    }
}

/**
 * Imprimir cada elemento de la lista, pero de manera recursiva
 */
fun <T> imprimirLista(lista: IList<T>) {
    if ( lista.isEmpty){
        println()
    }
    else {
        val prim = lista.first
        val resto : IList<T> = lista.tail()
        print("$prim")
        imprimirLista(resto)
    }
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
    if (n < 10){
        return TList(n)
    }
    else {
        var lista : IList<Int> = digitos(n / 10)
        lista.add(n.lastDigit())
        return lista
    }
}

/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
    if (n == 0 || n == 1 ){
        return TList(n)
    }
    else {
        var u = n % 10
        var r = n / 2
        var lista : IList<Int> = convertirDecimalBinario(n/2)
        lista.add(n.lastDigit()%2)
        return lista
    }
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesLista(lista: IList<Int>): Int {
    if (lista.size == 0){
        return 0
    }
    else{
        val prim = lista.first
        val resto : IList<Int> = lista.tail()
        if (prim.isEven()){
            return sumarParesLista(resto) + prim
        }
        else {
            return sumarParesLista(resto)
        }
    }
}

/**
 * Recursión con listas: construir una función recursiva que retorne la posición del elemento en la lista
 * Si la lista está vacía, retorne -1. No se puede usar indexOf o lastIndexOf
 */
fun buscarElementoEnUnaLista(lista: IList<Int>, elem: Int): Int {
    if (lista.first == elem) {
        return 0
    }
    else if (!lista.isEmpty) {
        return 1 + buscarElementoEnUnaLista(lista.tail(), elem)
    }
    else{
        return -1
    }
}

/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    val prim = digitos.first
    val resto : IList<Int> = digitos.tail()
    if (digitos.size == 1){
        return prim
    }
    else {
        val x = prim * Math.pow( 10.0, resto.size.toDouble())
        return x.toInt() + convertirListaDigitosNumero(resto)
    }
}

/**
 * Función genérica y recursiva que permite saber si un elemento está dentro
 * de la lista. No debe usarse la función indexOf o contains. Debe ser
 * recursiva. Para buscar un elemento hay que tener en cuenta
 * - si la lista está vacía, el elemento no está
 * - si el primero de la lista es igual al elemento, retornamos true (el elemento está)
 * - sino es igual al primero, entonces hay que ver si el elemento está en el resto de la lista
 */
fun <T> existeElemento(lista: IList<T>, elem: T): Boolean {
    TODO("Completar")
}

/** Escribir una función recursiva que, sin usar pilas ni colas
 * ni ninguna otra lista, obtenga la misma lista, pero invertida
 */
fun invertirLista(lista: IList<Char>): IList<Char> {
    val prim = lista.first
    val resto : IList<Char> = lista.tail()
    if (lista.size == 0 ){
        return TList()
    }
    else if( lista.size == 1){
        return TList(prim)
    }
    else {
        var lista1 =  invertirLista(resto)
        lista1.add(prim)
        return lista1
    }
}

/**
 * Una palabra es palíndrome si se lee igual de izquierda a derecha y de derecha
 * a izquierda. Esta función recibe la palabra (sin espacios) y de forma recursiva
 * determina si la palabra es palíndrome.
 */
fun esPalindrome(palabra: String): Boolean {
    val pal = palabra.toLowerCase().replace(" ", "")
    if (pal.length == 3 && (pal.first() == pal.last()) ){
        return true
    }
    else if (pal.first() == pal.last()){
        return esPalindrome(pal.subSequence(1,pal.length-1).toString())
    }
    else {
        return false
    }
}

/**
 * Recursividad con listas. Escriba una función recursiva
 * Obtiene el número más grande de la lista. Si la lista está vacía retorne el número
 * entero más pequeño.
 */
fun mayorDeUnaLista(lista: IList<Int>): Int {
    val prim = lista.first
    val resto : IList<Int> = lista.tail()
    if (lista.size == 0 ) {
        return Int.MIN_VALUE
    }
    else {
        if (lista.size == 1) {
            return prim
        } else {
            if (prim > mayorDeUnaLista(resto)) {
                return prim
            } else {
                return mayorDeUnaLista(resto)
            }
        }
    }
}


/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int) {
    fun distanciaAlOrigen(): Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
}

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): IList<Punto> {
    if (puntos.size == 0){
        return TList()
    }
    else {
        val prim = puntos.first
        val resto : IList<Punto> = puntos.tail()
        if (prim.x >= 0 && prim.y >= 0) {
            var lista = puntosPrimerCuadrante(resto)
            lista.add(prim)
            return lista
        }
        else {
            return puntosPrimerCuadrante(resto)
        }
    }
}

/**
 * Recursivamente, obtiene el punto que está más lejano del origen.
 * Si la lista esta vacía, retorne null
 * Si la lista tiene un solo elemento, retorne ese elemento
 * si la lista tiene más de un elemento, tome el primer elemento y
 * compárelo con el punto más lejano del resto de la lista.
 */
fun puntoMasLejano(puntos: IList<Punto>): Punto? {
    TODO("Completar")
}
