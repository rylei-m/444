package org.example.validComplexPassword

class HasCapitalState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when {
            char in "!@#$%&*;" -> {
                complexPasswordVerifier.hasSpecialChar = true
                complexPasswordVerifier.state = HasSpecialCharState()
            }
            else -> complexPasswordVerifier.state = RegularCharState()
        }
    }
}
