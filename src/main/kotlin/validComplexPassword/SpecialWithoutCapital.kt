package org.example.validComplexPassword

import org.example.Invalid
import org.example.State

class SpecialWithoutCapital : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in " " -> Invalid()
            in "ABCDEFGHIJKLMNOPQRSTUVWXYZ" -> Valid()
            else -> SpecialWithoutCapital()
        }
    }
}