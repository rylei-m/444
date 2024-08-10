package org.example.Email

import org.example.Invalid
import org.example.State

class MailServer : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "." -> Domain()
            in "@ " -> Invalid()
            else -> MailServer()
        }
    }
}