package org.example

import org.example.binaryNumber.BinaryVerifier
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

    val binaryVerifier = BinaryVerifier()
    println("Binary States")
    println(binaryVerifier.verify("1"))
    println(binaryVerifier.verify("11"))
    println(binaryVerifier.verify("101"))
    println(binaryVerifier.verify("111111"))
    println(binaryVerifier.verify("10011010001"))

    println(binaryVerifier.verify("01"))
    println(binaryVerifier.verify("10"))
    println(binaryVerifier.verify("1000010"))
    println(binaryVerifier.verify("100a01"))
    println(binaryVerifier.verify("0000")) // Starts and ends with 0
    println(binaryVerifier.verify("")) // Empty string
}

