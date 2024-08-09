package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class FirstComplexPassword : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "!@#\$%&*;" -> SpecialWithoutCapital()
            in "A".."Z" -> CapitalWithoutSpecial()
            in " " -> Invalid()
        }
        return Basic()
    }
}