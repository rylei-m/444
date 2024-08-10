package org.example.validComplexPassword

import org.example.Invalid
import org.example.State
import org.example.Valid

class Valid: State, Valid {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in " " -> Invalid()
            in "~`!@#\$%^&*()_-+={[}]:;\"'<,>.?/|\\'" -> SpecialWithCapital()
            else -> Valid()
        }
    }
}