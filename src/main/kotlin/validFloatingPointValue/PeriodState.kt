package org.example.validFloatingPointValue

import org.example.Invalid
import org.example.State

class PeriodState: State {
    override fun consumeCharacter(char: String) : State {
        when (char) {
            in "0123456789" -> Valid()
        }
        return Invalid()
    }
}