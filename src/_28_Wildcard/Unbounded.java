package _28_Wildcard;

public class Unbounded {

    public static void inspect(Box<?> box) {
        Box<Dog> dogBox = new Box<>();
        Dog dog = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect();

    }

}
