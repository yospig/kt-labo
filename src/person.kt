// have primary constructor
class Person(val name: String) {
    // try secondary constructor
    constructor(name: String, parent: Person) : this(name) {
        println("this.name : " + this.name)
        println("name : " + name)
    }
}

