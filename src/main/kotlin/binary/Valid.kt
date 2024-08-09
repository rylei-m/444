package org.example.binary

import org.example.Invalid
import org.example.State
import org.example.Valid

class Valid : State, Valid {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "1" -> Valid()
            in "0" -> Zero()
        }
        return Invalid()
    }
}