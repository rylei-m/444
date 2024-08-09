package validEmailAddressTest

import org.example.FirstFactory
import org.example.Verifier

class Test {
    private val firstFactory = FirstFactory()

    @Test
    fun testEmailAddress() {
        val verifier = Verifier()
        println("---EmailAddress---")
        println("Should Be True:")
        println(verifier.verify("abc@def.ghi", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("a@b.c", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("joseph.ditton@usu.edu", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("{}*\$.&\$*(@*\$%&.*&*", firstFactory.firstCreate("validEmailAddress")!!))
        println("Should Be False:")
        println(verifier.verify("@b.c", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("a@b@c.com", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("a.b@b.b.c", firstFactory.firstCreate("validEmailAddress")!!))
        println(verifier.verify("joseph ditton@usu.edu", firstFactory.firstCreate("validEmailAddress")!!))
        println(" ")
    }
}