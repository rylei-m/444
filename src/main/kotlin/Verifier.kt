package org.example

class Verifier {

    fun verify(string: String, firstState: State): Boolean {
        var state = firstState
        string.chunked(1).forEach {
            state = state.consumeCharacter(it)
        }
        return state is Valid
    }
}