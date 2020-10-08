package model;

public class Commande {
	private int idCommande;
	private int dateCommande;
	private Client client;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(int idCommande, int dateCommande, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(int dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", client=" + client + "]";
	}

}