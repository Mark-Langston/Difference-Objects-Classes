// CSC272 Advanced Programming in Java
// Mark Langston             7/10/2024

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // This will help break up the text a bit while the program runs
        waitForInput();
    }
    // Method to print and wait for key press
    public static void waitForInput() throws IOException {
        System.out.println("\nDifference Objects Classes 1.0\n");
        System.out.println("This program will demonstrate the difference between");
        System.out.println("objects and classes in the Java programming language.\n");
        System.out.println("*** Press enter on your keyboard to continue ***");
        // waits for key press and reads next method
        System.in.read();
        waitForInput2();
    }
    public static void waitForInput2() throws IOException {
        skipScreen();
        System.out.println("Classes are parents to objects, they hold a framework of");
        System.out.println("variables and/or methods to help manipulate data. This makes");
        System.out.println("a program more modular, with reusable resources.");
        System.out.println("*** Press enter on your keyboard to continue ***");
        System.in.read();
        waitForInput3();
    }
    public static void waitForInput3() throws IOException {
        skipScreen();
        System.out.println("Objects are the children of classes. They are derived");
        System.out.println("from the constructors and can inherit properties of their");
        System.out.println("parent.");
        System.out.println("*** Press enter on your keyboard to continue ***");
        System.in.read();
        waitForInput4();
    }
    public static void waitForInput4() throws IOException {
        skipScreen();
        System.out.println("An example of a class and objects could be explained using");
        System.out.println("computers. A computer might be a class, objects would be");
        System.out.println("computers derived from the class definition. You could have");
        System.out.println("various components that make up the computer class, AMD, Ryzen,");
        System.out.println("Intel, Epyc processors. The same goes for RAM, Mass Storage, etc.");
        System.out.println("*** Press enter on your keyboard to see this class and object example ***");
        System.in.read();
        waitForInput5();
    }
    public static void waitForInput5() throws IOException {
        Computer computer1 = new Computer("Intel i9", "16GB", "512GB SSHD");
        Computer computer2 = new Computer("AMD Ryzen 9 7950x3d", "32GB", "1TB SSD");
        // Prints details of computer1
        System.out.println("Computer 1 Details:");
        System.out.println("Processor: " + computer1.getProcessor());
        System.out.println("RAM: " + computer1.getRam());
        System.out.println("Hard Drive: " + computer1.getHardDrive() + "\n");
        // Prints details of computer2
        System.out.println("Computer 2 Details:");
        System.out.println("Processor: " + computer2.getProcessor());
        System.out.println("RAM: " + computer2.getRam());
        System.out.println("Hard Drive: " + computer2.getHardDrive());
        System.out.println();
        System.out.println("Fin");
    }
    public static void skipScreen() {
        // Use ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}