package maurotuzzolino.u6_w2_d3_compito.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public UserData(DataSource ds) {
        getData(ds);
    }

    private void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    public void stampa() {
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Età: " + eta);
    }
}


