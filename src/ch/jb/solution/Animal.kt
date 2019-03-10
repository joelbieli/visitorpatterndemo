package ch.jb.solution

interface Animal {
    fun accept(visitor: Visitor)
}

class Cat: Animal {
    override fun accept(visitor: Visitor) {
        visitor.interact(this)
    }
}

class Dog: Animal {
    override fun accept(visitor: Visitor) {
        visitor.interact(this)
    }
}