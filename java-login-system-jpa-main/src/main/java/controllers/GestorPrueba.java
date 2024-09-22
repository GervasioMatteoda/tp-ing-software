package controllers;

public class GestorPrueba {

    public void esPar(int n) {
        if (n%2 == 0) {
            System.out.println("El número es par");
        }
    }

    public void esImpar(int n) {
        if (n%2 != 0) {
            System.out.println("El número es par");
        }
    }

    public int suma(int a, int b) {
        return a+b;
    }

    public int resta(int a, int b) {
        return suma(a, -b);
    }
}
