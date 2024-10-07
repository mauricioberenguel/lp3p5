package lp3p5;

public class Test 
{
	public static void main(String[] args) 
	{
		// Creación de dos pares para la prueba
        Par<Integer, String> par1 = new Par<>(1, "Uno");
        Par<Integer, String> par2 = new Par<>(1, "Uno");
        Par<Integer, String> par3 = new Par<>(2, "Dos");
        // Prueba del método toString
        System.out.println("Par1: " + par1);
        System.out.println("Par2: " + par2);
        System.out.println("Par3: " + par3);
        // Prueba del método esIgual
        System.out.println("¿Par1 es igual a Par2? " + par1.esIgual(par2)); // true
        System.out.println("¿Par1 es igual a Par3? " + par1.esIgual(par3)); // false
        // Prueba de igualdad utilizando equals (opcional)
        System.out.println("¿Par1 es igual a Par2 "
        		+ "usando equals? " + par1.equals(par2)); // true
        System.out.println("¿Par1 es igual a Par3 "
        		+ "usando equals? " + par1.equals(par3)); // false
    }
}