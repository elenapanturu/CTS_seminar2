package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements ApplicantsReader {

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = citireAplicantDinScanner(input2);

        input2.close();
        return angajati;
    }

    private List<Aplicant> citireAplicantDinScanner(Scanner scanner){
        List<Aplicant> angajati = new ArrayList<>();
        while (scanner.hasNext()) {
                Angajat angajat = new Angajat();
                ApplicantReader.citireAplicant(scanner, angajat);
                int salariu = scanner.nextInt();
                String ocupatie = scanner.next();
                angajat.setOcupatie(ocupatie);
                angajat.setSalariu(salariu);
                angajati.add(angajat);
            }
        return angajati;
    }
}

