package validIntegerTest

import org.example.Verifier
import org.example.validInteger.FirstInteger
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class Test {
    val startingState = FirstInteger()

    @Test
    fun testIntegers() {
        val verifier = Verifier()
        println("---Integers---")
        println("Should Be True:")
        assertTrue(verifier.verify("1", startingState))
        assertTrue(verifier.verify("123", startingState))
        assertTrue(verifier.verify("3452342352434534524346", startingState))
        println("Should Be False:")
        assertFalse(verifier.verify("", startingState))
        assertFalse(verifier.verify("0123", startingState))
        assertFalse(verifier.verify("0", startingState))
        assertFalse(verifier.verify("123abc123", startingState))
    }
}