package lp3p5;

public class Par<F, S> 
{
    private F primero; // primer elemento del par
    private S segundo; // segundo elemento del par
    // Constructor que inicializa el par con los elementos dados
    public Par(F primero, S segundo) 
    {
        this.primero = primero;
        this.segundo = segundo;
    }
    // Método para obtener el primer elemento
    public F getPrimero() 
    {
        return primero;
    }
    // Método para establecer el primer elemento
    public void setPrimero(F primero) 
    {
        if (primero == null) 
        {
            throw new IllegalArgumentException("El primer elemento no puede ser nulo.");
        }
        this.primero = primero;
    }
    // Método para obtener el segundo elemento
    public S getSegundo() 
    {
        return segundo;
    }
    // Método para establecer el segundo elemento
    public void setSegundo(S segundo) 
    {
        if (segundo == null) 
        {
            throw new IllegalArgumentException("El segundo elemento no puede ser nulo.");
        }
        this.segundo = segundo;
    }

    // Método para representar el par como cadena de la forma (Primero: x, Segundo: y)
    @Override
    public String toString() 
    {
        return String.format("(Primero: %s, Segundo: %s)", primero, segundo);
    }
    // Método para verificar si dos pares son iguales
    public boolean esIgual(Par<F, S> otroPar) 
    {
        if (otroPar == null) return false;
        return this.primero.equals(otroPar.getPrimero()) && this.segundo.equals(otroPar.getSegundo());
    }
    // Método equals sobreescrito para comparaciones adicionales
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) obj;
        return primero.equals(par.primero) && segundo.equals(par.segundo);
    }

    // Método hashCode sobreescrito
    @Override
    public int hashCode() 
    {
        int result = primero != null ? primero.hashCode() : 0;
        result = 31 * result + (segundo != null ? segundo.hashCode() : 0);
        return result;
    }
}