// have primary constructor
class Person constructor(val name: String){
    // try secondary constructor
    constructor(name: String, parent: Person) this(name){
        parent.children.add(this)
    }
}

