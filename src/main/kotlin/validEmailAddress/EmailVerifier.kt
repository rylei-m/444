package org.example.validEmailAddress

class EmailVerifier {
    lateinit var state: EmailState
    var atSymbolCount = 0
    var periodCount = 0

    fun verify(string: String): Boolean {
        state = StartState()
        string.forEach { char ->
            state.consumeCharacter(char, this)
        }
        return state is ValidState && atSymbolCount == 1 && periodCount == 1
    }
    fun isValidChar(char: Char): Boolean {
        return !char.isWhitespace() && char != '@'
    }

    fun incrementAtSymbolCount() {
        atSymbolCount++
    }

    fun incrementPeriodCount() {
        periodCount++
    }
}
