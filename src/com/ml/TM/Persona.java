package com.ml.TM;

import javax.xml.xpath.XPathEvaluationResult;

public class Persona implements Precedable<Persona>{

    private String nombre;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona: nombre " + nombre + '\'' + ", dni " + dni;
    }

    public Persona() {
    }

    public Persona(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }

    @Override
    public int precedeA(Persona persona) {
        int dni1 = persona.getDni();
        int dni2 = this.getDni();
        return dni1-dni2;
    }
}
