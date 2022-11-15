/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaproject;

/**
 *
 * @author nidha
 */
public class Etudiant {
    String nom;
    String prenom;
    String grp;
    String CIN;
    public Etudiant(String nom, String prenom, String grp, String CIN)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.grp=grp;
        this.CIN=CIN;
    }
    public Etudiant()
    {
        nom=null;
        prenom=null;
        grp=null;
        CIN=null;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Etudiant e =(Etudiant) o;
        return ((nom.equals(e.nom))&&(prenom.equals(e.prenom))&&(grp.equals(e.grp))&&(CIN.equals(e.CIN)));
    }
    
    
    
}
