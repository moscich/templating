package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @RequestMapping("/test")
    fun some(): Test {
        return Test("oiejf")
    }
}

data class Test(val owiej: String)