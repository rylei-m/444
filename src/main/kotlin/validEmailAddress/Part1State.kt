package org.example.validEmailAddress

class Part1State : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        when {
            char == '@' -> {
                emailVerifier.incrementAtSymbolCount()
                emailVerifier.state = AtSymbolState()
            }
            char.isLetterOrDigit() || char in "-_." -> Part1State()
            else -> emailVerifier.state = InvalidState()
        }
    }
}
