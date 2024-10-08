package org.example.validBinaryNumber

import org.example.Invalid
import org.example.State

class Zero : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "0" -> Zero()
            in "1" -> Valid()
            else -> Invalid()
        }
    }
}