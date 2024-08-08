package org.example.binaryNumber

class EndState : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        when (char) {
            "1" -> binaryVerifier.state = Valid() // Successfully ended with '1'
            else -> binaryVerifier.state = Invalid()
        }
    }
}