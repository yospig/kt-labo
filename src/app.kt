fun main(args: Array<String>) {
    println("hello world!")

    // immutable
    val a: Int = 1
    // type inference
    val b = 1
    // not exists default
    val c: Int
    c = 1
    // mutable
    var d: Int = 1
    d += 2

    // use for loop
    for (arg in args)
        print(arg)

    // use another for loop
    for (i in args.indices)
        print(args[i])

    // use while loop
    var i = 0
    while (i < args.size)
        print(args[i++])

    // in range
    val e: Int = 8
    if (e in 1..10)
        println("in range OK")

    // out of range
    if (e !in 1..4)
        println("out of range")

    // range loop
    for (e in 1..5)
        print(e)

    // collection
    val numbers = listOf(1, 2, 3, 4, 5)
    for (num in numbers)
        println(num)

    if (2 in numbers)
        println("Yes")

    numbers
        .sortedBy { it.dec() }
        .forEach { print(it) }

    // string template
    if (args.size == 0) return
    print("First argument: ${args[0]}")

    if (args.size < 2) {
        print("Two integers expected")
        return
    }

    val x = perseInt(args[0])
    val y = perseInt(args[1])
    if (x != null && y != null)
        print(x * y)
}

// normal function
fun sum(a: Int, b: Int): Int {
    return a + b
}

// void function
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

// use if expression
fun another_max(a: Int, b: Int) = if (a > b) a else b

// nullable return value
fun perseInt(str: String): Int? {
    return str.toInt()
}

// can auto cast `is` operator
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` auto cast to `String` in this if
        return obj.length
    }
    // obj is still type `Any`
    return null
}

// another pattern of cast
fun another_getStringLength(obj: Any): Int? {
    if (obj !is String)
        return null
    // `obj` auto cast to `String` out of this if
    return obj.length
}

// use case when
fun cases(obj: Any) {
    when (obj) {
        1 -> print("one")
        "Hello" -> print("Greeting")
        is Long -> print("type Long")
        !is String -> print("type not a String")
        else -> print("Unknown")
    }
}




