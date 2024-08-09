package org.example

import org.example.Email.FirstEmailAddress
import org.example.validBinaryNumber.FirstBinaryNumber
import org.example.validComplexPassword.FirstComplexPassword
import org.example.validFloatingPointValue.FirstFloatingPointValue
import org.example.validInteger.FirstInteger

class FirstFactory {
    private val firstState = mapOf(
        Pair("validInteger", FirstInteger()),
        Pair("validFloatingPoint", FirstFloatingPointValue()),
        Pair("validBinaryNumber", FirstBinaryNumber()),
        Pair("validEmailAddress", FirstEmailAddress()),
        Pair("validComplexPassword", FirstComplexPassword()),
        )

    fun firstCreate(type: String) : State? {
        return firstState[type]
    }
}