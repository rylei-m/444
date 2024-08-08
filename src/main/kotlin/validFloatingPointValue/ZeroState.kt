package org.example.validFloatingPointValue

class ZeroState: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char == ".") {
            floatingPointVerifier.state = PeriodState()
        } else {
            floatingPointVerifier.state = Invalid()
        }
    }
}