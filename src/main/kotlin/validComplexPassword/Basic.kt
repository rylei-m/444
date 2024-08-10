package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class Basic : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "~`!@#\$%^&*()_-+={[}]:;\"'<,>.?/|\\'" -> SpecialWithoutCapital()
            in "ABCDEFGHIJKLMNOPQRSTUVWXYZ" -> CapitalWithoutSpecial()
            in " " -> Invalid()
            else -> Basic()
        }
    }
}