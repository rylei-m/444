package org.example

import org.example.validBinaryNumber.BinaryVerifier
import org.example.validComplexPassword.ComplexPasswordVerifier
import org.example.validEmailAddress.EmailVerifier
import org.example.validFloatingPointValue.FloatingPointVerifier
import org.example.validInteger.IntegerVerifier

fun main() {
    val verifier = IntegerVerifier()
    println("Integers")
    println("should be true")
    println(verifier.verify("1"))
    println(verifier.verify("123"))
    println(verifier.verify("3452342352434534524346"))
    println("should be false")
    println(verifier.verify(""))
    println(verifier.verify("0123"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))
    println(" ")

    val floatingPointVerifier = FloatingPointVerifier()
    println("FloatingPoints")
    println("should be true")
    println(floatingPointVerifier.verify("1.0"))
    println(floatingPointVerifier.verify("1223.34"))
    println(floatingPointVerifier.verify("0.200000"))
    println(floatingPointVerifier.verify("123456789.123456789098"))
    println(floatingPointVerifier.verify(".123"))
    println("should be false")
    println(floatingPointVerifier.verify("123"))
    println(floatingPointVerifier.verify("123.123."))
    println(floatingPointVerifier.verify("123.02a"))
    println(floatingPointVerifier.verify("123."))
    println(floatingPointVerifier.verify("012.4"))
    println(" ")

    val binaryVerifier = BinaryVerifier()
    println("Binary States")
    println("should be true")
    println(binaryVerifier.verify("1"))
    println(binaryVerifier.verify("11"))
    println(binaryVerifier.verify("101"))
    println(binaryVerifier.verify("111111"))
    println(binaryVerifier.verify("10011010001"))
    println("should be false")
    println(binaryVerifier.verify("01"))
    println(binaryVerifier.verify("10"))
    println(binaryVerifier.verify("1000010"))
    println(binaryVerifier.verify("100a01"))
    println(binaryVerifier.verify("0000")) // Starts and ends with 0
    println(binaryVerifier.verify("")) // Empty string
    println(" ")

    val emailVerifier = EmailVerifier()
    println("Emails")
    println("should be true:")
    println(emailVerifier.verify("a@b.c")) // true
    println(emailVerifier.verify("joseph.ditton@usu.edu")) // true
    println(emailVerifier.verify("{}*$.&$*(@*$%&.*&*")) // true
    println("should be false:")
    println(emailVerifier.verify("@b.c")) // false
    println(emailVerifier.verify("a@b@c.com")) // false
    println(emailVerifier.verify("a.b@b.b.c")) // false
    println(emailVerifier.verify("joseph ditton@usu.edu")) // false
    println(" ")

    val complexPasswordVerifier = ComplexPasswordVerifier()
    println("Complex PWs")
    println("should be true:")
    println(complexPasswordVerifier.verify("aaaaH!aa"))
    println(complexPasswordVerifier.verify("1234567*9J"))
    println(complexPasswordVerifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
    println("should be false:")
    println(complexPasswordVerifier.verify("a"))
    println(complexPasswordVerifier.verify("aaaaaaa!"))
    println(complexPasswordVerifier.verify("aaaHaaaaa"))
    println(complexPasswordVerifier.verify("Abbbbbbb!"))
}

