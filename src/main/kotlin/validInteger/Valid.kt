package org.example.validInteger

import org.example.State
import org.example.Valid
import org.example.Verifier

class Valid: State, Valid {
    override fun consumeCharacter(char: String, verifier: Verifier): State {
        if (char !in "0123456789") {
            return Invalid()
        }
    }
}