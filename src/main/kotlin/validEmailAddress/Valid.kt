package org.example.Email

import org.example.Invalid
import org.example.State

class Valid : State {
    override fun consumeCharacter(char: String) : State {
        when (char) {
            in "@", " " -> Invalid()
        }
        return Valid()
    }
}