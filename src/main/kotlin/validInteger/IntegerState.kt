package org.example.validInteger

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)
}