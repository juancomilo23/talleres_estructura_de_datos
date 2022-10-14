/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Tecnología de la Información y Comunicaciones
 * Faculta de Ingeniería
 *
 * Taller Árboles Binarios
 * Fecha: 20 de abril de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.estructuradedatos.arboles

import ean.collections.IBinTree
import ean.collections.IList
import ean.collections.TList
import kotlin.math.min
fun menorEntreTres(a: Int, b: Int, c: Int) = min(a, min(b, c))
/**
 * Informar si un elemento se encuentra presente en un árbol binario
 */
fun <T> estaArbin(a: IBinTree<T>, elem: T): Boolean =
    when {
        a.isEmpty -> false
        a.root == elem -> true
        else -> estaArbin(a.left, elem) || estaArbin(a.right, elem)

    }


/**
 * Permite obtener el número de vocales que hay en el árbol
 */
fun contarVocales(arbol: IBinTree<String>): Int =
    when {
        arbol.isEmpty -> 0
        arbol.root in "aeiou" -> 1 + contarVocales(arbol.left) + contarVocales(arbol.right)
        else -> contarVocales(arbol.left) + contarVocales(arbol.right)
    }

/**
 * Permite determinar cuantos elementos en el árbol son de dos dígitos y la suma de ambos dígitos es 7
 */
fun contarArbol(a: IBinTree<Int>): Int =
    when {
        a.isEmpty -> 0
        a.root in 10..99 && a.root % 10 + a.root / 10 == 7 -> 1 + contarArbol(a.left) + contarArbol(a.right)
        else -> contarArbol(a.left) + contarArbol(a.right)
    }

/**
 * Permite conocer el porcentaje (entre 0 y 100) de pares en el arbol
 */
fun porcentajePares(a: IBinTree<Int>): Double =
    when {
        a.isEmpty -> 0.0
        a.root % 2 == 0 -> 1 + porcentajePares(a.left) + porcentajePares(a.right)
        else -> porcentajePares(a.left) + porcentajePares(a.right)
    }


/**
 * Determinar la suma de los elementos pares del árbol
 */
fun sumaPares(arbol: IBinTree<Int>): Int {
    if (arbol.isEmpty) {
        return 0
    }
    else {
        val suma_pares_izq = sumaPares(arbol.left)
        val suma_pares_derecho = sumaPares(arbol.right)
        if ( arbol.root % 2 == 0) {
            return arbol.root + suma_pares_izq + suma_pares_derecho
        }
        else {
            return suma_pares_izq + suma_pares_derecho
        }
    }
}

/**
 * Obtener una lista con aquellos elementos del árbol que sean múltiplos de 6
 */
fun multiplosDeSeis(arbol: IBinTree<Int>): IList<Int> {
    if (arbol.isEmpty) {
        return TList()
    }
    else {
        val mdsi = multiplosDeSeis(arbol.left)
        val mdsd = multiplosDeSeis(arbol.right)
        mdsi.addAll(mdsd)
        if (arbol.root % 6 == 0) {
            mdsi.addToHead(arbol.root)
        }
        return mdsi
    }
}

/**
 *   Calcular el peso de un árbol binario
 */
fun <T> peso(a: IBinTree<T>): Int =
    when {
        a.isEmpty -> 0
        else -> peso(a.right) + peso(a.left) + 1
    }

/** when {
a.isEmpty -> 0
else -> peso(a.right) + peso(a.left) + 1
}*/
/**if (a.isEmpty){
return 0
}
else{
return 1+peso(a.left) + peso(a.right)
}*/


/**
 * Esta función externa, NO ES RECURSIVA, y permite saber si el árbol a es una hoja o no.
 * Un árbol a es una hoja si no es vacio y el árbol izquierdo de a si es vacío y el árbol
 * derecho de a también es vacío. En cualquier otro caso, el árbol no es una hoja.
 */
fun <T> esUnaHoja(a: IBinTree<T>): Boolean =
    when {
        a.isEmpty -> false
        else -> a.left.isEmpty && a.right.isEmpty
    }

/**
 * Esta función externa y genérica SI es recursiva y cuenta el número de hojas. La definición
 * recursiva sería la siguiente:
 * - Si el árbol es vacío, no hay hojas
 * - Sino Si el árbol es una hoja, entonces hay 1 hoja
 * - Sino el número total de hojas que hay en el árbol es el número de hojas del árbol izquierdo más
 *        el número de hojas del árbol derecho.
 */
fun <T> contarHojas(a: IBinTree<T>): Int =
    when {
        a.isEmpty -> 0
        esUnaHoja(a) -> 1
        else -> contarHojas(a.left) + contarHojas(a.right)
    }

