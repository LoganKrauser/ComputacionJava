package Tema13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// Definición de la clase Persona
class Person {


    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    // Método getter para el nombre
    public String getName() {
        return name;
    }

    // Método para imprimir información de la persona
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


}
