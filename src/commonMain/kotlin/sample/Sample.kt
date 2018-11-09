package sample

interface MyKotlinInterface {
    fun run() : Sequence<String>
}

expect object Platform {
    fun name(): String
}

fun hello(something: MyKotlinInterface): String = "Hello from ${Platform.name()} ... ${something.run().joinToString()}"