package maurotuzzolino.u6_w2_d3_compito.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private final String titolo;
    private final List<String> autori;
    private final double prezzo;
    private final List<LibroComponent> contenuti = new ArrayList<>();

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungiContenuto(LibroComponent componente) {
        contenuti.add(componente);
    }

    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: €" + prezzo);
        for (LibroComponent c : contenuti) {
            c.stampa();
        }
    }

    public int getNumeroTotalePagine() {
        return contenuti.stream().mapToInt(LibroComponent::getNumeroPagine).sum();
    }
}
