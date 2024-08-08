package org.example.validFloatingPointValue

class PeriodState: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        when {
            char in "0123456789" -> floatingPointVerifier.state = FractionalPartState()
            else -> floatingPointVerifier.state = Invalid()
        }
    }
}