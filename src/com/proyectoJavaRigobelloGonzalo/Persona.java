package com.proyectoJavaRigobelloGonzalo;

public class Persona  {

    //SE INSTANCIAN LOS ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;

    //CONSTRUCTOR VACIO
    public Persona (){}

    //CONSTRUCTOR CON PARAMETROS
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GETTERS AND SETTERS
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}
