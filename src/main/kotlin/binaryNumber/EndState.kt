package org.example.binaryNumber

class EndState : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = Valid()
        } else if (char in "01"){
            binaryVerifier.state = MiddleState()
        } else {
            binaryVerifier.state = Invalid()
        }
    }
}