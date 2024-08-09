package org.example

interface State {
    fun consumeCharacter(char: String): State
}