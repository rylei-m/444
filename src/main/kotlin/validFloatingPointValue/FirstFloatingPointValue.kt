package org.example.validFloatingPointValue

import org.example.State
import org.example.Invalid

class FirstFloatingPointValue : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "123456789" -> NoPeriodYet()
            in "." -> PeriodState()
            in "0" -> ZeroState()
            else -> Invalid()
        }
    }
}