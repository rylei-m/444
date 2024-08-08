package org.example.validEmailAddress

class Part2State : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            char == '.' -> emailVerifier.incrementPeriodCount()
            char.isLetterOrDigit() || char in "-_" -> {
            }
            else -> emailVerifier.state = InvalidState()
        }
    }
}
