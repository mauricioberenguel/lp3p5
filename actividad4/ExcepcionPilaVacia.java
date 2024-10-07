package lp3p5;

//Clase de excepción personalizada para pila vacía
class ExcepcionPilaVacia extends RuntimeException {
 public ExcepcionPilaVacia(String message) {
     super(message);
 }
}