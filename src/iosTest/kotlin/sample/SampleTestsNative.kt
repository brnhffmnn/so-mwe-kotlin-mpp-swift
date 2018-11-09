package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsNative {

    val somethingTest = object : MyKotlinInterface {
        override fun run(): Sequence<String> = sequenceOf("test")
    }

    @Test
    fun testHello() {
        hello(somethingTest).also {
            assertTrue("iOS" in it)
            assertTrue("test" in it)
        }
    }
}