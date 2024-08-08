package org.example.validBinaryNumber

class BinaryVerifier {
    lateinit var state: BinaryState

    fun verify(string: String): Boolean {
        if (string.isEmpty()) return false

        state = BinaryStartState()
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is Valid
    }
}