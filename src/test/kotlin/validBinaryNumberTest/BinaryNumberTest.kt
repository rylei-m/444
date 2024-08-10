package validBinaryNumberTest

import org.example.Verifier
import org.example.validBinaryNumber.FirstBinaryNumber
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryNumberTest {
    @Test
    fun testBinaryNumber() {
        val verifier = Verifier()

        assertTrue(verifier.verify("1", FirstBinaryNumber()))
        assertTrue(verifier.verify("11", FirstBinaryNumber()))
        assertTrue(verifier.verify("101", FirstBinaryNumber()))
        assertTrue(verifier.verify("11111111111", FirstBinaryNumber()))
        assertTrue(verifier.verify("10011010001", FirstBinaryNumber()))

        assertFalse(verifier.verify("01", FirstBinaryNumber()))
        assertFalse(verifier.verify("1000010", FirstBinaryNumber()))
        assertFalse(verifier.verify("100a01", FirstBinaryNumber()))
    }
}