package org.eclipse.model;

import java.util.Arrays;

public class Panier {
	private int idPanier;
	private LignePanier[] lignePaniers;

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panier(int idPanier, LignePanier[] lignePaniers) {
		super();
		this.idPanier = idPanier;
		this.lignePaniers = lignePaniers;
	}

	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	public LignePanier[] getLignePaniers() {
		return lignePaniers;
	}

	public void setLignePaniers(LignePanier[] lignePaniers) {
		this.lignePaniers = lignePaniers;
	}

	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", lignePaniers=" + Arrays.toString(lignePaniers) + "]";
	}

}
