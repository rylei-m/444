package org.example.Email

import org.example.Invalid
import org.example.State
import org.example.Valid

class Domain : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "@", " " -> Invalid()
        }
        return Valid()
    }
}
