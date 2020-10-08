package model;

public class Produit {

	private int idProduit;
	private int quantiteStock;
	private String categorie;
	private String designation;
	private int prixUnitaire;
	private String image;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(int idProduit, int quantiteStock, String categorie, String designation, int prixUnitaire,
			String image) {
		super();
		this.idProduit = idProduit;
		this.quantiteStock = quantiteStock;
		this.categorie = categorie;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.image = image;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", quantiteStock=" + quantiteStock + ", categorie=" + categorie
				+ ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + ", image=" + image + "]";
	}

}