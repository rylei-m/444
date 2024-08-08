package org.example.validEmailAddress

class Part3State : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            emailVerifier.isValidChar(char) -> emailVerifier.state = ValidState()
            else -> emailVerifier.state = InvalidState()
        }
    }
}
