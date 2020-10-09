package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;
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
	
}
 
	 
	 
       
	
     

 
