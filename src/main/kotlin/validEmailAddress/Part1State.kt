package org.example.validEmailAddress

class Part1State : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when (char) {
            '@' -> {
                emailVerifier.state = AtSymbolState()
            }
            '.' -> {
                emailVerifier.incrementPeriodCount()
                emailVerifier.state = InvalidState()
            }
            else -> if (emailVerifier.isValidChar(char)) {
                emailVerifier.state = Part1State()
            } else {
                emailVerifier.state = InvalidState()
            }
        }
    }
}
