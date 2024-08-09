package validComplexPasswordTest

import org.example.State
import org.example.Verifier
import org.example.validBinaryNumber.FirstBinaryNumber
import org.example.validComplexPassword.FirstComplexPassword
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ComplexPasswordTest {

    @Test
    fun testComplexPassword() {
        val verifier = Verifier()
        val startPoint = FirstComplexPassword()


        println("---ComplexPassword---")
        println("Should Be True:")
        assertTrue(verifier.verify("aaaaH!aa", startPoint))
        assertTrue(verifier.verify("1234567*9J", startPoint))
        assertTrue(verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH", startPoint))
        assertTrue(verifier.verify("AAAAAA!AAA", startPoint))
        println("Should Be False:")
        assertFalse(verifier.verify("a", startPoint))
        assertFalse(verifier.verify("aaaaaaaa!", startPoint))
        assertFalse(verifier.verify("aaaHaaaaa", startPoint))
        assertFalse(verifier.verify("Abbbbbbb!", startPoint))
    }
}