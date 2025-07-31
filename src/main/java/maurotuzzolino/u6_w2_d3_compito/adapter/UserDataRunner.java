package maurotuzzolino.u6_w2_d3_compito.adapter;

import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

//@Component
public class UserDataRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(LocalDate.of(1990, 1, 1));

        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData(adapter);
        userData.stampa();
    }
}
