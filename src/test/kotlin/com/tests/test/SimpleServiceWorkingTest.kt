package com.tests.test

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.testcontainers.junit.jupiter.Testcontainers

@MicronautTest
@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class SimpleServiceWorkingTest(val service: SimpleService){
    @Test
    fun testMe(){
        val result=service.hallo()
        Assertions.assertTrue(result)

    }
    @ParameterizedTest
    @CsvFileSource(resources = ["/data.csv"], numLinesToSkip = 1)
    fun parametricTests(first:String,expected:String){
        Assertions.assertEquals(expected,first)
    }
}
