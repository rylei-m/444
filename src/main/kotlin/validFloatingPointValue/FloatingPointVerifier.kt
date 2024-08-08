package org.example.validFloatingPointValue

class FloatingPointVerifier {
    lateinit var state: FloatingPointState

    fun verify(string: String): Boolean {
        state = IntegerState()
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is FractionalPartState || state is Valid
    }
}