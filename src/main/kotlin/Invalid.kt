package org.example

class Invalid : State {
    override fun consumeCharacter(char: String): State {
        return Invalid()
    }
}