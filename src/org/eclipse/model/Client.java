package org.eclipse.model;

import java.util.Arrays;

public class Client extends Utilisateur {

	private Commande[] commandes;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int idUtilisateur, String nom, String prenom, String userName, Adresse adresse, String motDePasse) {
		super(idUtilisateur, nom, prenom, userName, adresse, motDePasse);
		// TODO Auto-generated constructor stub
	}

	public Commande[] getCommandes() {
		return commandes;
	}

	public void setCommandes(Commande[] commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [commandes=" + Arrays.toString(commandes) + "]";
	}

	 
}