package org.example.validComplexPassword

class ValidState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        if (char in "!@#$%&*;") {
            complexPasswordVerifier.endsWithSpecialChar = true
            complexPasswordVerifier.state = InvalidState()
        }
    }
}