package maurotuzzolino.u6_w2_d3_compito.chain;

import java.util.List;

public class Colonnello extends Ufficiale {
    private final int stipendio = 4000;

    @Override
    public void verificaStipendio(int importo, List<String> risultati) {
        if (stipendio >= importo) {
            risultati.add("Colonnello: stipendio " + stipendio);
        }
        if (superiore != null) {
            superiore.verificaStipendio(importo, risultati);
        }
    }
}
