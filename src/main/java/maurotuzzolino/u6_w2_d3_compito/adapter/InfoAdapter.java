package maurotuzzolino.u6_w2_d3_compito.adapter;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate nascita = info.getDataDiNascita();
        LocalDate oggi = LocalDate.now();
        return Period.between(nascita, oggi).getYears();
    }
}
