package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Demo1Application

fun main(args: Array<String>) {
    println("hi")
    runApplication<Demo1Application>(*args)
}
