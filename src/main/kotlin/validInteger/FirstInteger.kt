package org.example.validInteger

import org.example.Invalid
import org.example.State

class FirstInteger: State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "123456789" -> Valid()
        }
        return Invalid()
    }
}