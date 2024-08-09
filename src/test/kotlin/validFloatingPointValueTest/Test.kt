package validFloatingPointValueTest

import org.example.FirstFactory
import org.example.Verifier
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class Test {
    private val firstFactory = FirstFactory()
    private val verifier = Verifier()
    private val validator = firstFactory.firstCreate("validFloatingPoint")!!

    @Test
    fun testFloatingPointValues() {
        val verifier = Verifier()
        println("---FloatingPointValues---")
        println("Should Be True:")
        assertTrue(verifier.verify("1.0", validator))
        assertTrue(verifier.verify("1223.34", validator))
        assertTrue(verifier.verify("0.200000", validator))
        assertTrue(verifier.verify("123456789.123456789098", validator))
        assertTrue(verifier.verify(".123", validator))
        println("Should Be False:")
        assertFalse(verifier.verify("123", validator))
        assertFalse(verifier.verify("123.123.", validator))
        assertFalse(verifier.verify("123.02a", validator))
        assertFalse(verifier.verify("123.", validator))
        assertFalse(verifier.verify("012.4", validator))
        println(" ")
    }
}