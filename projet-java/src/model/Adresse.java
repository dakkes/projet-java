package model;

public class Adresse {

	private int idAdresse;
	private String rue;
	private String ville;
	private String pays;

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(int idAdresse, String rue, String ville, String pays) {
		super();
		this.idAdresse = idAdresse;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", rue=" + rue + ", ville=" + ville + ", pays=" + pays + "]";
	}

}