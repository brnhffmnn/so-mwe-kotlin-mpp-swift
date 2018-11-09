package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJVM {

    val somethingTest = object : MyKotlinInterface {
        override fun run(): Sequence<String> = sequenceOf("test")
    }

    @Test
    fun testHello() {
        hello(somethingTest).also {
            assertTrue("JVM" in it)
            assertTrue("test" in it)
        }
    }
}