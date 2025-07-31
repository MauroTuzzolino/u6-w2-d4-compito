package maurotuzzolino.u6_w2_d3_compito.composite;

public class Pagina implements LibroComponent {
    private final int numero;
    private final String contenuto;

    public Pagina(int numero, String contenuto) {
        this.numero = numero;
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + numero + ": " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
