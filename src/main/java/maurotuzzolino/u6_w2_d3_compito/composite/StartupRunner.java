package maurotuzzolino.u6_w2_d3_compito.composite;

import org.springframework.boot.CommandLineRunner;

import java.util.List;

//@Component
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Pagina p1 = new Pagina(1, "Introduzione");
        Pagina p2 = new Pagina(2, "Contenuti base");
        Pagina p3 = new Pagina(3, "Dettagli");

        Sezione sezione1 = new Sezione("Capitolo 1");
        sezione1.aggiungi(p1);
        sezione1.aggiungi(p2);

        Sezione sezione2 = new Sezione("Capitolo 2");
        sezione2.aggiungi(p3);

        Sezione sezionePrincipale = new Sezione("Parte I");
        sezionePrincipale.aggiungi(sezione1);
        sezionePrincipale.aggiungi(sezione2);

        Libro libro = new Libro("Il Design dei Pattern", List.of("Gamma", "Helm", "Johnson", "Vlissides"), 29.99);
        libro.aggiungiContenuto(sezionePrincipale);

        libro.stampa();
        System.out.println("Totale pagine: " + libro.getNumeroTotalePagine());
    }
}
