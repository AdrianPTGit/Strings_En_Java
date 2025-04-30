package org.example;

public class ComparacionesYUtilidades {
    public static void main(String[] args) {
        String texto1 = "java";
        String texto2 = "";
        String texto3 = " ";
        System.out.println("-----------------------------------------------------");
        //isEmpty()	Retorna true si la cadena está vacía (length() == 0).
        boolean vacio = texto2.isEmpty();
        System.out.println("Esta vacio: "+vacio);

        System.out.println("-----------------------------------------------------");
        //isBlank()	Retorna true si está vacía o contiene solo espacios (desde Java 11).

        boolean espacio = texto3.isBlank();
        System.out.println("esta vacio pero Tiene espaciosp:" + espacio);

        System.out.println("-----------------------------------------------------");
        //compareTo(String another)	Compara lexicográficamente dos cadenas.
        /**
         * El método compareTo compara dos cadenas lexicográficamente, como en un diccionario:
         *
         *     Devuelve 0 si son iguales.
         *
         *     Devuelve un número positivo si la cadena actual es mayor.
         *
         *     Devuelve un número negativo si la cadena actual es menor.
         */

                String palabra1 = "Hola";
                String palabra2 = "Hola";
                String palabra3 = "Adiós";
                String palabra4 = "Zorro";

                System.out.println("Comparando palabra1 con palabra2: " + palabra1.compareTo(palabra2)); // 0
                System.out.println("Comparando palabra1 con palabra3: " + palabra1.compareTo(palabra3)); // > 0
                System.out.println("Comparando palabra1 con palabra4: " + palabra1.compareTo(palabra4)); // < 0
        /**
         * Explicación
         *
         *     "Hola".compareTo("Hola") → 0 porque son iguales.
         *
         *     "Hola".compareTo("Adiós") → > 0 porque "H" viene después de "A".
         *
         *     "Hola".compareTo("Zorro") → < 0 porque "H" viene antes de "Z".
         */




        System.out.println("-----------------------------------------------------");
        //compareToIgnoreCase(String another)	Igual que compareTo pero ignorando mayúsculas/minúsculas.

                String palabra01 = "Hola";
                String palabra02 = "hola";
                String palabra03 = "Adiós";
                String palabra04 = "zorro";

                System.out.println("Comparando palabra1 con palabra2: " + palabra01.compareToIgnoreCase(palabra02)); // 0
                System.out.println("Comparando palabra1 con palabra3: " + palabra01.compareToIgnoreCase(palabra03)); // > 0
                System.out.println("Comparando palabra1 con palabra4: " + palabra01.compareToIgnoreCase(palabra04)); // < 0

        /**
         *  Explicación
         *
         *     "Hola".compareToIgnoreCase("hola") → 0, porque ambos son iguales al comparar ignorando mayúsculas/minúsculas.
         *
         *     "Hola".compareToIgnoreCase("Adiós") → > 0, porque "H" viene después de "A" en el orden alfabético (ignorando mayúsculas/minúsculas).
         *
         *     "Hola".compareToIgnoreCase("zorro") → < 0, porque "H" viene antes de "z" en el orden alfabético (ignorando mayúsculas/minúsculas).
         */


    }
}
