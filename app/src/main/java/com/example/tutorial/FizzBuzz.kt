package com.example.tutorial

class FizzBuzz() {
    fun fizzBuzz(int: Int): String {
        return when {
            (int % 15) == 0 -> "FizzBuzz"
            (int % 3) == 0 -> "Fizz"
            (int % 5) == 0 -> "Buzz"
            else -> int.toString()
        }
    }
}