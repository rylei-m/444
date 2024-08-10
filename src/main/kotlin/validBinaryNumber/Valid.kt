package org.example.validBinaryNumber

import org.example.Invalid
import org.example.State
import org.example.Valid

class Valid: State, Valid {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "1" -> Valid()
            in "0" -> Zero()
            else -> Invalid()
        }
    }
}