package org.example.binaryNumber

interface BinaryState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}