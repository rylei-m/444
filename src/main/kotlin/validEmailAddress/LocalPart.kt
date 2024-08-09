package org.example.Email

import org.example.State
import org.example.Invalid

class LocalPart : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "@" -> MailServer()
            in " " -> Invalid()
        }
        return LocalPart()
    }
}