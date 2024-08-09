package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class CapitalWithoutSpecial : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "!@#\$%&*;" -> SpecialWithCapital()
            in " " -> Invalid()
        }
        return CapitalWithoutSpecial()
    }
}