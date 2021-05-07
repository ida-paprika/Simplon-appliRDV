package fr.simplon.medecine.model;

public abstract class Personne {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	
	public Personne(String nom, String prenom, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = telephone;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}
	public void setNumeroDeTelephone(String telephone) {
		this.numeroDeTelephone = telephone;
	}
	
	public void afficher() {
		System.out.println(this.getNom().toUpperCase() +" "+ this.getPrenom());
		System.out.println("Téléphone : "+ this.getNumeroDeTelephone());
	}

	
}
