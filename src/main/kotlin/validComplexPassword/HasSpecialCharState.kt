package org.example.validComplexPassword

class HasSpecialCharState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when (char) {
            in 'A'..'Z' -> complexPasswordVerifier.state = ValidState()
            in "!@#$%&*;" -> {
                complexPasswordVerifier.endsWithSpecialChar = true
                complexPasswordVerifier.state = InvalidState()
            }
            else -> complexPasswordVerifier.state = RegularCharState()
        }
    }
}
