package org.example

import org.example.validFloatingPointValue.FloatingPointVerifier
import org.example.validInteger.IntegerVerifier

fun main() {
    val verifier = IntegerVerifier()
    println(verifier.verify("12345"))
    println(verifier.verify("12349087612349876123498761234987612349876"))
    println(verifier.verify("012341234"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))

    val floatingPointVerifier = FloatingPointVerifier()
    println(floatingPointVerifier.verify("1.0"))
    println(floatingPointVerifier.verify("1223.34"))
    println(floatingPointVerifier.verify("0.200000"))
    println(floatingPointVerifier.verify("123456789.123456789098"))
    println(floatingPointVerifier.verify(".123"))
    println(floatingPointVerifier.verify("123"))
    println(floatingPointVerifier.verify("123.123."))
    println(floatingPointVerifier.verify("123.02a"))
    println(floatingPointVerifier.verify("123."))
    println(floatingPointVerifier.verify("012.4"))
    }

