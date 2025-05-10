/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Derniere mod: 2025-05-10 17:01 Samedi -Carl
 */




package tp3;

public class Dessert extends Item {
	
	
	//---------------------------------------- Attributs 
	
	private boolean flambe;
	private boolean chaud;
	
	//---------------------------------------- Constructeurs
	
/*  public Dessert(dessert){ // A faire
* 	?????
* 	?????
*   ?????
* 	}
*   
*/
	
	
	public Dessert() {
		
	}
	
	public Dessert(String description, double prix, int caloirs, boolean flambe, boolean chaud) {
		setDescription(description);
		setPrix(prix);
		setCalories(calories);
		setFlambe(flambe);
		setChaud(chaud);
	}

	public boolean isFlambe() {
		return flambe;
	}

	public void setFlambe(boolean flambe) {
		this.flambe = flambe;
	}

	public boolean isChaud() {
		return chaud;
	}

	public void setChaud(boolean chaud) {
		this.chaud = chaud;
	}
	
	//--------------- Methodes a implementer clone() et toString()
	
	public Dessert clone() {
		//TODO faire la methode clone
		return null;
	}
	
	public String toString() {
		//TODO Faire la methodes toString();
		return null;
	}

}
