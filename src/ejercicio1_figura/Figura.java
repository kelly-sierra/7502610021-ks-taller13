package ejercicio1_figura;

// Clase abstracta: base común para las figuras (relación "es-un")
public abstract class Figura {

    // Método abstracto: cada figura calcula su área de forma distinta
    public abstract double calcularArea();

    // Método concreto compartido por todas las figuras
    public void mostrarFigura() {
        System.out.println("Mostrando figura.");
    }
}
