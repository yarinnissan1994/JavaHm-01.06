package Polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
    @Override
    public void eat() {
        System.out.println("The dog is eating!");
    }
}
