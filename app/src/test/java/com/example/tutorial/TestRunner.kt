package com.example.tutorial

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(CircleTest::class, FizzBuzzTest::class)
class TestRunner {
}