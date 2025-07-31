package maurotuzzolino.u6_w2_d3_compito.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroComponent {
    private final String titolo;
    private final List<LibroComponent> sottoelementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(LibroComponent componente) {
        sottoelementi.add(componente);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent c : sottoelementi) {
            c.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        return sottoelementi.stream().mapToInt(LibroComponent::getNumeroPagine).sum();
    }
}