// IGNORE_IF_NEW_INFERENCE_ENABLED

fun foo(n: Number) = n

fun test() {
    foo(<!CONSTANT_EXPECTED_TYPE_MISMATCH!>'a'<!>)

    val c = 'c'
    foo(<!TYPE_MISMATCH!>c<!>)

    val d: Char? = 'd'
    foo(<!TYPE_MISMATCH!>d!!<!>)
}
