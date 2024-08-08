package org.example.validEmailAddress

class AtSymbolState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            char == '.' -> {
                emailVerifier.incrementPeriodCount()
                emailVerifier.state = InvalidState()
            }
            emailVerifier.isValidChar(char) || char in "-_" -> {
                emailVerifier.state = Part2State()
            }
            else -> emailVerifier.state = InvalidState()
        }
    }
}
