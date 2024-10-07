package lp3p5;

class Persona 
{
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // Sobrescribir toString para una representación adecuada
    @Override
    public String toString() 
    {
        return String.format("Persona{nombre='%s', apellido='%s'}", 
        		nombre, apellido);
    }
}
