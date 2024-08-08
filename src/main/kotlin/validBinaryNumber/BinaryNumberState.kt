package org.example.validBinaryNumber

interface BinaryState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}