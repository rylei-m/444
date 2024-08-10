package validComplexPasswordTest

import org.example.Verifier
import validComplexPassword.FirstComplexPassword
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ComplexPasswordTest {

    @Test
    fun testComplexPassword() {
        val verifier = Verifier()


        assertTrue(verifier.verify("aaaaH!aa", FirstComplexPassword()))
        assertTrue(verifier.verify("1234567*9J", FirstComplexPassword()))
        assertTrue(verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH", FirstComplexPassword()))
        assertTrue(verifier.verify("AAAAAA!AAA", FirstComplexPassword()))

        assertFalse(verifier.verify("a", FirstComplexPassword()))
        assertFalse(verifier.verify("aaaaaaaa!", FirstComplexPassword()))
        assertFalse(verifier.verify("aaaHaaaaa", FirstComplexPassword()))
        assertFalse(verifier.verify("Abbbbbbb!", FirstComplexPassword()))
    }
}