package org.example.validComplexPassword

class HasCapitalState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        val specialChars = "!@#$%&*;".toCharArray()

        when {
            char in specialChars -> {
                complexPasswordVerifier.hasSpecialChar = true
                complexPasswordVerifier.state = HasSpecialCharState()
            }
            else -> complexPasswordVerifier.state = RegularCharState()
        }
    }
}