package validBinaryNumberTest

import org.example.FirstFactory
import org.example.Verifier
import validFloatingPointValueTest.Test

class Test {
    private val firstFactory = FirstFactory()

    @Test
    fun testBinaryNumber() {
        val verifier = Verifier()
        println("---ComplexPassword---")
        println("Should Be True:")
        println(verifier.verify("1", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("11", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("101", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("10011010001", firstFactory.firstCreate("validBinaryNumber")!!))
        println("Should Be False:")
        println(verifier.verify("01", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("10", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("1000010", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("100a01", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("0000", firstFactory.firstCreate("validBinaryNumber")!!))
        println(verifier.verify("", firstFactory.firstCreate("validBinaryNumber")!!))
        println(" ")
    }
}