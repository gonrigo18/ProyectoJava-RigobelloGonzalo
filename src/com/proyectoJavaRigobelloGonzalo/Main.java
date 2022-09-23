package com.proyectoJavaRigobelloGonzalo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona ("Ana", "Rodriguez");
        Persona persona2 = new Persona ("Gonzalo", "Rigobello");
        Persona persona3 = new Persona ("Benjamin", "Piannetti");
        Persona persona4 = new Persona ("Delfina", "Medina");
        Persona persona5 = new Persona ("Benjamin", "Perez");


        ArrayList<Object> lista = new ArrayList<>();
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);
        System.out.println(lista);
        

    }
}
