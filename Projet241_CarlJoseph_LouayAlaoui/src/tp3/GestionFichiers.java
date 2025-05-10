/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Derniere mod: 2025-05010 17:24 Samedi -Carl
 */

package tp3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFichiers {
	
	//------ Methodes Pour écrire un fichier binaire
	
		public static void ecrireBinaire(String fichier, ArrayList liste) {
	        try {
	        	FileOutputStream fos = new FileOutputStream(fichier);
	        	ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(liste);
	        } catch (IOException e) {
	            System.out.println("Erreur écriture binaire : " + e.getMessage());
	        }
	    }
		
	    public static ArrayList lireBinaire(String fichier) {
	        try {
	        	FileInputStream fis = new FileInputStream(fichier);
	        	ObjectInputStream ois = new ObjectInputStream(fis);
	            return (ArrayList) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Erreur lecture binaire : " + e.getMessage());
	            return null;
	        }
	    }
	    
	    

	
	
	
	
	
}
