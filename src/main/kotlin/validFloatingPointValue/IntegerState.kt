package org.example.validFloatingPointValue

class IntegerState: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        when (char) {
            in "123456789" -> floatingPointVerifier.state = IntegerPartState()
            "0" -> floatingPointVerifier.state = ZeroState()
            "." -> floatingPointVerifier.state = PeriodState()
            else -> floatingPointVerifier.state = Invalid()
        }
    }
}