package org.example.validComplexPassword

class ComplexPasswordVerifier {
    lateinit var state: ComplexPasswordState
    var hasCapitalLetter: Boolean = false
    var hasSpecialChar: Boolean = false
    var endsWithSpecialChar: Boolean = false

    fun verify(string: String): Boolean {
        state = InitialState()
        hasCapitalLetter = false
        hasSpecialChar = false
        endsWithSpecialChar = false

        if (string.length < 8) {
            return false
        }

        string.forEachIndexed { index, char ->
            state.consumeCharacter(char, this)
            if (index == string.lastIndex) {
                endsWithSpecialChar = char in "!@#$%&*;"
            }
        }

        return state is HasCapitalState || state is RegularCharState || state is ValidState
    }
}