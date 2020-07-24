package com.example.tutorial

import org.assertj.core.api.Assertions.*
import org.junit.Before
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class CounterTest {

    class 初期状態 {
        lateinit var sut: Counter

        @Before
        fun setUp() {
            sut = Counter()
        }
        @Test
        fun incrementを一回実行して1を返す() {
            val actual = sut.increment()
            val expected = 1
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun decrementを一回実行した結果を返す() {
            val actual = sut.decrement()
            val expected = -1
            assertThat(actual).isEqualTo(expected)
        }
    }

    class increment1回 {
        lateinit var sut: Counter

        @Before
        fun setUp() {
            sut = Counter()
            sut.increment()
        }
        @Test
        fun incrementを一回実行して2を返す() {
            val actual = sut.increment()
            val expected = 2
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun decrementを一回実行した結果を返す() {
            val actual = sut.decrement()
            val expected = 0
            assertThat(actual).isEqualTo(expected)
        }
    }
    class increment100回 {
        lateinit var sut: Counter

        @Before
        fun setUp() {
            sut = Counter()
            for (i in 1..100) {
                sut.increment()
            }
        }
        @Test
        fun incrementを一回実行して1を返す() {
            val actual = sut.increment()
            val expected = 101
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun decrementを一回実行した結果を返す() {
            val actual = sut.decrement()
            val expected = 99
            assertThat(actual).isEqualTo(expected)
        }
    }

}