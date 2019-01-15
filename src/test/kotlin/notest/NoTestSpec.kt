package notest

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe

object NoTestSpec: Spek({
    describe("NoTestSpec Suite") {
        describe("we don't throw an exception") {
            throw IllegalArgumentException("Fails")
        }
    }
})
