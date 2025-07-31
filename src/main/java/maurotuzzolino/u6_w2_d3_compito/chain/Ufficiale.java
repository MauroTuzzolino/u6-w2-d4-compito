package maurotuzzolino.u6_w2_d3_compito.chain;

import java.util.List;

public abstract class Ufficiale {
    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract void verificaStipendio(int importo, List<String> risultati);
}
