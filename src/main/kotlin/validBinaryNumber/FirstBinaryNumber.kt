package org.example.validBinaryNumber

import org.example.Invalid
import org.example.State

class FirstBinaryNumber : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "1" -> Valid()
            else -> Invalid()
        }
    }
}