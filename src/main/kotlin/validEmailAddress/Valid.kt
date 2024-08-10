package org.example.Email

import org.example.Invalid
import org.example.State
import org.example.Valid

class Valid: State, Valid {
    override fun consumeCharacter(char: String) : State {
        return when (char) {
            in "@ ." -> Invalid()
            else -> Valid()
        }
    }
}