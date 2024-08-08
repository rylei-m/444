package org.example.validComplexPassword

class InitialState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when (char) {
            in 'A'..'Z' -> {
                complexPasswordVerifier.hasCapitalLetter = true
                complexPasswordVerifier.state = HasCapitalState()
            }
            in "!@#$%&*;" -> {
                complexPasswordVerifier.hasSpecialChar = true
                complexPasswordVerifier.state = HasSpecialCharState()
            }
            in 'a'..'z' -> {
                complexPasswordVerifier.state = RegularCharState()
            }
            in "0123456789" -> {
                complexPasswordVerifier.state = HasNumberState()
            }
            else -> complexPasswordVerifier.state = InvalidState()
        }
    }
}
