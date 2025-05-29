package Animal;
interface Animal {
    void makeSound();
}
public class AnimalBag {
    public static void main(String[] args) {
        Animal[] Bag = {new Dog(), new Cat()};
        for (Animal animal : Bag) {
            animal.makeSound();
        }
    }
}
