package lp3p5;

import java.util.ArrayList;

public class Contenedor<F, S> 
{
    private ArrayList<Par<F, S>> listaPares;
    // Constructor que inicializa el ArrayList
    public Contenedor() 
    {
        this.listaPares = new ArrayList<>();
    }
    // Método para agregar un nuevo par al contenedor
    public void agregarPar(F primero, S segundo) 
    {
        Par<F, S> nuevoPar = new Par<>(primero, segundo);
        listaPares.add(nuevoPar);
    }
    // Método para obtener un par en la posición especificada
    public Par<F, S> obtenerPar(int indice) 
    {
        if (indice >= 0 && indice < listaPares.size()) 
        {
            return listaPares.get(indice);
        } 
        else 
        {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }
    // Método para obtener la lista completa de pares
    public ArrayList<Par<F, S>> obtenerTodosLosPares() 
    {
        return listaPares;
    }
    // Método para mostrar todos los pares almacenados en el contenedor
    public void mostrarPares() 
    {
        for (Par<F, S> par : listaPares) 
        {
            System.out.println(par);
        }
    }
}
