package tp2;

public class Joueur{

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
}