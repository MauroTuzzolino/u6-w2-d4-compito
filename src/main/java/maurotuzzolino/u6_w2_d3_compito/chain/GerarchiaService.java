package maurotuzzolino.u6_w2_d3_compito.chain;

import java.util.ArrayList;
import java.util.List;

public class GerarchiaService {
    private final Ufficiale catena;

    public GerarchiaService() {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        this.catena = tenente;
    }

    public List<String> trovaUfficiali(int importo) {
        List<String> risultati = new ArrayList<>();
        catena.verificaStipendio(importo, risultati);
        return risultati;
    }
}
