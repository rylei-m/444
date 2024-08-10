package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class CapitalWithoutSpecial : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "~`!@#\$%^&*()_-+={[}]:;\"'<,>.?/|\\'" -> SpecialWithCapital()
            in " " -> Invalid()
            else -> CapitalWithoutSpecial()
        }
    }
}