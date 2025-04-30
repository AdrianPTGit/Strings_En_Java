package org.example;

public class MetodosComparacionBusqueda {
    public static void main(String[] args) {

        String texto1 = "Programar en java";
        String texto2 = "Programar en javaScript";

        //equals(String another) 	Compara el contenido de dos cadenas.
        boolean esIgual = texto1.equals(texto1);
        boolean noEsIgual = texto2.equals(texto1);

        System.out.println("-----------------------------------------------------");
        System.out.println("Es igual: "+esIgual);
        System.out.println("No es igual: "+ noEsIgual);

        System.out.println("-----------------------------------------------------");

        //equalsIgnoreCase(String another)	Compara cadenas ignorando mayúsculas/minúsculas.
        String min = texto1.toLowerCase();
        String may = texto1.toUpperCase();

        boolean comparacion = texto1.equalsIgnoreCase(may);
        System.out.println("Es igual: "+ comparacion);

        //contains(CharSequence s)	Verifica si una cadena contiene otra.
        String letra = "e";
        System.out.println("-----------------------------------------------------");
        boolean contiene = texto1.contains(letra);
        System.out.println("El texto contiene la letra e: " + contiene);

        System.out.println("-----------------------------------------------------");
        //startsWith(String prefix)	Verifica si la cadena comienza con un prefijo.
        String comienza = "Prog";
        System.out.println("El texto comienza por Prog: "+texto1.startsWith(comienza));

        System.out.println("-----------------------------------------------------");
        //endsWith(String suffix)	Verifica si la cadena termina con un sufijo.
        String termina = "ava";
        System.out.println("El texto termina por ava:" + texto1.endsWith(termina));

        System.out.println("-----------------------------------------------------");
        //indexOf(String str)	Devuelve la posición de la primera aparición de una subcadena.
        String subcadena = "java";
        System.out.println("Posicion java: "+ texto1.indexOf(subcadena));


        System.out.println("-----------------------------------------------------");
        //lastIndexOf(String str)	Devuelve la posición de la última aparición.
        String texto3 = "Programar en java, en C++, y en C.";
        String ultimaAparicion= "en";
        System.out.println("Posicion del ultimo en: " + texto3.lastIndexOf(ultimaAparicion));


    }

}
