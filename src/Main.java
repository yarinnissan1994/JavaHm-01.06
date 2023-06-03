import Exceptions.BankAccount;
import Exceptions.InsufficientFundsException;
import Files.FileTools;
import Polymorphism.*;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        *** Polymorphism ***
//        Animal[] animals = {new Cat(), new Dog(), new Cat(), new Dog()};
//
//        for(Animal animal : animals){
//            System.out.println(animal.getClass());
//            animal.eat();
//            animal.makeSound();
//        }

//        *** Exceptions ***
//        try{
//            System.out.print("Lets try a division, please enter the first number: ");
//            int num1 = scan.nextInt();
//            System.out.print("Please enter the second number: ");
//            int num2 = scan.nextInt();
//            System.out.println(num1 / num2);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is not allowed!");
//        }
//        catch (InputMismatchException e){
//            System.out.println("Invalid input! Please enter integers only.");
//        }

//        BankAccount myAccount = new BankAccount(123456, 1000);
//        myAccount.getBalance();
//        myAccount.deposit(500);
//        myAccount.getBalance();
//        myAccount.withdraw(1200);
//        myAccount.getBalance();
//        myAccount.withdraw(500);


//        *** File ***

        System.out.print("Please enter a file path to read from: ");
        String fileName = scan.nextLine();
        String fileContent = FileTools.fileReader(fileName);

        fileContent = FileTools.processContent(fileContent);

        System.out.print("Please enter a file path to put the new file: ");
        fileName = scan.nextLine();

        FileTools.fileWriter(fileName, fileContent);
    }
}