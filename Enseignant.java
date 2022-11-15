/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaproject;
import java.util.ArrayList;

/**
 *
 * @author nidha
 */
public class Enseignant {
    private String nom;
   private String prenom;
   private String matiere;
   private String titre;
   private String CIN;
   //je vais ajouter arraylist des quiz ajoutés par cet enseignant
   
   private ArrayList<quiz> quizc;
    public Enseignant(String nom,String prenom,String CIN ,String matiere,String titre)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.CIN=CIN;
        this.matiere=matiere;
        this.titre=titre;
        quizc= new ArrayList();
        
    }
    public void setQuizc(ArrayList <quiz> quizc){
            this.quizc=quizc;
    }
    public ArrayList<quiz> getQuizc()
    {
     return quizc;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public String getMatiere()
    {
        return matiere;
    }
    public Enseignant()
    {
        nom=null;
        prenom=null;
        matiere=null;
        titre=null;
        
    }
    
    
    public boolean equals(Object o)
    {
        Enseignant e=(Enseignant) o;
        return((CIN.equals(e.CIN))&&(nom.equals(e.nom))&&(prenom.equals(e.prenom))&&(matiere.equals(e.matiere))&&(titre.equals(e.titre)));
    }
    
}
