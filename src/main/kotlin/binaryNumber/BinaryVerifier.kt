package org.example.binaryNumber

class BinaryVerifier {
    lateinit var state: BinaryState

    fun verify(string: String): Boolean {
        state = BinaryStartState()
        if (string.isEmpty()) return false

        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is Valid
    }
}