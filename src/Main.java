import Exceptions.BankAccount;
import Exceptions.InsufficientFundsException;

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
//        }s

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
//
//        BankAccount myAccount = new BankAccount(123456, 1000);
//        myAccount.getBalance();
//        myAccount.deposit(500);
//        myAccount.getBalance();
//        myAccount.withdraw(1200);
//        myAccount.getBalance();
//        myAccount.withdraw(500);

        String fileContent = "";
        String line;

        System.out.print("Please enter a file path to read from: ");
        String FileName = scan.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            while((line = reader.readLine()) != null) {
                fileContent = fileContent + line + "\n";
            }
            reader.close();
            System.out.print(fileContent);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        fileContent = fileContent.toUpperCase();
        System.out.println(fileContent);

        System.out.print("Please enter a file path to put the new file: ");
        FileName = scan.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
            writer.write(fileContent);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}