package validComplexPassword

import org.example.Invalid
import org.example.State
import org.example.validComplexPassword.Basic
import org.example.validComplexPassword.CapitalWithoutSpecial
import org.example.validComplexPassword.SpecialWithoutCapital

class FirstComplexPassword : State {
    override fun consumeCharacter(char: String): State {
        return when (char) {
            in "~`!@#$%^&*()_-+={[}]:;\"'<,>.?/|\\'" -> SpecialWithoutCapital()
            in "ABCDEFGHIJKLMNOPQRSTUVWXYZ" -> CapitalWithoutSpecial()
            in " " -> Invalid()
            else -> Basic()
        }
    }
}