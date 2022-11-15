/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaproject;
import java.util.*;
/**
 *
 * @author nidha
 */
public class option {
    private String texte;
	//private boolean validite;
	private String validite;
	
	public option(){
		texte=null;
		//validite=false;
                validite="non valide";
	}
	
	public option(String texte,String validite)
	{
		this.texte=texte;
		this.validite=validite;
	}


	public String getTexte() {
		return texte;
	}


	public void setTexte(String texte) {
		this.texte = texte;
	}


	public String getValidite() {
		return validite;
	}


	public void setValidite(String validite) {
		this.validite = validite;
	}


	@Override
	public String toString() {
		return "option [texte=" + texte + ", validite=" + validite + "]";
	}





	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		option other = (option) obj;
		return Objects.equals(texte, other.texte) && Objects.equals(validite, other.validite);*/
                option o= (option) obj;
                return(texte.equals(o.texte)&&(validite.equals(o.validite)));
	}
	
	public void saisie()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Veuillez entrer le texte de l'option");
		texte=s.nextLine();
		do {
		System.out.println("Veuillez entrer la validité de l'option");
		validite=s.next();
		}
		while((validite.equals("valide"))||(validite.equals("non valide")));
	}
}
