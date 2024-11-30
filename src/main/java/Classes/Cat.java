package Classes;

public class Cat extends Animal {

    public Cat(int lives) {
        super (lives);
        System.out.println("Cat constructor called");
        this.lives=9;
        System.out.println("Cat has " + this.lives + " lives");
    }

    public void mew() {
        System.out.println("Mew");
    }

    public void makeSound(){
        System.out.println("Mew");
    }


}