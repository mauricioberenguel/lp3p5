package lp3p5;

public class Pila<E> 
{
    private final int tamanio; // número de elementos en la pila
    private int superior; // ubicación del elemento superior
    private E[] elementos; // arreglo que almacena los elementos de la pila
    // El constructor sin argumentos crea una pila del tamaño predeterminado
    public Pila() 
    {
        this(10); // tamaño predeterminado de la pila
    }
    // Constructor que crea una pila del número especificado de elementos
    public Pila(int s) 
    {
        tamanio = s > 0 ? s : 10; // establece el tamaño de la Pila
        superior = -1; // al principio, la Pila está vacía
        elementos = (E[]) new Object[tamanio]; // crea el arreglo
    }
    // Mete un elemento a la pila
    public void push(E valorAMeter) 
    {
        if (superior == tamanio - 1) // si la pila está llena
            throw new ExcepcionPilaLlena(String.format(
                    "La Pila está llena, no se puede meter %s", valorAMeter));
        elementos[++superior] = valorAMeter; // mete valorAMeter en Pila
    }
    // Devuelve el último elemento o lanza ExcepcionPilaVacia
    public E pop() 
    {
        if (superior == -1) // si la pila está vacía
            throw new ExcepcionPilaVacia("Pila vacía, no se puede sacar");
        return elementos[superior--]; // elimina y devuelve el último
    }
    // Método que verifica si un elemento está en la pila
    public boolean contains(E elemento) 
    {
        for (int i = superior; i >= 0; i--) 
        { // busca desde el tope hacia el fondo
            if (elementos[i].equals(elemento)) 
            {
                return true; // elemento encontrado
            }
        }
        return false; // elemento no encontrado
    }
    // Método que compara si dos pilas son iguales en tamaño y contenido
    public boolean esIgual(Pila<E> otraPila) 
    {
        // Si los tamaños no coinciden, las pilas no pueden ser iguales
        if (this.superior != otraPila.superior) 
        {
            return false;
        }
        // Comparar los elementos uno por uno desde el tope hasta el fondo
        for (int i = 0; i <= this.superior; i++) 
        {
            if (!this.elementos[i].equals(otraPila.elementos[i])) 
            {
                return false; // Si algún elemento no coincide, no son iguales
            }
        }
        return true; // Si todos los elementos coinciden, las pilas son iguales
    }
}
