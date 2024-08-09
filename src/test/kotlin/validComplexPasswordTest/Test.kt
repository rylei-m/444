package validComplexPasswordTest

import org.example.FirstFactory
import org.example.Verifier

class Test {
    private val firstFactory = FirstFactory()

    @Test
    fun testComplexPassword() {
        val verifier = Verifier()
        println("---ComplexPassword---")
        println("Should Be True:")
        println(verifier.verify("aaaaH!aa", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("1234567*9J", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("AAAAAA!AAA", firstFactory.firstCreate("validComplexPassword")!!))
        println("Should Be False:")
        println(verifier.verify("a", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("aaaaaaaa!", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("aaaHaaaaa", firstFactory.firstCreate("validComplexPassword")!!))
        println(verifier.verify("Abbbbbbb!", firstFactory.firstCreate("validComplexPassword")!!))
        println(" ")
    }
}