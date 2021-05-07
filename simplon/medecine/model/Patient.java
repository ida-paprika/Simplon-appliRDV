package fr.simplon.medecine.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {

	private char sexe;
	private long numeroDeSecuriteSociale;
	private LocalDate dateDeNaissance;
	private String commentaires;
	
	public Patient(String nom, String prenom, String telephone, char sexe, long numeroDeSecuriteSociale,
			LocalDate dateDeNaissance, String commentaires) {
		super(nom, prenom, telephone);
		this.sexe = sexe;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaires = commentaires;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
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
		System.out.println("Sexe : " + (this.sexe == 'F' ? "Féminin" : "Masculin"));
		System.out.println("Numéro de Sécurité Sociale : "+ this.numeroDeSecuriteSociale);
//		System.out.println("Date de naissance : "+ formatedDate(this.dateDeNaissance));
		System.out.println("Date de naissance : "+ DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(this.dateDeNaissance));
//		System.out.println("Commentaires : "+ (this.commentaires == null ? "[aucun commentaire]" : this.commentaires) );
		System.out.println("Commentaires : "+ checkCommentaires(this.commentaires));
	}
	
	public String formatedDate(LocalDate date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String formatedDate = date.format(dateFormat);
		return formatedDate;
	}
	
	public String checkCommentaires(String commentaire) {
		if (commentaire == null) {
			return "[aucun commentaire]";
		} else {
			return commentaire;
		}
	}
	
	
}
