package com.proyectoJavaRigobelloGonzalo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //INICIALIZO LOS OBJETOS
        Persona persona1 = new Persona ("Ana", "Rodriguez");
        Persona persona2 = new Persona ("Gonzalo", "Rigobello");
        Persona persona3 = new Persona ("Benjamin", "Piannetti");
        Persona persona4 = new Persona ("Delfina", "Medina");
        Persona persona5 = new Persona ("Benjamin", "Perez");

        //CREO EL ARRAYLIST DONDE VAMOS A AGREGAR LOS OBJETOS
        List<Persona> lista = new ArrayList<Persona>();

        //UTILIZANDO ADD AGREGAMOS UNA POR UNA LAS PERSONAS CREADAS
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);

        //IMPRIMIMOS POR PANTALLA LA LISTA COMPLETA
        System.out.println(lista);
        System.out.println("");

        // SE ORDENA ALFABETICAMENTE POR NOMBRE
        System.out.println("Lista ordenada Alfabeticamente por nombre");
        lista.sort(Comparator.comparing(Persona::getNombre));
        System.out.println(lista);
        System.out.println("");

        // SE ORDENA ALFABETICAMENTE POR APELLIDO
        System.out.println("Lista ordenada Alfabeticamente por apellido");
        lista.sort(Comparator.comparing(Persona::getApellido));
        System.out.println(lista);
        System.out.println("");

        // SE ORDENA DE MANERA INVERSA POR APELLIDO
        System.out.println("Lista ordenada Alfabeticamente descendente por apellido");
        lista.sort(Comparator.comparing(Persona::getApellido).reversed());
        System.out.println(lista);
        System.out.println("");


    }
}
