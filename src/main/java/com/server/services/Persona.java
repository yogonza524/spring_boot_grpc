package com.server.services;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
       nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Gonzalo");
        System.out.println(p.getNombre()); //Gonzalo
    }
}