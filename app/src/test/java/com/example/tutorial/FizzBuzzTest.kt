@file:Suppress("NonAsciiCharacters")

package com.example.tutorial

import org.junit.Test

import org.assertj.core.api.Assertions.*
import org.junit.Before

class FizzBuzzTest {
    lateinit var sut: FizzBuzz

    @Before
    fun setUp() {
        sut = FizzBuzz()
    }

    @Test
    fun fizzBuzzで3の倍数のときFizzを取得() {
        val actual = sut.fizzBuzz(9)
        val expected = "Fizz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun fizzBuzzで5の倍数のときBuzzを取得() {
        val actual = sut.fizzBuzz(10)
        val expected = "Buzz"
        assertThat(actual).isEqualTo(expected)

    }

    @Test
    fun fizzBuzzで15の倍数のときFizzBuzzを取得() {
        val actual = sut.fizzBuzz(30)
        val expected = "FizzBuzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun fizzBuzzで3と5の倍数でない時その数字の文字列を取得() {
        val actual = sut.fizzBuzz(7)
        val expected = "7"
        assertThat(actual).isEqualTo(expected)
    }
}