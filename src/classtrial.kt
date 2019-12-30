package foo

private fun foo() {} // can see foo() function in this file

public var bar: Int = 5 // can anywhere property
    private set // can see setter in this file

internal val baz = 6    // can see in same module