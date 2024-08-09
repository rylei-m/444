package validIntegerTest

import org.example.FirstFactory
import org.example.Verifier

class Test {
    private val firstFactory = FirstFactory()

    @Test
    fun testIntegers() {
        val verifier = Verifier()
        println("---Integers---")
        println("Should Be True:")
        println(verifier.verify("1", firstFactory.firstCreate("validInteger")!!))
        println(verifier.verify("123", firstFactory.firstCreate("validInteger")!!))
        println(verifier.verify("3452342352434534524346", firstFactory.firstCreate("validInteger")!!))
        println("Should Be False:")
        println(verifier.verify("", firstFactory.firstCreate("validInteger")!!))
        println(verifier.verify("0123", firstFactory.firstCreate("validInteger")!!))
        println(verifier.verify("0", firstFactory.firstCreate("validInteger")!!))
        println(verifier.verify("123abc123", firstFactory.firstCreate("validInteger")!!))
    }
}