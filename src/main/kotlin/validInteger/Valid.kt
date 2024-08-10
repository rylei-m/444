package org.example.validInteger

import org.example.Invalid
import org.example.State
import org.example.Valid

class Valid: State, Valid {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "0123456789" -> Valid()
            else -> Invalid()
        }
    }
}