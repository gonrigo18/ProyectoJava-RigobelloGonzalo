package com.proyectoJavaRigobelloGonzalo;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona ("Ana", "Rodriguez");
        Persona persona2 = new Persona ("Gonzalo", "Rigobello");
        Persona persona3 = new Persona ("Benjamin", "Piannetti");
        Persona persona4 = new Persona ("Delfina", "Medina");
        Persona persona5 = new Persona ("Benjamin", "Perez");


        ArrayList<Persona> lista = new ArrayList<Persona>();
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);
        System.out.println(lista);
        System.out.println("");


        System.out.println("Imprimir Lista ordenada Alfabeticamente por nombre");
        lista.sort(Comparator.comparing(Persona::getNombre));
        System.out.println(lista);
        System.out.println("");
        System.out.println("Imprimir Lista ordenada Alfabeticamente por apellido");
        lista.sort(Comparator.comparing(Persona::getApellido));
        System.out.println(lista);
        System.out.println("");
        System.out.println("Imprimir Lista ordenada Alfabeticamente descendente por apellido");
        lista.sort(Comparator.comparing(Persona::getApellido).reversed());
        System.out.println(lista);
        System.out.println("");


    }
}
