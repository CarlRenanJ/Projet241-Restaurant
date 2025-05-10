/*
 * 
 * 
 * 
 * 
 *
 *
 *
 *Derniere mod: 2025-05-10 14:43 Samedi -Carl
 ******************************************************************/


package tp3;


public class Entree extends Item{
	
	//-------------------------- Attributs
	
	private int portions;
	private Format format;
	
	
	//-------------------------- Constructeurs

/*  public Entree(entree){ // A faire
* 	?????
* 	?????
*   ?????
* 	}
*   
*/	
	
	public Entree() {
		//TODO 
	}
	
	// TODO public Entree(Entree);
	
	public Entree(String description, double prix, int calories, int portions, Format format) {
		setDescription(description);
		setPrix(prix);
		setCalories(calories);
		setPortions(portions);
		setFormat(format);
	}
	
	
	
	//
	
	
public Entree(Entree autre) {
		// TODO Auto-generated constructor stub
	this(autre.description, autre.prix, autre.calories, autre.portions);
	}

public Entree(String description, double prix, int calories, int portions2) {
		// TODO Auto-generated constructor stub
	}

//---------------- Methodes
	
	
	
	public int getPortions() {
		return portions;
	}

	public void setPortions(int portions) {
		this.portions = portions;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	//--------------- Methodes a implementer clone() et toString() ou a verifier
	
	@Override
	public Entree clone() {
		return new Entree(this);
	}
	
	@Override
	public String toString() {
		//TODO Faire la methode toString();
		return null;
	}
	
	
}
