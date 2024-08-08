package org.example.validEmailAddress

class InvalidState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
    }
}
