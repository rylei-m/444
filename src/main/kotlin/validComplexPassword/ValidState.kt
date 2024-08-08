package org.example.validComplexPassword

class ValidState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        if (char !in 'a'..'z' || char !in 'A'..'Z' || char in "!@#$%&*;" || char !in "0123456789") {
            complexPasswordVerifier.state = InvalidState()
        }
    }
}