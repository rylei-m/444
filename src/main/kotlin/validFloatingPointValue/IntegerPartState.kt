package org.example.validFloatingPointValue

class IntegerPartState: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        when (char) {
            "." -> floatingPointVerifier.state = PeriodState()
            !in "0123456789" -> floatingPointVerifier.state = Invalid()
        }
    }
}