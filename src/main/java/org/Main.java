package org;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio numero 1:
        * Escribe en el lenguaje de programación que desees,
        * un programa que muestre en pantalla los números del 1 al 100,
        * sustituyendo los múltiplos de 3 por la palabra “VIN” y, a su vez,
        * los múltiplos de 5 por “CLE”. Para los casos que, al tiempo,
        * son múltiplos de 3 y 5, utiliza el combinado “VINCLE”.
        */
        int i;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("VINCLE ");
            else if (i % 3 == 0)
                System.out.print("VIN ");
            else if (i % 5 == 0)
                System.out.print("CLE ");
            else
                System.out.print(i + " ");
        }
    }
}