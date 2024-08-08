package org.example.validFloatingPointValue

interface FloatingPointState {
    fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier)
}
