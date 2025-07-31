package maurotuzzolino.u6_w2_d3_compito.chain;

import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Scanner;

//@Component
public class GerarchiaRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        GerarchiaService service = new GerarchiaService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un importo: ");
        int importo = scanner.nextInt();

        List<String> ufficiali = service.trovaUfficiali(importo);

        if (ufficiali.isEmpty()) {
            System.out.println("Nessun ufficiale ha uno stipendio almeno pari a " + importo);
        } else {
            System.out.println("Ufficiali con stipendio ≥ " + importo + ":");
            ufficiali.forEach(System.out::println);
        }
    }
}
