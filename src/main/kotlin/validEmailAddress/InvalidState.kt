package org.example.validEmailAddress

class InvalidState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        // Once in InvalidState, it remains invalid regardless of further input.
    }
}
