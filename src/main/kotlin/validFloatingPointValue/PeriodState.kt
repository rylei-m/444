package org.example.validFloatingPointValue

import org.example.Invalid
import org.example.State

class PeriodState: State {
    override fun consumeCharacter(char: String) : State {
        return when (char) {
            in "0123456789" -> Valid()
            else -> Invalid()
        }
    }
}