package validEmailAddressTest

import org.example.Email.FirstEmailAddress
import org.example.Verifier
import org.example.validBinaryNumber.FirstBinaryNumber
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ValidEmailAddressTest {
    val startingState = FirstEmailAddress()

    @Test
    fun testEmailAddress() {
        val verifier = Verifier()
        println("---EmailAddress---")
        println("Should Be True:")
        assertTrue(verifier.verify("abc@def.ghi", startingState))
        assertTrue(verifier.verify("a@b.c", startingState))
        assertTrue(verifier.verify("joseph.ditton@usu.edu", startingState))
        assertTrue(verifier.verify("{}*\$.&\$*(@*\$%&.*&*", startingState))
        println("Should Be False:")
        assertFalse(verifier.verify("@b.c", startingState))
        assertFalse(verifier.verify("a@b@c.com", startingState))
        assertFalse(verifier.verify("a.b@b.b.c", startingState))
        assertFalse(verifier.verify("joseph ditton@usu.edu", startingState))
        println(" ")
    }
}