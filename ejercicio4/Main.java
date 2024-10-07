package lp3p5;

import java.util.ArrayList;

public class Main 
{
    // Método genérico estático que imprime un par
    public static <F, S> void imprimirPar(Par<F, S> par) 
    {
        System.out.println(par);
    }
    public static void main(String[] args) 
    {
    	// Crear un contenedor de pares de tipo String e Integer
        Contenedor<String, Integer> contenedor = new Contenedor<>();
        // Agregar pares al contenedor
        contenedor.agregarPar("Edad", 25);
        contenedor.agregarPar("Estatura", 180);
        contenedor.agregarPar("Peso", 75);
        // Mostrar todos los pares almacenados en el contenedor
        System.out.println("Pares almacenados en el contenedor:");
        contenedor.mostrarPares();
        // Obtener un par específico
        Par<String, Integer> par = contenedor.obtenerPar(1); // Obtener el segundo par
        System.out.println("Par obtenido: " + par); // (Primero: Estatura, Segundo: 180)
        // Obtener todos los pares
        ArrayList<Par<String, Integer>> todosLosPares = contenedor.obtenerTodosLosPares();
        System.out.println("Todos los pares: " + todosLosPares);
    }
}
