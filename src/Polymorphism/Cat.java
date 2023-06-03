package Polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meows");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating!");
    }
}
