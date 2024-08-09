package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class Part3 : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "!@#\$%&*;" -> Part3()
            in " " -> Invalid()
        }
        return Valid()
    }
}