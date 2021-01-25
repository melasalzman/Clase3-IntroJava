package com.ml.TM;

public class Celular implements Precedable<Celular>{
    private int numero;
    private String titular;

    public Celular() {
    }

    public Celular(int numero, String titular) {
        setNumero(numero);
        setTitular(titular);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Celular: numero " + numero + ", titular '" + titular + '\'';
    }

    @Override
    public int precedeA(Celular celular) {
        int dni1 = celular.getNumero();
        int dni2 = this.getNumero();
        return dni1-dni2;
    }
}
