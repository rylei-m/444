package org.example.validBinaryNumber

class EndState : BinaryNumberState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        when (char) {
            "1" -> binaryVerifier.state = Valid()
            "0" -> binaryVerifier.state = MiddleState()
            else -> binaryVerifier.state = Invalid()
        }
    }
}