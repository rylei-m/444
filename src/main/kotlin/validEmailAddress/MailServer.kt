package org.example.Email

import org.example.Invalid
import org.example.State

class MailServer : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "." -> Domain()
            in "@", in " " -> Invalid()
        }
        return MailServer()
    }
}