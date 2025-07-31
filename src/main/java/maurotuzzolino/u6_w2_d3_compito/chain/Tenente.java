package maurotuzzolino.u6_w2_d3_compito.chain;

import java.util.List;

public class Tenente extends Ufficiale {
    private final int stipendio = 1000;

    @Override
    public void verificaStipendio(int importo, List<String> risultati) {
        if (stipendio >= importo) {
            risultati.add("Tenente: stipendio " + stipendio);
        }
        if (superiore != null) {
            superiore.verificaStipendio(importo, risultati);
        }
    }
}