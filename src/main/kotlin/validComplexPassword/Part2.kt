package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class Part2 : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "!@#\$%&*;" -> Part3()
            in " " -> Invalid()
        }
        return Part2()
    }
}