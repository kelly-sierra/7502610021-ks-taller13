package ejercicio1_figura;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: referencias de tipo Figura apuntando a objetos concretos
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(5, 3);

        rectangulo.mostrarFigura();
        System.out.println("Área del rectángulo (4 x 6): " + rectangulo.calcularArea());

        triangulo.mostrarFigura();
        System.out.println("Área del triángulo (base 5, altura 3): " + triangulo.calcularArea());
    }
}
