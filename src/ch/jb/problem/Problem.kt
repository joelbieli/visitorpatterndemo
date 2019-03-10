package ch.jb.problem

fun main() {
    val cat: Animal = Cat()
    val dog: Animal = Dog()

    cat.interact(cat)
    cat.interact(dog)
    dog.interact(cat)
    dog.interact(dog)
}

interface Animal {
    fun interact(dog: Dog)
    fun interact(cat: Cat)
    fun interact(animal: Animal)
}

class Cat: Animal {
    override fun interact(cat: Cat) {
        println("meow")
    }

    override fun interact(dog: Dog) {
        println("hiss")
    }

    override fun interact(animal: Animal) {
        println("hiss")
    }
}

class Dog: Animal {
    override fun interact(cat: Cat) {
        println("growl")
    }

    override fun interact(dog: Dog) {
        println("bark")
    }

    override fun interact(animal: Animal) {
        println("growl")
    }
}