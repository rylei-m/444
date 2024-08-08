package org.example.validComplexPassword

class HasSpecialCharState : ComplexPasswordState {
    override fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier) {
        when (char) {
            in 'A'..'Z' -> complexPasswordVerifier.state = HasCapitalState()
            in "!@#$%&*;" -> complexPasswordVerifier.endsWithSpecialChar = true
            in 'a'..'z' -> complexPasswordVerifier.state = RegularCharState()
            in "0123456789" -> complexPasswordVerifier.state = HasNumberState()
            else -> complexPasswordVerifier.state = RegularCharState()
        }
    }
}
