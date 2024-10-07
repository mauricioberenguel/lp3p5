package lp3p5;

public class Test 
{
    // Método genérico para imprimir todo el arreglo
    public static <E> void imprimirArreglo(E[] arregloEntrada) 
    {
        // Si el arreglo está vacío, no hay nada que imprimir
        if (arregloEntrada == null || arregloEntrada.length == 0) 
        {
            System.out.println("El arreglo está vacío o es nulo.");
            return;
        }

        // Muestra los elementos del arreglo completo
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    // Método sobrecargado para imprimir parte del arreglo según subíndices
    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, 
    		int subindiceSuperior) 
    		throws InvalidSubscriptException 
    {
        // Validar que el arreglo no esté vacío o sea nulo
        if (arregloEntrada == null || arregloEntrada.length == 0) 
        {
            throw new InvalidSubscriptException("El arreglo está vacío o es nulo.");
        }
        // Validar que subindiceInferior no sea negativo
        if (subindiceInferior < 0) 
        {
            throw new InvalidSubscriptException("El subíndice inferior está fuera de rango: " 
            		+ subindiceInferior);
        }
        // Validar que subindiceSuperior esté dentro del tamaño del arreglo
        if (subindiceSuperior >= arregloEntrada.length) {
            throw new InvalidSubscriptException("El subíndice superior está fuera de rango: " 
            		+ subindiceSuperior);
        }

        // Validar que subindiceSuperior sea mayor que subindiceInferior
        if (subindiceSuperior <= subindiceInferior) 
        {
            throw new InvalidSubscriptException("El subíndice superior debe "
            		+ "ser mayor que el subíndice inferior.");
        }

        // Contador para la cantidad de elementos impresos
        int contador = 0;
        // Imprimir solo la parte del arreglo dentro de los índices indicados
        for (int i = subindiceInferior; i <= subindiceSuperior; i++) 
        {
            System.out.printf("%s ", arregloEntrada[i]);
            contador++;
        }
        System.out.println();
        return contador; // Retorna la cantidad de elementos impresos
    }

    public static void main(String args[]) 
    {
        // Crea arreglos de objetos Integer, Double y Character
        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arregloCharacter = {'H', 'O', 'L', 'A'};

        System.out.println("El arreglo arregloInteger contiene:");
        imprimirArreglo(arregloInteger); // pasa un arreglo Integer

        System.out.println("\nEl arreglo arregloDouble contiene:");
        imprimirArreglo(arregloDouble); // pasa un arreglo Double

        System.out.println("\nEl arreglo arregloCharacter contiene:");
        imprimirArreglo(arregloCharacter); // pasa un arreglo Character

        // Ejemplo de uso del método sobrecargado
        try 
        {
            System.out.println("\nImprimiendo parte del arreglo arregloInteger:");
            int cantidadImpresos = imprimirArreglo(arregloInteger, 1, 4); 
            // imprime desde el índice 1 hasta 4
            System.out.printf("Cantidad de elementos impresos: %d\n", cantidadImpresos);
        } 
        catch (InvalidSubscriptException e) 
        {
            System.err.println(e.getMessage());
        }

        // Ejemplo de validación fallida con índice fuera de rango
        try 
        {
            System.out.println("\nIntentando imprimir fuera de rango:");
            imprimirArreglo(arregloInteger, -1, 5); // Esto lanzará una excepción
        } 
        catch (InvalidSubscriptException e) 
        {
            System.err.println(e.getMessage());
        }
        // Ejemplo de validación fallida con subíndices invertidos
        try 
        {
            System.out.println("\nIntentando imprimir con subíndices inválidos:");
            imprimirArreglo(arregloInteger, 4, 1); // Esto lanzará una excepción
        } catch (InvalidSubscriptException e) {
            System.err.println(e.getMessage());
        }
    }
}