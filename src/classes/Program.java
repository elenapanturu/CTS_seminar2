package classes;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicantsReader readerAngajati = new AngajatiReader();

		try {
			listaAngajati = readerAngajati.citireAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati){
				angajat.afisareSalariuZilinic(1000);
				angajat.afiseazaStatut();

				System.out.println(angajat.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
