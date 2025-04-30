# Manipular `Strings` en Java
## Métodos básicos
- Java proporciona una gran variedad de métodos para manipular cadenas `String`. Aquí tienes una lista de los más comunes y útiles, junto con una breve descripción:
## 🔤 Métodos básicos


| Método                                | Descripción                                                  |
|---------------------------------------|--------------------------------------------------------------|
| `length()`                            | Devuelve la longitud de la cadena.                           |
| `charAt(int index)`                   | Devuelve el carácter en la posición indicada.                |
| `substring(int beginIndex)`          | Devuelve una subcadena desde `beginIndex` hasta el final.    |
| `substring(int beginIndex, int endIndex)` | Devuelve una subcadena entre los índices dados (excluye `endIndex`). |
| `toLowerCase()`                       | Convierte toda la cadena a minúsculas.                       |
| `toUpperCase()`                       | Convierte toda la cadena a mayúsculas.                       |
| `trim()`                              | Elimina los espacios al principio y al final.                |


## 🔤 Métodos de comparación y búsqueda

| Método                                 | Descripción                                                            |
|----------------------------------------|------------------------------------------------------------------------|
| `equals(String another)`               | Compara el contenido de dos cadenas.                                  |
| `equalsIgnoreCase(String another)`     | Compara cadenas ignorando mayúsculas/minúsculas.                      |
| `contains(CharSequence s)`             | Verifica si una cadena contiene otra.                                 |
| `startsWith(String prefix)`            | Verifica si la cadena comienza con un prefijo.                        |
| `endsWith(String suffix)`              | Verifica si la cadena termina con un sufijo.                          |
| `indexOf(String str)`                  | Devuelve la posición de la primera aparición de una subcadena.        |
| `lastIndexOf(String str)`              | Devuelve la posición de la última aparición.                          |

## 🔁 Modificación y reemplazo

| Método                                              | Descripción                                                       |
|-----------------------------------------------------|-------------------------------------------------------------------|
| `replace(char oldChar, char newChar)`               | Reemplaza todos los caracteres especificados.                     |
| `replaceAll(String regex, String replacement)`      | Reemplaza usando expresiones regulares.                           |
| `replaceFirst(String regex, String replacement)`    | Reemplaza la primera coincidencia usando regex.                   |
| `split(String regex)`                               | Divide la cadena en partes usando una expresión regular.          |
| `concat(String str)`                                | Concatena la cadena actual con la cadena proporcionada.           |

## 📏 Comparaciones y utilidades

| Método                                      | Descripción                                                                 |
|---------------------------------------------|-----------------------------------------------------------------------------|
| `isEmpty()`                                 | Retorna `true` si la cadena está vacía (`length() == 0`).                  |
| `isBlank()`                                 | Retorna `true` si está vacía o contiene solo espacios (desde Java 11).     |
| `compareTo(String another)`                 | Compara lexicográficamente dos cadenas.                                    |
| `compareToIgnoreCase(String another)`       | Igual que `compareTo` pero ignorando mayúsculas/minúsculas.               |
