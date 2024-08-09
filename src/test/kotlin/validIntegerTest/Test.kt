package validIntegerTest

import org.example.FirstFactory
import org.example.Verifier
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class Test {
    private val firstFactory = FirstFactory()
    private val verifier = Verifier()
    private val validator = firstFactory.firstCreate("validInteger")!!

    @Test
    fun testIntegers() {
        val verifier = Verifier()
        println("---Integers---")
        println("Should Be True:")
        assertTrue(verifier.verify("1", validator))
        assertTrue(verifier.verify("123", validator))
        assertTrue(verifier.verify("3452342352434534524346", validator))
        println("Should Be False:")
        assertFalse(verifier.verify("", validator))
        assertFalse(verifier.verify("0123", validator))
        assertFalse(verifier.verify("0", validator))
        assertFalse(verifier.verify("123abc123", validator))
    }
}