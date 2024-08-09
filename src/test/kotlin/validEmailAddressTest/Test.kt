package validEmailAddressTest

import org.example.FirstFactory
import org.example.Verifier
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class Test {
    private val firstFactory = FirstFactory()
    private val verifier = Verifier()
    private val validator = firstFactory.firstCreate("validEmailAddress")!!

    @Test
    fun testEmailAddress() {
        val verifier = Verifier()
        println("---EmailAddress---")
        println("Should Be True:")
        assertTrue(verifier.verify("abc@def.ghi", validator))
        assertTrue(verifier.verify("a@b.c", validator))
        assertTrue(verifier.verify("joseph.ditton@usu.edu", validator))
        assertTrue(verifier.verify("{}*\$.&\$*(@*\$%&.*&*", validator))
        println("Should Be False:")
        assertFalse(verifier.verify("@b.c", validator))
        assertFalse(verifier.verify("a@b@c.com", validator))
        assertFalse(verifier.verify("a.b@b.b.c", validator))
        assertFalse(verifier.verify("joseph ditton@usu.edu", validator))
        println(" ")
    }
}