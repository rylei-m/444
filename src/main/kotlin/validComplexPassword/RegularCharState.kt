package org.example.validComplexPassword

class RegularCharState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when {
            char in 'A'..'Z' -> complexPasswordVerifier.state = HasCapitalState()
            char in "!@#$%&*;" -> {
                complexPasswordVerifier.hasSpecialChar = true
                complexPasswordVerifier.state = HasSpecialCharState()
            }
            else -> complexPasswordVerifier.state = this
        }
    }
}