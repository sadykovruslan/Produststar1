package Classes;

public abstract class Animal {
     int age;
    protected int lives;
    private String name;
    String color;
    boolean gender;

    public void jump() {
        System.out.println("Jump");
    }

    public abstract void makeSound();

    public Animal() {
    }

    public Animal(int lives) {
        System.out.println("Animal constructor called");
        this.lives=lives;
        System.out.println("Animal has " + this.lives + " lives");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Age is negative");
        }
        this.age = Math.max(0, age);
    }

    public String getName() {
        if (name==null){
            return "Unnamed";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
