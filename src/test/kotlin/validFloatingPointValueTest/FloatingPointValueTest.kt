package validFloatingPointValueTest

import org.example.Verifier
import org.example.validFloatingPointValue.FirstFloatingPointValue
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class FloatingPointValueTest {
    val startingState = FirstFloatingPointValue()

    @Test
    fun testFloatingPointValues() {
        val verifier = Verifier()
        println("---FloatingPointValues---")
        println("Should Be True:")
        assertTrue(verifier.verify("1.0", startingState))
        assertTrue(verifier.verify("1223.34", startingState))
        assertTrue(verifier.verify("0.200000", startingState))
        assertTrue(verifier.verify("123456789.123456789098", startingState))
        assertTrue(verifier.verify(".123", startingState))
        println("Should Be False:")
        assertFalse(verifier.verify("123", startingState))
        assertFalse(verifier.verify("123.123.", startingState))
        assertFalse(verifier.verify("123.02a", startingState))
        assertFalse(verifier.verify("123.", startingState))
        assertFalse(verifier.verify("012.4", startingState))
        println(" ")
    }
}