/**
 * Permite obtener la altura de un árbol binario
 */
fun <T> altura(a: IBinTree<T>): Int =
    when {
        a.isEmpty -> 0
        else -> {
            if (altura(a.left)> altura(a.right))
                altura(a.left) + 1
            else {
                altura(a.right) + 1
            }
        }
    }

/**
 * Imprime el árbol binario a en preorden
 */
fun <T> preorden(a: IBinTree<T>): Unit {
    if (!a.isEmpty) {
        print("${a.root}")
        preorden(a.left)
        preorden(a.right)
    }
}

/**
 * Imprime el árbol binario a en postorden
 */
fun <T> postorden(a: IBinTree<T>): Unit {
    if (!a.isEmpty) {
        postorden(a.left)
        postorden(a.right)
        print("${a.root}")
    }
}

/**
 * Imprime el árbol binario a en inorden
 */
fun <T> inorden(a: IBinTree<T>) {
    if (!a.isEmpty) {
        inorden(a.left)
        print("${a.root}")
        inorden(a.right)
    }
}

/**
 * Ayuda a determinar el nivel en que se encuentra un elemento. El algoritmo es el siguiente:
 * si el árbol está vacío, el nivel del elemento es -1
 * sino si el elemento es igual a la raíz del árbol a, el nivel del elemento es cero
 * sino si el elemento esta en el árbol izquierdo de a,
 *    el nivel del elemento es 1 + el nivel del elemento en el árbol izquierdo
 * sino si el elemento esta en el árbol derecho de a,
 *    el nivel del elemento es 1 + el nivel del elemento en el árbol derecho
 * sino
 *    retorne -1
 */
fun <T> nivelElementoArbol(a: IBinTree<T>, elem: T): Int =
    when {
        a.isEmpty -> -1
        a.root == elem -> 0
        else -> {
            if (nivelElementoArbol(a.left, elem) != -1 ){
                nivelElementoArbol(a.left,elem) + 1
            }
            else if (nivelElementoArbol(a.right,elem) != -1) {
                nivelElementoArbol(a.right, elem) + 1
            }
            else {
                -1
            }
        }
    }

/**
 * Obtiene el elemento padre del elemento e. Para hallar el papá tenemos el siguiente algoritmo
 * Si el árbol está vacío, el papá es nulo
 * sino si la raíz del árbol es igual al elemento, el papá es nulo también
 * sino si el izquierdo de a no es vacío y la raiz del izquierdo de a es igual al elemento, retorne la raiz de a
 * sino si el derecho de a no es vacío y la raiz del derecho de a es igual al elemento, retorne la raiz de a
 * sino si el elemento está en el árbol izquierdo de a, halle el papá del elemento e en el izquierdo de a
 * sino si el elemento está en el árbol derecho de a, halle el papá del elemento e en el árbol derecho de a
 * sino, retorne nulo.
 */
fun <T> padre(a: IBinTree<T>, e: T): T? =
    when {
        a.isEmpty  -> null
        a.left == e -> a.left.root
        a.right == e -> a.right.root
        else -> {
            if (padre(a.left,e) != null) {
                padre(a.left,e)
            }
            else {
                padre(a.left,e)
            }
        }
    }

/**
 * Esta función no es recursiva, pero es muy parecido al algoritmo de hallar el papá
 */
fun <T> hermanoElementoArbol(a: IBinTree<T>, elem: T): T? {
    when {
        a.isEmpty -> return null
        a.left.root == elem -> return a.right.root
        a.right.root == elem -> return a.left.root
        else -> {
            if (hermanoElementoArbol(a.left, elem) != null) {
                return hermanoElementoArbol(a.left, elem)
            } else {
                return hermanoElementoArbol(a.right, elem)
            }
        }
    }
}

/**
 *  Calcular cuantas veces aparece un elemento en un arbol
 */
fun <T> contarNumVecesApareceElemento(a: IBinTree<T>, e: T): Int =
    when {
        a.isEmpty -> 0
        a.root == e -> 1
        else -> contarNumVecesApareceElemento(a.left, e) + contarNumVecesApareceElemento(a.right, e)
    }

/**
 * Calcular el menor de un árbol binario. El Algoritmo es el siguiente
 * Si el árbol está vacío, digamos que el menor es un número grande, por ejemplo Int.MAX_VALUE
 * sino hay que retornar el menor entre la raíz, el menor del árbol izquierdo y el menor del árbol derecho
 */
fun menorArbol(arbol: IBinTree<Int>): Int =
    when {
        arbol.isEmpty -> Int.MAX_VALUE
        else -> menorEntreTres(menorArbol(arbol.left), menorArbol(arbol.right), arbol.root)
    }

