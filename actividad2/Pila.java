package lp3p5;

public class Pila<E> 
{
    private final int tamanio; 
    // número máximo de elementos en la pila
    private int superior; 
    // índice del elemento superior (último insertado)
    private final E[] elementos; 
    // arreglo que almacena los elementos de la pila

    // Constructor sin argumentos, crea una pila con tamaño predeterminado de 10
    public Pila() 
    {
        this(10); // tamaño predeterminado de la pila
    }

    // Constructor con tamaño especificado
    public Pila(int s) 
    {
        tamanio = s > 0 ? s : 10; 
        // si el tamaño es menor a 1, se asigna 10 por defecto
        superior = -1; // inicializa la pila como vacía
        elementos = (E[]) new Object[tamanio]; 
        // crea el arreglo para almacenar elementos
    }
    // Método para insertar un elemento en la pila
    public void push(E valorAMeter) 
    {
        if (superior == tamanio - 1) 
        { // verifica si la pila está llena
            throw new ExcepcionPilaLlena(String.format("La Pila "
            		+ "está llena, no se puede meter %s", valorAMeter));
        }
        elementos[++superior] = valorAMeter; 
        // inserta el elemento y actualiza el índice superior
    }
    // Método para eliminar y devolver el último elemento insertado en la pila
    public E pop() 
    {
        if (superior == -1) 
        { // verifica si la pila está vacía
            throw new ExcepcionPilaVacia("Pila vacía, no se puede sacar");
        }
        return elementos[superior--]; 
        // devuelve el último elemento y actualiza el índice superior
    }
    // Método para verificar si un elemento está en la pila
    public boolean contains(E elemento) 
    {
        // Búsqueda desde el tope de la pila hacia abajo
        for (int i = superior; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return true; // elemento encontrado
            }
        }
        return false; // elemento no encontrado
    }
}