package validIntegerTest

import org.example.Verifier
import org.example.validInteger.FirstInteger
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntegerTest {

    @Test
    fun testIntegers() {
        val verifier = Verifier()
        assertTrue(verifier.verify("1", FirstInteger()))
        assertTrue(verifier.verify("123", FirstInteger()))
        assertTrue(verifier.verify("3452342352434534524346", FirstInteger()))

        assertFalse(verifier.verify("", FirstInteger()))
        assertFalse(verifier.verify("0123", FirstInteger()))
        assertFalse(verifier.verify("123a", FirstInteger()))
        assertFalse(verifier.verify("0", FirstInteger()))
    }
}