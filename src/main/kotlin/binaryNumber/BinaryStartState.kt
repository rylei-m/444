package org.example.binaryNumber

class BinaryStartState : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = MiddleState()
        } else {
            binaryVerifier.state = Invalid()
        }
    }
}