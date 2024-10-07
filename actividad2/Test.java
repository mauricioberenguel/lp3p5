package lp3p5;

public class Test 
{
	public static void main(String[] args) 
	{
        // Crear una pila con capacidad de 5 elementos
        Pila<Integer> pila = new Pila<>(5);
        // Probar el método push
        System.out.println("---- Probando push ----");
        try {
            pila.push(10);
            pila.push(20);
            pila.push(30);
            pila.push(40);
            pila.push(50);
            System.out.println("Elementos agregados correctamente.");
        } 
        catch (ExcepcionPilaLlena e) 
        {
            System.out.println(e.getMessage());
        }

        // Probar el método push cuando la pila está llena
        try 
        {
            pila.push(60);
        } 
        catch (ExcepcionPilaLlena e) 
        {
            System.out.println("Excepción esperada: " + e.getMessage());
        }

        // Probar el método pop
        System.out.println("\n---- Probando pop ----");
        try 
        {
            System.out.println("Elemento sacado de la pila: " + pila.pop()); // Espera 50
            System.out.println("Elemento sacado de la pila: " + pila.pop()); // Espera 40
        } 
        catch (ExcepcionPilaVacia e) 
        {
            System.out.println(e.getMessage());
        }
        // Probar el método pop cuando la pila está vacía
        System.out.println("\n---- Vaciando la pila ----");
        try 
        {
            pila.pop(); // Espera 30
            pila.pop(); // Espera 20
            pila.pop(); // Espera 10
            System.out.println("Pila vaciada correctamente.");
            pila.pop(); // Aquí debería lanzar la excepción
        } 
        catch (ExcepcionPilaVacia e) 
        {
            System.out.println("Excepción esperada: " + e.getMessage());
        }

        // Probar el método contains para un elemento existente
        System.out.println("\n---- Probando contains ----");
        try 
        {
            pila.push(100);
            pila.push(200);
            System.out.println("¿Contiene 100?: " + pila.contains(100)); // Espera true
            System.out.println("¿Contiene 300?: " + pila.contains(300)); // Espera false
        } 
        catch (ExcepcionPilaLlena e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
