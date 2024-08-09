package org.example.binary

import org.example.Email.Valid
import org.example.Invalid
import org.example.State

class FirstBinaryNumber : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "1" -> Valid()
            in "0" -> Zero()
        }
        return Invalid()
    }

}