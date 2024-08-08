package org.example

import org.example.validBinaryNumber.BinaryVerifier
import org.example.validComplexPassword.ComplexPasswordVerifier
import org.example.validEmailAddress.EmailVerifier
import org.example.validFloatingPointValue.FloatingPointVerifier
import org.example.validInteger.IntegerVerifier

fun main() {
    val verifier = IntegerVerifier()
    println("Integers")
    println(verifier.verify("12345"))
    println(verifier.verify("12349087612349876123498761234987612349876"))
    println(verifier.verify("012341234"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))
    println(" ")

    val floatingPointVerifier = FloatingPointVerifier()
    println("FloatingPoints")
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
    println(" ")

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
    println(complexPasswordVerifier.verify("aaaaH!aa"))  // Expected: true
    println(complexPasswordVerifier.verify("1234567*9J")) // Expected: true
    println(complexPasswordVerifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH")) // Expected: true
    println(complexPasswordVerifier.verify("a")) // Expected: false
    println(complexPasswordVerifier.verify("aaaaaaa!")) // Expected: false
    println(complexPasswordVerifier.verify("aaaHaaaaa")) // Expected: false
    println(complexPasswordVerifier.verify("Abbbbbbb!")) // Expected: false
}

