package model;

public class LigneCommande {

	private int idLigneCommande;
	private int quantiteCommander;
	private Produit produit;
	private Commande commande;
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneCommande(int idLigneCommande, int quantiteCommander, Produit produit, Commande commande) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.quantiteCommander = quantiteCommander;
		this.produit = produit;
		this.commande = commande;
	}
	public int getIdLigneCommande() {
		return idLigneCommande;
	}
	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}
	public int getQuantiteCommander() {
		return quantiteCommander;
	}
	public void setQuantiteCommander(int quantiteCommander) {
		this.quantiteCommander = quantiteCommander;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Override
	public String toString() {
		return "LigneCommande [idLigneCommande=" + idLigneCommande + ", quantiteCommander=" + quantiteCommander
				+ ", produit=" + produit + ", commande=" + commande + "]";
	}
	
	

}
	 