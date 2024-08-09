package validFloatingPointValueTest

import org.example.FirstFactory
import org.example.Verifier

class Test {
    private val firstFactory = FirstFactory()

    @Test
    fun testFloatingPointValues() {
        val verifier = Verifier()
        println("---FloatingPointValues---")
        println("Should Be True:")
        println(verifier.verify("1.0", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("1223.34", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("0.200000", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("123456789.123456789098", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify(".123", firstFactory.firstCreate("validFloatingPoint")!!))
        println("Should Be False:")
        println(verifier.verify("123", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("123.123.", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("123.02a", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("123.", firstFactory.firstCreate("validFloatingPoint")!!))
        println(verifier.verify("012.4", firstFactory.firstCreate("validFloatingPoint")!!))
        println(" ")
    }
}