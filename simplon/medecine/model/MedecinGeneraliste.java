package fr.simplon.medecine.model;

public class MedecinGeneraliste extends Personne {

	private static int tarif;
	
	public MedecinGeneraliste(String nom, String prenom, String telephone) {
		super(nom, prenom, telephone);
		tarif = getTarif();
	}

	public static int getTarif() {
		return tarif;
	}
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Tarif : "+ tarif +"€");
	}


	
}
