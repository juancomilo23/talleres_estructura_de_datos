package taller1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_3PKtTest {

    @Test
    fun pelicula() {
        var datos= taller1.pelicula(450)
        var primera=datos.first
        var segunda=datos.second
        assertEquals(primera,1)
        assertEquals(segunda,112)
    }
}