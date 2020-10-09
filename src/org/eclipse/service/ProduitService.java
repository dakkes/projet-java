package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;

public class ProduitService {

	private ArrayList<Produit> produits = new ArrayList();
	private int findById;

	public void save(Produit produit) {

		produits.add(produit);

	}

	public void remove(Produit produit) {
		produits.remove(produit);
	}

	public void update(Produit produit) {
		for (Produit prod : produits) {
			if (prod.getIdProduit() == produit.getIdProduit()) {
				prod = produit;
			}
		}
	}

	public ArrayList<Produit> findAll(Produit produit) {
		return produits;
	}

	public ArrayList<Produit> findByQuantiteStock() {
		ArrayList<Produit> disponibles = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getQuantiteStock() > 0) {
				disponibles.add(produit);
			}
		}
		return disponibles;
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}

}
