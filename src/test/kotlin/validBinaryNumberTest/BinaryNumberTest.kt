package validBinaryNumberTest

import org.example.FirstFactory
import org.example.Verifier
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test


class BinaryNumberTest {
    private val firstFactory = FirstFactory()

    @Test
    fun testBinaryNumber() {
        val verifier = Verifier()
        val validator = firstFactory.firstCreate("validBinaryNumber")!!

        println("---ComplexPassword---")
        println("Should Be True:")
        assertTrue(verifier.verify("1", validator))
        assertTrue(verifier.verify("11", validator))
        assertTrue(verifier.verify("101", validator))
        assertTrue(verifier.verify("10011010001", validator))
        println("Should Be False:")
        assertFalse(verifier.verify("01", validator))
        assertFalse(verifier.verify("10", validator))
        assertFalse(verifier.verify("1000010", validator))
        assertFalse(verifier.verify("100a01", validator))
        assertFalse(verifier.verify("0000", validator))
        assertFalse(verifier.verify("", validator))
    }
}