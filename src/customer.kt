class Customer constructor(val firstName: String, val lastName: String, var age: Int) {
    // as can't include any codes in primary constructor, use init block
    init {
        println("Customer init : firstName is {$firstName}")
    }
    valcustomerKey = name.toUpperCase()
}