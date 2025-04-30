package org.example;

public class ModificacionYReemplazo {
    public static void main(String[] args) {
        String texto1 = "Programar en java";
        String texto2 = " Programar en java y javaScript";
        String texto3 = "Programar en java, en C++, y en C.";

        System.out.println("-----------------------------------------------------");
        //replace(char oldChar, char newChar)	Reemplaza todos los caracteres especificados.
        System.out.println("Cambia C por B: " + texto3.replace('C','B'));
        System.out.println("-----------------------------------------------------");
        //replaceAll(String regex, String replacement)	Reemplaza usando expresiones regulares.
        String texto = "Uno, dos. Tres; cuatro: cinco";

        // Reemplaza todos los signos de puntuación por un guion
        String resultado = texto.replaceAll("[,.;:]",  " -->");

        System.out.println(resultado);

        System.out.println("-----------------------------------------------------");
        //replaceFirst(String regex, String replacement)	Reemplaza la primera coincidencia usando regex.

        System.out.println(texto2.replaceFirst("java","python"));

        System.out.println("-----------------------------------------------------");
        //split(String regex)	Divide la cadena en partes usando una expresión regular.
        // Dividir usando coma y conjunciones como separadores
        String[] partes = texto3.split(",| y ");

        // Mostrar el resultado
        for (String parte : partes) {
            System.out.println(parte.trim());
        }

        System.out.println("-----------------------------------------------------");
        //concat(String str)	Concatena otra cadena. También se puede usar +.
        System.out.println(texto3.concat(texto2));

    }
}
