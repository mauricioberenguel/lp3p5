package lp3p5;

//Clase de excepción personalizada para pila llena
class ExcepcionPilaLlena extends RuntimeException 
{
	 public ExcepcionPilaLlena(String message) 
	 {
	     super(message);
	 }
}