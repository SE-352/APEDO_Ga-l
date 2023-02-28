package tp1;

import java.util.Comparator;
import java.util.Objects;

public class Joueur implements Comparable<Joueur>, Comparator<Joueur>{

	private String nom;
	private String prenom;
	private String numeroLicence;
	private int points = 0;
	
	public Joueur() {
		// TODO Auto-generated constructor stub
	}
	
	public Joueur(String nom, String prenom, String numeroLicence, int points) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroLicence = numeroLicence;
		this.points = points;
	}
	
	public Joueur(String nom, String prenom, int points) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroLicence = this.generateNumeroLicence();
		this.points = points;
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

	public String getNumeroLicence() {
		return numeroLicence;
	}

	public void setNumeroLicence(String numeroLicence) {
		this.numeroLicence = this.getNumeroLicence();
	}

	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String generateNumeroLicence() {
		return this.getNom() + (int) (Math.random()*(100-0)) + 0;
	}
	
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", prenom=" + prenom + ", numeroLicence=" + numeroLicence + ", nombrePoints="
				+ points + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		return Objects.equals(nom, other.nom) && points == other.points
				&& Objects.equals(numeroLicence, other.numeroLicence) && Objects.equals(prenom, other.prenom);
	}

	public int compareTo(Joueur j) {
		// TODO Auto-generated method stub
		return this.getNom().compareTo(j.getNom());
	}
	
	public int compare(Joueur j1, Joueur j2) {
		// TODO Auto-generated method stub
		if (j1.getPoints()<j2.getPoints())
			return -1;
		if (j1.getPoints()>j2.getPoints())
			return 1;
		else
			return 0;
	}

}