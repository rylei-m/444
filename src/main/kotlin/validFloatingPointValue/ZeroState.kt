package org.example.validFloatingPointValue

import org.example.Invalid
import org.example.State

class ZeroState: State {
    override fun consumeCharacter(char: String) : State {
        if (char == ".") {  PeriodState() }
        if (char in "0123456789") { ZeroState() }
        return Invalid()
    }
}
    