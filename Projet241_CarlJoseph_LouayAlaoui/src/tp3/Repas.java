/*
 * 
 * 
 * 
 * 
 * 
 * Derniere mod: 2025-05-10 16:58 Samedi -Carl
 */


package tp3;

public class Repas extends Item {
	
	//--------------------------  Attributs
	
	private int partage;
	private boolean extra_sauce;
	private boolean extra_fromage;
	
	
	//--------------------------- Constructeurs(s)
	
/*  public Repas(repas){ // A faire
* 	?????
* 	?????
*   ?????
* 	}
*   
*/
		
	
	
	public Repas() {
		// TODO Faire la methodes Repas();
	}
	
	public Repas(String description, double prix, int calories, int partage, boolean extra_sauce,boolean extra_fromage) {
		setDescription(description);
		setPrix(prix);
		setCalories(calories);
		setPartage(partage);
		setExtra_sauce(extra_sauce);
		setExtra_fromage(extra_fromage);
	}
	
	//--------------------- Methodes

	public int getPartage() {
		return partage;
	}


	public void setPartage(int partage) {
		this.partage = partage;
	}


	public boolean isExtra_sauce() {
		return extra_sauce;
	}


	public void setExtra_sauce(boolean extra_sauce) {
		this.extra_sauce = extra_sauce;
	}


	public boolean isExtra_fromage() {
		return extra_fromage;
	}


	public void setExtra_fromage(boolean extra_fromage) {
		this.extra_fromage = extra_fromage;
	}
	
	
	//----------- Methodes restantes a coder clone() & toString() 
	
	public Repas clone() {
		//TODO Faire la methode clone();
		return null;
	}

	public String toString() {
		//TODO Faire la methode toString(); 
		return null;
	}
	
	
}
