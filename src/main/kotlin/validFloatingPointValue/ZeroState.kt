package org.example.validFloatingPointValue

import org.example.Invalid
import org.example.State

class ZeroState: State {
    override fun consumeCharacter(char: String) : State {
        return when (char) {
            in "." -> PeriodState()
            else -> Invalid()
        }
    }
}
