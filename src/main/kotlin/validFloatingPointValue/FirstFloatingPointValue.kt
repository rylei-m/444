package org.example.validFloatingPointValue

import org.example.State
import org.example.Invalid

class FirstFloatingPointValue : State {
    override fun consumeCharacter(char: String): State {
        char in "123456789"; return NoPeriodYet()
        char in "0"; return PeriodState()
        return Invalid()
    }
}

char in "0123456789" -> floatingPointVerifier.state = FractionalPartState()
