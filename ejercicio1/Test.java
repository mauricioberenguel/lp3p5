package lp3p5;

public class Test 
{
	public static void main(String[] args) 
	{
        // Crear un par de enteros y cadenas
        Par<Integer, String> par1 = new Par<>(10, "Hola");
        // Imprimir el par
        System.out.println(par1); // Salida: Par [primero=10, segundo=Hola]
        // Obtener el primer elemento
        System.out.println(par1.getPrimero()); // Salida: 10
        // Establecer el primer elemento
        par1.setPrimero(20);
        System.out.println(par1); // Salida: Par [primero=20, segundo=Hola]
        // Crear otro par con los mismos valores
        Par<Integer, String> par2 = new Par<>(20, "Hola");
        // Comparar los pares
        System.out.println(par1.equals(par2)); // Salida: true
        // Intentar establecer un elemento null
        // Esto lanzará una excepción IllegalArgumentException
        // par1.setPrimero(null);
    }
}