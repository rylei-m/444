package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class Part4 : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in " " -> Invalid()
            in "A".."Z" -> Valid()
        }
        return Part4()
    }
}