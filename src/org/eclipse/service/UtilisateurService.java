package org.eclipse.service;

import java.util.ArrayList;

//import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	
	private ArrayList<Utilisateur> utilisateurs = new ArrayList();
	
	public Utilisateur findByLoginAndPassword  (String username, String password) {
		
		for (Utilisateur utilistateur : utilisateurs) {
			if (utilistateur.getLogin().equals(username) && utilistateur.getPassword().equals(password) ) {
				 return utilistateur;
			
	 
			}
		}
		return null;
	}

	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
	public void save(Utilisateur utilisateur) {

		utilisateurs.add(utilisateur);

	}

	public void remove(Utilisateur utilisateur) {
		utilisateurs.remove(utilisateur);
	}

	public void update(Utilisateur utilisateur) {
		for (Utilisateur uti : utilisateurs) {
			if (uti.getIdUtilisateur() == utilisateur.getIdUtilisateur()){
				uti = utilisateur;
			}
		}
	}

	public ArrayList<Utilisateur> findAll(Utilisateur utilisateur) {
		return utilisateurs;
	}
	
	
	
	
	
	
	
	
	
	
	

	 
	
	
}
 
	 
	 
       
	
     

 
