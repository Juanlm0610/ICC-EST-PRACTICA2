package views;

import java.util.Scanner;
import models.Person;

public class Vista {

    private Scanner scanner;

    // Constructor
    public Vista() {
        this.scanner = new Scanner(System.in); // Inicializa el Scanner
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Ingresar Personas");
        System.out.println("100. Salir");
        return scanner.nextInt();
    }

    public int inputInt(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age); // Asegúrate de que Person tenga un constructor que acepte estos parámetros
    }

    public String inputName() {
        System.out.println("Ingrese el Nombre");
        return scanner.next();
    }

    public int inputAge() {
        System.out.println("Ingrese la edad");
        return scanner.nextInt();
    }
}
