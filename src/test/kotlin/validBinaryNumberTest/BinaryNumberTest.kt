package validBinaryNumberTest

import org.example.Verifier
import org.example.validBinaryNumber.FirstBinaryNumber
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test


class BinaryNumberTest {

    @Test
    fun testBinaryNumber() {
        val verifier = Verifier()
        val startingState = FirstBinaryNumber()

        println("---ComplexPassword---")
        println("Should Be True:")
        assertTrue(verifier.verify("1", startingState))
        assertTrue(verifier.verify("11", startingState))
        assertTrue(verifier.verify("101", startingState))
        assertTrue(verifier.verify("10011010001", startingState))
        println("Should Be False:")
        assertFalse(verifier.verify("01", startingState))
        assertFalse(verifier.verify("10", startingState))
        assertFalse(verifier.verify("1000010", startingState))
        assertFalse(verifier.verify("100a01", startingState))
        assertFalse(verifier.verify("0000", startingState))
        assertFalse(verifier.verify("", startingState))
    }
}