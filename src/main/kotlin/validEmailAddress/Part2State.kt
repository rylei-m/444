package org.example.validEmailAddress

class Part2State : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            char == '.' -> {
                emailVerifier.incrementPeriodCount()
                emailVerifier.state = PeriodState()
            }
            emailVerifier.isValidChar(char) || char in "-_" -> emailVerifier.state = Part2State()

            else -> emailVerifier.state = InvalidState()
        }
    }
}