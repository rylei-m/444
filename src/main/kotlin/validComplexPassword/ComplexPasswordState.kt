package org.example.validComplexPassword

interface ComplexPasswordState {
    fun consumeCharacter(char: Char, complexPasswordVerifier: ComplexPasswordVerifier)
}
