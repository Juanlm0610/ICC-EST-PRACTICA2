package models;

public class Person {

    private String name;
    private int age; 

    // Constructor por defecto
    public Person() {
    }

    // Constructor con parámetros
    public Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    // Métodos getter y setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { 
        return age; 
    }

    public void setAge(int age) { 
        this.age = age; 
    }
}
