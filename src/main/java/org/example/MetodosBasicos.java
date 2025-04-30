package org.example;

import java.util.Scanner;

public class MetodosBasicos {
    /**
     * Java proporciona una gran variedad de métodos para manipular cadenas (String)
     * @param args
     */
    public static void main(String[] args) {
        // Métodos básicos
        String texto = "Programar en java.";
        System.out.println("-----------------------------------------------------");
        System.out.println(texto);



        //length() -->	Devuelve la longitud de la cadena.
        int longitudCadena = texto.length();
        System.out.println("-----------------------------------------------------");

        System.out.println("La longitud de la cadena de texto es: " + longitudCadena);

        //charAt(int index)	Devuelve el carácter en la posición indicada.
        System.out.println("-----------------------------------------------------");

        System.out.println("Indica posicion del caracter a mostrar:");
        Scanner teclado = new Scanner(System.in);
        int posicion=teclado.nextInt();
        char caracter = texto.charAt(posicion);
        System.out.println("El caracter devuelto es: " + caracter);

        System.out.println("-----------------------------------------------------");

        //substring(int beginIndex)	Devuelve una subcadena desde beginIndex hasta el final.
        String subcadena = texto.substring(5);
        System.out.println("Subcadena: " + subcadena);

        //substring(int beginIndex, int endIndex)	Devuelve una subcadena entre los índices dados (excluye el endIndex).
        System.out.println("-----------------------------------------------------");

        String subcadenaEntreIndices = texto.substring(0,8);
        System.out.println("Subcadena entre dos indices: "+subcadenaEntreIndices);

        //toLowerCase()	Convierte toda la cadena a minúsculas.
        System.out.println("-----------------------------------------------------");
        String min = texto.toLowerCase();
        System.out.println("Texo en minusculas: " + min);

        //toUpperCase()	Convierte toda la cadena a mayúsculas.
        System.out.println("-----------------------------------------------------");
        String may = texto.toUpperCase();
        System.out.println("texto en mayusculas: " + may);

        // trim()	Elimina los espacios al principio y al final.
        String sinEspacios = texto.trim();
    }
}
