package com.vntfian.trilhasoftex

import com.vntfian.trilhasoftex.class21.Calculadora
import org.junit.Assert.assertEquals
import org.junit.Test

class CaluladoraTest {

    private val calculadora = Calculadora()

    @Test
    fun checkIsPair(){
        val expected = true
        assertEquals(expected, calculadora.oddOrPair(20 + 20))
    }

}