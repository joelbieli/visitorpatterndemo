package ch.jb.solution

interface Visitor {
    fun interact(cat: Cat)
    fun interact(dog: Dog)
}

class DogInteractionVisitor: Visitor {
    override fun interact(cat: Cat) {
        println("growl")
    }

    override fun interact(dog: Dog) {
        println("bark")
    }
}

class CatInteractionVisitor: Visitor {
    override fun interact(cat: Cat) {
        println("meow")
    }

    override fun interact(dog: Dog) {
        println("hiss")
    }
}