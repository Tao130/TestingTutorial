package com.example.tutorial

import org.junit.Before
import org.junit.Test

import org.assertj.core.api.Assertions.*
import kotlin.math.exp

class CircleTest {
    lateinit var sut: Circle

    @Before
    fun setUp() {
        sut = Circle(3.14)
    }

    @Test
    fun testingTheConstructor() {
        assertThat(Circle(3.0).pi).isEqualTo(3.0)
    }

    @Test
    fun area() {
        val actual = sut.area(3)
        val expected = 28.26
        assertThat(actual).isEqualTo(expected)
    }
}