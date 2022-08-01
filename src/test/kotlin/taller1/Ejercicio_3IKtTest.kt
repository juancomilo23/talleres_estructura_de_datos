package taller1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_3IKtTest {

    @Test
    fun tienda() {
        var datos= taller1.tienda(10000.0)
        var primera=datos.first
        var segunda=datos.second
        assertEquals(primera,9500.0)
        assertEquals(segunda,11305.0)
    }
}