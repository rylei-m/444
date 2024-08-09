package org.example.Email

import org.example.Invalid
import org.example.State

class FirstEmailAddress : State {
    override fun consumeCharacter(char: String): State {
        when {
            char in " " || char in "@" -> Invalid()
        }
        return LocalPart()
    }
}