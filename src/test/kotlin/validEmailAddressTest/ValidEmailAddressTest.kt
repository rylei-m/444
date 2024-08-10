package validEmailAddressTest

import org.example.Email.FirstEmailAddress
import org.example.Verifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidEmailAddressTest {

    @Test
    fun testEmailAddress() {
        val verifier = Verifier()
        assertTrue(verifier.verify("abc@def.ghi", FirstEmailAddress()))
        assertTrue(verifier.verify("a@b.c", FirstEmailAddress()))
        assertTrue(verifier.verify("joseph.ditton@usu.edu", FirstEmailAddress()))
        assertTrue(verifier.verify("{}*\$.&\$*(@*\$%&.*&*", FirstEmailAddress()))

        assertFalse(verifier.verify("@b.c", FirstEmailAddress()))
        assertFalse(verifier.verify("a@b@c.com", FirstEmailAddress()))
        assertFalse(verifier.verify("a.b@b.b.c", FirstEmailAddress()))
        assertFalse(verifier.verify("joseph ditton@usu.edu", FirstEmailAddress()))
    }
}