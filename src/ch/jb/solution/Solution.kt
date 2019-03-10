package ch.jb.solution

fun main() {
    val cat: Animal = Cat()
    val dog: Animal = Dog()

    val catInteractionVisitor: Visitor = CatInteractionVisitor()
    val dogInteractionVisitor: Visitor = DogInteractionVisitor()

    cat.accept(catInteractionVisitor)
    cat.accept(dogInteractionVisitor)
    dog.accept(catInteractionVisitor)
    dog.accept(dogInteractionVisitor)
}