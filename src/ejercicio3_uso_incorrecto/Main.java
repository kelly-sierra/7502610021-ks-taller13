package ejercicio3_uso_incorrecto;

public class Main {
    public static void main(String[] args) {

        // ===== PARTE 1: clase concreta sin implementar los métodos de la interfaz =====
        // Ver Futbolista.java: descomenta la clase para observar el error de compilación.

        // ===== PARTE 2: método default en una clase abstracta =====
        // Ver Animal.java: descomenta el método "default" para observar el error.
        // Aquí se muestra la forma correcta: un método concreto normal.
        Animal animal = new Animal() { };
        animal.dormir();
    }
}
