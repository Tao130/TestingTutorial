package com.example.tutorial

import org.junit.Test
import org.assertj.core.api.Assertions.*
import java.lang.IllegalArgumentException

class CalculatorTest {

    @Test
    fun multiplyで2と3をかけたら6が取得できる() {
        val sut = Calculator() // sut → System Under Test
        val actual = sut.multiply(2, 3)
        val expected = 6
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun multiplyで0と3をかけたら0が取得できる() {
        val sut = Calculator() // sut → System Under Test
        val actual = sut.multiply(0, 3)
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで6を2で割ったら3が取得できる() {
        val sut = Calculator()
        val actual = sut.divide(6, 2)
        val expected = 3
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで3を2で割る() {
        val sut = Calculator()
        val actual = sut.divide(3, 2)
        val expected = 1.5
        assertThat(actual).isEqualTo(expected)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divideで3を0で割るとIllegalArgumentExceptionが送出される() {
        val sut = Calculator()
        val actual = sut.divide(3, 0)
    }

    @Test
    fun 演習() {
        val sut = listOf(3, 1, 4)
        assertThat(sut).hasSize(3)
            .doesNotContain(2)
            .startsWith(3)
        assertThat(1).isPositive()
        assertThat(true).isEqualTo(sut[2] <= 4)
    }

}