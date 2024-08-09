package org.example.binary

import org.example.Invalid
import org.example.State

class Zero : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "0" -> Zero()
            in "1" -> Valid()
        }
        return Invalid()
    }
}