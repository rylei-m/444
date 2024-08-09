package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class SpecialWithoutCapital : State {
    override fun consumeCharacter(char: String): State {
        when (char) {
            in " " -> Invalid()
            in "A".."Z" -> Valid()
        }
        return SpecialWithoutCapital()
    }
}