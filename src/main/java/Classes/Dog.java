package Classes;

public class Dog extends Animal implements Walkable {
    public void burk() {
        System.out.println("Bark");
    }
    public void makeSound(){
        System.out.println("Bark!");
    }

    public Dog(String say) {
        System.out.println(say);
    }

    @Override
    public void walk() {
        System.out.println("Walk the dog");
    }
}
