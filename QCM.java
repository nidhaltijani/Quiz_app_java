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
public class QCM {
    	private int num;
        
	private String txt;
	private option [] tabopt;
	
	public QCM()
	{
		num=0;
		txt=null;
		tabopt=new option[4];
	}
        public QCM(int num,String txt,option[] tabopt) //a verifier
        {
            this.num=num;
            this.txt=txt;
            this.tabopt=tabopt;
        }

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public option[] getTabopt() {
		return tabopt;
	}

	public void setTabopt(option[] tabopt) {
		this.tabopt = tabopt;
	}

	@Override
	public String toString() {
		return "QCM [num de la question est=" + num + ", le texte est=" + txt + ", les options sont =" + Arrays.toString(tabopt) + "]";
	}
	public void saisie() {
		Scanner s=new Scanner(System.in);
		System.out.println("veuillez entrer le numèro de la question");
		num=s.nextInt();
		System.out.println("veuillez entrer le texte de la question");
		txt=s.nextLine();
		for(int i=0;i<4;i++)
		{
			System.out.println("Veuillez saisir l'option numèro "+(i+1));
			tabopt[i]=new option();
			tabopt[i].saisie();
		}
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QCM other = (QCM) obj;
		return num == other.num && Arrays.equals(tabopt, other.tabopt) && Objects.equals(txt, other.txt);
	}
}
