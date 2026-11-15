package ejercicio2_pato;

// Una clase puede implementar varias interfaces (herencia múltiple de contratos)
public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
