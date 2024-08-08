package org.example.validBinaryNumber

class BinaryStartState : BinaryNumberState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = MiddleState()
        } else {
            binaryVerifier.state = Invalid()
        }
    }
}