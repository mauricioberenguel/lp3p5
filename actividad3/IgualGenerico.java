package lp3p5;

public class IgualGenerico 
{

    // Método genérico que compara dos objetos utilizando equals
    public static <T> boolean esIgualA(T obj1, T obj2) 
    {
        // Verifica si ambos objetos son null, o si son iguales utilizando equals
        return (obj1 == null && obj2 == null) || (obj1 != null && obj1.equals(obj2));
    }
    public static void main(String[] args) 
    {
        // Comparando diferentes tipos de objetos
        System.out.println("Comparando enteros:");
        System.out.println(esIgualA(5, 5)); // true
        System.out.println(esIgualA(5, 10)); // false
        System.out.println("\nComparando strings:");
        System.out.println(esIgualA("Hola", "Hola")); // true
        System.out.println(esIgualA("Hola", "Mundo")); // false
        System.out.println("\nComparando nulls:");
        System.out.println(esIgualA(null, null)); // true
        System.out.println(esIgualA(null, "Texto")); // false
        System.out.println("\nComparando objetos:");
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(esIgualA(obj1, obj1)); // true
        System.out.println(esIgualA(obj1, obj2)); // false
        System.out.println("\nComparando Integer:");
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 200;
        System.out.println(esIgualA(num1, num2)); // true
        System.out.println(esIgualA(num1, num3)); // false
    }
}
