package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class Part1 : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in "!@#\$%&*;" -> Part4()
            in "A".."Z" -> Part2()
            in " " -> Invalid()
        }
        return Part1()
    }
}