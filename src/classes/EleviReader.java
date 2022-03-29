package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements ApplicantsReader{

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(", \n");
        List<Aplicant> elevi = citireAplicantDinScanner(input2);

        input2.close();
        return elevi;
    }

    private List<Aplicant> citireAplicantDinScanner(Scanner scanner){
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            ApplicantReader.citireAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        return elevi;
    }
}
