package lp3p5;

import java.util.ArrayList;

public class Main 
{
    // Método genérico estático que imprime un par
    public static <F, S> void imprimirPar(Par<F, S> par) 
    {
        System.out.println(par);
    }
    public static void main(String[] args) {
        // Ejemplo de pares con diferentes tipos
        Par<String, Integer> par1 = new Par<>("Edad", 25);
        Par<Double, Boolean> par2 = new Par<>(3.14, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Esther","Ari"), 12345);

        // Llamadas al método imprimirPar con diferentes tipos de pares
        imprimirPar(par1); // (Primero: Edad, Segundo: 25)
        imprimirPar(par2); // (Primero: 3.14, Segundo: true)
        imprimirPar(par3); // (Primero: Persona{nombre='Juan', apellido='Perez'}, Segundo: 12345)
    }
}
