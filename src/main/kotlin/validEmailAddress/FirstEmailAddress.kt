package org.example.Email

import org.example.Invalid
import org.example.State

class FirstEmailAddress : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "@ " -> Invalid()
            else -> LocalPart()
        }
    }
}