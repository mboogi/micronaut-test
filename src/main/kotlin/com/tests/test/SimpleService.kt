package com.tests.test

import jakarta.inject.Singleton

@Singleton
class SimpleService {

    fun hallo(): Boolean {
        println("hallo")
        return true
    }
}
