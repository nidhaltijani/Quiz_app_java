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
public class quiz {
        private String theme;
	private String auteur;
	private QCM[] qcms;
        private static int id=0; // statique et alors lid 0 correspond a la case 0 de larraylist de tbale_quiz
	// jai ajouté l id pour pouvoir modifier un quiz
	public quiz() {
		theme=null;
		auteur=null;
		qcms=new QCM[10];
                id++;
		
	}
        public quiz(String theme, String auteur , QCM[] qcms)
        {
            this.theme=theme;
            this.auteur=auteur;
            this.qcms=qcms;
            id++;
            
        }
        public static int getId()
        {
            return id;
        }

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public QCM[] getQcms() {
		return qcms;
	}

	public void setQcms(QCM[] qcms) {
		this.qcms = qcms;
	}

	@Override
	public String toString() {
		return "quiz [theme=" + theme + ", auteur=" + auteur + ", qcms=" + Arrays.toString(qcms) + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		quiz other = (quiz) obj;
		return Objects.equals(auteur, other.auteur) && Arrays.equals(qcms, other.qcms)
				&& Objects.equals(theme, other.theme);
	}
	public void saisie() {
		/*Scanner s=new Scanner(System.in);
		System.out.println("Veuillez saisir le theme du QCM");
		theme=s.next();
		System.out.println("Veuillez saisir votre nom");
		auteur =s.nextLine();*/ //on la mis dans le constructeur de creerquiz jframe
		for(int i=0;i<10;i++) {
		System.out.println("Veuillez saisir la question à choix multiples numèro "+(i+1)+" que vous souhaitez inserer");
		qcms[i]=new QCM();
		qcms[i].saisie();
		}
	}
}
