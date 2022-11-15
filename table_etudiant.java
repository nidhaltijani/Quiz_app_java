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
public class table_etudiant {
   
   
   
    //essai avec arraylist
    protected static ArrayList<Etudiant> tabetu = new ArrayList();
   
    
    public table_etudiant(){
      // tabetu = new ArrayList();
      
       
       
    }
    
    public ArrayList getTabetu()
    {
        return tabetu;
    }
    public boolean appartient(Etudiant e)
    {
        /*int i=0;
        boolean test=false;
        if(n==0)
            test=false;
        else{
          while((i<n)&&(test==false))
          {
              if (e.equals(tabetu[i]))
                  test=true;
              else 
                  i++;
          }
        }*/
        boolean test=false;
        if (tabetu.isEmpty())
            test=false;
        else if(tabetu.contains(e))
        {
            test=true;
        }
        return test;
        
    }
   /* public boolean ajouter(Etudiant e)
    {   boolean ajout;
        if(n==taille)
            ajout=false;
        else if(appartient(e))
        {
            ajout=false;
        }
        else{
            tabetu[n]=new Etudiant();
            tabetu[n]=e;
            n++;
            ajout=true;
        }
        return ajout;
    
    }*/ 
    
    
    
}
