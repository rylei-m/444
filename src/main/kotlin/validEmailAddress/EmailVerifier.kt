package org.example.validEmailAddress

class EmailVerifier {
    lateinit var state: EmailState
    private var atSymbolCount = 0
    private var periodCount = 0

    fun verify(string: String): Boolean {
        state = StartState()
        string.forEach { char ->
            state.consumeCharacter(char, this)
        }
        return state is ValidState && atSymbolCount == 1 && periodCount == 1
    }

    fun incrementAtSymbolCount() {
        atSymbolCount++
    }

    fun incrementPeriodCount() {
        periodCount++
    }
}
