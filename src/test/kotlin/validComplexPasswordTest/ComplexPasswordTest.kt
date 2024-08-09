package validComplexPasswordTest

import org.example.FirstFactory
import org.example.Verifier
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ComplexPasswordTest {
    private val firstFactory = FirstFactory()

    @Test
    fun testComplexPassword() {
        val verifier = Verifier()
        val validator = firstFactory.firstCreate("validComplexPassword")!!

        println("---ComplexPassword---")
        println("Should Be True:")
        assertTrue(verifier.verify("aaaaH!aa", validator))
        assertTrue(verifier.verify("1234567*9J", validator))
        assertTrue(verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH", validator))
        assertTrue(verifier.verify("AAAAAA!AAA", validator))
        println("Should Be False:")
        assertFalse(verifier.verify("a", validator))
        assertFalse(verifier.verify("aaaaaaaa!", validator))
        assertFalse(verifier.verify("aaaHaaaaa", validator))
        assertFalse(verifier.verify("Abbbbbbb!", validator))
        println(" ")
    }
}