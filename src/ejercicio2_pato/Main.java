package ejercicio2_pato;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();

        // Polimorfismo: el mismo objeto visto a través de cada interfaz
        Volador volador = pato;
        Nadador nadador = pato;
        volador.volar();
        nadador.nadar();
    }
}
