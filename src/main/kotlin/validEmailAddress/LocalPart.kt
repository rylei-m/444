package org.example.Email

import org.example.State
import org.example.Invalid

class LocalPart : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "@" -> MailServer()
            in " " -> Invalid()
            else -> LocalPart()
        }
    }
}