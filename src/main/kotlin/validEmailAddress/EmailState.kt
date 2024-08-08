package org.example.validEmailAddress

interface EmailState {
    fun consumeCharacter(char: Char, emailVerifier: EmailVerifier)
}
