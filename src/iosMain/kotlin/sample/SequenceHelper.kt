package sample

// have to mirror all desired functions here

fun <T> sequenceOf(elements: Array<T>): kotlin.sequences.Sequence<T> = kotlin.sequences.sequenceOf(*elements)

fun <T : kotlin.Any> generateSequence(nextFunction: () -> T?): kotlin.sequences.Sequence<T> = kotlin.sequences.generateSequence(nextFunction)

// mirroring extensions functions is harder
// public fun <T> kotlin.collections.Iterator<T>.asSequence(): kotlin.sequences.Sequence<T> = // ???