package com.ml.TM;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Laura",40244123);
        Persona persona2 = new Persona("Pedro",23040404);
        Persona persona3 = new Persona("Lucas",54434454);
        Persona persona4 = new Persona("Roberto",55656567);
        Persona[] arr = new Persona[4];
        arr[0]=persona1;
        arr[1]=persona2;
        arr[2]=persona3;
        arr[3]=persona4;
        Precedable[] arrOrdenado= SortUtil.ordenar(arr);
        for (Precedable<Persona> persona: arrOrdenado) {
            System.out.println(persona.toString());
        }

        Celular celular1 = new Celular(1545253533,"Laura");
        Celular celular2 = new Celular(1545452637,"Pedro");
        Celular celular3 = new Celular(1509908687,"Lucas");
        Celular celular4 = new Celular(1528392392,"Roberto");
        Celular[] arrCelular = new Celular[4];
        arrCelular[0]=celular1;
        arrCelular[1]=celular2;
        arrCelular[2]=celular3;
        arrCelular[3]=celular4;
        Precedable[] arrCelularOrdenado= SortUtil.ordenar(arrCelular);
        for (Precedable<Celular> celular: arrCelularOrdenado) {
            System.out.println(celular.toString());
        }
    }
}
