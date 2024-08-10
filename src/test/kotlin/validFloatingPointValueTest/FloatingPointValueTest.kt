package validFloatingPointValueTest

import org.example.Verifier
import org.example.validFloatingPointValue.FirstFloatingPointValue
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FloatingPointValueTest {

    @Test
    fun testFloatingPointValues() {
        val verifier = Verifier()

        assertTrue(verifier.verify("1.0", FirstFloatingPointValue()))
        assertTrue(verifier.verify("1223.34", FirstFloatingPointValue()))
        assertTrue(verifier.verify("0.200000", FirstFloatingPointValue()))
        assertTrue(verifier.verify("123456789.123456789098", FirstFloatingPointValue()))
        assertTrue(verifier.verify(".123", FirstFloatingPointValue()))

        assertFalse(verifier.verify("123", FirstFloatingPointValue()))
        assertFalse(verifier.verify("123.123.", FirstFloatingPointValue()))
        assertFalse(verifier.verify("123.02a", FirstFloatingPointValue()))
        assertFalse(verifier.verify("123.", FirstFloatingPointValue()))
        assertFalse(verifier.verify("012.4", FirstFloatingPointValue()))
    }
}
