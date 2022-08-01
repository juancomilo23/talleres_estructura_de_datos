package taller1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_3BKtTest {

    @Test
    fun valor_bicicleta() {
        var datos= taller1.valor_bicicleta(100000.0,20)
        var primera=datos.first
        var segunda=datos.second
        assertEquals(primera,10)
        assertEquals(segunda,1000000.0)
    }
}