package org.example.validEmailAddress

class StartState : EmailState {
    override fun consumeCharacter(char: Char, emailVerifier: EmailVerifier) {
        if (emailVerifier.isValidChar(char) || char in "-_.") {
            emailVerifier.state = Part1State()
        } else {
            emailVerifier.state = InvalidState()
        }
    }
}
