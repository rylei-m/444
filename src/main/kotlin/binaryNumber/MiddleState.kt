package org.example.binaryNumber

class MiddleState : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        when (char) {
            "0", "1" -> binaryVerifier.state = MiddleState() // Continue to be in MiddleState
            else -> binaryVerifier.state = Invalid()
        }
    }
}
