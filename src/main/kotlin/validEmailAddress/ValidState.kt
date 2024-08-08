package org.example.validEmailAddress

class ValidState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        // In a valid state, no more characters should be processed.
        // If more characters are present, the state becomes invalid.
        emailVerifier.state = InvalidState()
    }
}
