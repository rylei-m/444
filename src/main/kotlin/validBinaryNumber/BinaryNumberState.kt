package org.example.validBinaryNumber

interface BinaryNumberState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}