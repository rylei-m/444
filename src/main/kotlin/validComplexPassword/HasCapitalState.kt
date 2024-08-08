package org.example.validComplexPassword

class HasCapitalState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when (char) {
            in "!@#$%&*;" -> {
                complexPasswordVerifier.hasSpecialChar = true
                complexPasswordVerifier.state = HasSpecialCharState()
            }
            in 'a'..'z' -> complexPasswordVerifier.state = RegularCharState()
            in 'A'..'Z' -> complexPasswordVerifier.state = this
            in "0123456789" -> {
                complexPasswordVerifier.state = HasNumberState()
            }
            else -> complexPasswordVerifier.state = InvalidState()
        }
    }
}
