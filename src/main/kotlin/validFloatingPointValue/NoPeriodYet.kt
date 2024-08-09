package org.example.validFloatingPointValue

import org.example.Invalid
import org.example.State

class NoPeriodYet: State {
    override fun consumeCharacter(char: String) : State {
        when (char) {
            in "." -> PeriodState()
            in "0123456789" -> NoPeriodYet()
        }
        return Invalid()
    }
}