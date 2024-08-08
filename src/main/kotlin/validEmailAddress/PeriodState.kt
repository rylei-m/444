package org.example.validEmailAddress

class PeriodState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            char.isLetterOrDigit() -> emailVerifier.state = Part3State()
            else -> emailVerifier.state = InvalidState()
        }
    }
}
