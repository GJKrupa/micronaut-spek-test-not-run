package notest

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("notest")
                .mainClass(Application.javaClass)
                .start()
    }
}