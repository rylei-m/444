package org.example.validBinaryNumber

class MiddleState : BinaryNumberState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        when (char) {
            "1" -> binaryVerifier.state = EndState()
            "0" -> binaryVerifier.state = MiddleState()
            else -> binaryVerifier.state = Invalid()
        }
    }
}