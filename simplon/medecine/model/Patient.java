package fr.simplon.medecine.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Personne {

	public enum Sexe {F, M};
	private Sexe sexe;
	private long numeroDeSecuriteSociale;
	private LocalDate dateDeNaissance;
	private String commentaires;
	
	public Patient(String nom, String prenom, String telephone, Sexe sexe, long numeroDeSecuriteSociale,
			LocalDate dateDeNaissance, String commentaires) {
		super(nom, prenom, telephone);
		this.sexe = sexe;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaires = commentaires;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public long getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}

	public void setNumeroDeSecuriteSociale(long numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		if (this.sexe == Sexe.F) {
			System.out.println("Sexe : Féminin");
		} else {
			System.out.println("Sexe : Masculin");
		}
		System.out.println("Numéro de Sécurité Sociale : "+ this.numeroDeSecuriteSociale);
		System.out.println("Date de naissance : "+ formatedDate(this.dateDeNaissance));
	}
	
	public String formatedDate(LocalDate date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedDate = date.format(dateFormat);
		return formatedDate;
	}
}
