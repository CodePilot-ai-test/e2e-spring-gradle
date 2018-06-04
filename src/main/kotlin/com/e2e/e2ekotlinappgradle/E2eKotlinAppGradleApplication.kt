package com.e2e.e2ekotlinappgradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class E2eKotlinAppGradleApplication

fun main(args: Array<String>) {
    runApplication<E2eKotlinAppGradleApplication>(*args)
}
