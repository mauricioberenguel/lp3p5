package lp3p5;

public class Test 
{
	public static void main(String[] args) 
	{
        // Crear dos pilas con los mismos elementos
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        // Llenar ambas pilas con los mismos elementos
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);

        pila2.push(10);
        pila2.push(20);
        pila2.push(30);

        // Comparar las pilas
        System.out.println("¿Son iguales las pilas 1 y 2?: " 
        		+ pila1.esIgual(pila2)); // Espera true

        // Modificar la segunda pila
        pila2.pop();
        pila2.push(40);

        // Comparar nuevamente las pilas
        System.out.println("¿Son iguales las pilas"
        		+ " 1 y 2 después de cambiar pila2?: " 
        		+ pila1.esIgual(pila2)); // Espera false
    }
}
