package model;

import java.util.Arrays;

public class Vendeur extends Utilisateur {

	private Produit[] produits;

	public Vendeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendeur(int idUtilisateur, String nom, String prenom, String userName, Adresse adresse, String motDePasse) {
		super(idUtilisateur, nom, prenom, userName, adresse, motDePasse);
		// TODO Auto-generated constructor stub
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Vendeur [produits=" + Arrays.toString(produits) + "]";
	}

	 
	 

	 

	 

	 

}
