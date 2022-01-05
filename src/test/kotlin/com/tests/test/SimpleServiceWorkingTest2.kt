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
//@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SimpleServiceWorkingTest2(val service: SimpleService){
    @Test
    fun testMe(){
        val result=service.hallo()
        Assertions.assertTrue(result)
    }

}
