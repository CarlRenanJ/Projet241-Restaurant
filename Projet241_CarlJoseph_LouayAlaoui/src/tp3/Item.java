/*
 * 
 * 
 * 
 * 
 * 
 * Derniere mod: 2025-05-10 14:41 Samedi -Carl
 */

package tp3;

import java.io.Serializable;

public class Item implements Comparable<Item>, Serializable, Cloneable {

	//Attributs : # Protected
	
	protected String description;
	protected double prix;
	protected int calories;
	
	
	//------------ Constructeurs
	
	public Item() {
		
	}
	
	public Item(String description, double prix, int calories) {
		setDescription(description);
		setPrix(prix);
		setCalories(calories);
	}
	
	
	//----------------------- Methodes
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Item(String description) {
		setDescription(description);
	}
	
	public String toString() {
		return this.description; // This.description ou description tout court ?
	}
	
	
	public boolean equals(Item obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item autre = (Item) obj;
		return this.prix == autre.prix && this.calories == autre.calories; // Equals a verifier pour les int 
	}
	
	
	@Override
	public int compareTo(Item autre) {
		// TODO Auto-generated method stub
		return Integer.compare(this.calories, autre.calories);
	}

}
