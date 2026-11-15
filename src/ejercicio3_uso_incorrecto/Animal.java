package ejercicio3_uso_incorrecto;

// PARTE 2: MÉTODOS default EN UNA CLASE ABSTRACTA (NO ES POSIBLE)
// La palabra clave "default" solo existe para interfaces (Java 8+), porque
// permite dar una implementación por defecto sin romper a las clases que ya
// implementan la interfaz. Una clase abstracta no la necesita: ya puede tener
// métodos concretos normales (con cuerpo) sin ninguna palabra especial.
//
// Para observar el error, quita los "//" de las líneas de la clase:
//
// public abstract class Animal {
//     default void dormir() {
//         System.out.println("El animal duerme.");
//     }
// }
//
// Error en IntelliJ: Modifier 'default' not allowed here
//
// Forma correcta en una clase abstracta: un método concreto normal.
public abstract class Animal {

    public void dormir() {
        System.out.println("El animal duerme.");
    }
}
