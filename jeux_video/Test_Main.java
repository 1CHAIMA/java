package jeux_video;

import java.util.Random;

public class Test_Main {

	public static void main(String[] args) {
		Random random = new Random();  
		Joueurs j =new Joueurs("Fakhri", random.nextInt((10 - 5) + 1) + 5 );
		Joueurs j2 =new Joueurs("Chaima", random.nextInt((10 - 5) + 1) + 5 );
		System.out.println("Affichage du premier joueur");
		System.out.println(j.getNom()+" :"+" santé= "+j.getSante()+" force= "+j.getForce()+" expériance= "+j.getExperiance());
		
		System.out.println("Affichage du premier joueur après changement d'arme");
		Arme arme = new Arme("Excalibur", Type.épée, 2);
		j.changeArme(arme);
		System.out.println(j.getNom()+" : santé="+j.getSante()+" force="+j.getForce()+" expérience= "+j.getExperiance()+" arme:"+j.getArme().getNom_arme()+" puissance="+j.getArme().getPuissance()+" type d’arme="+j.getArme().getType());
		
		System.out.println("Affichage du deuxième joueur");
		Arme arme2 = new Arme("Excalibur", Type.pistolet, 2);
		j2.changeArme(arme2);
		System.out.println(j2.getNom()+" : santé="+j2.getSante()+" force="+j2.getForce()+" expérience= "+j2.getExperiance()+" arme:"+j2.getArme().getNom_arme()+" puissance="+j2.getArme().getPuissance()+" type d’arme="+j2.getArme().getType());
		
		System.out.println("attaque: ");
		Test_Main test= new Test_Main();
		test.attaque(j, j2);
		System.out.println(j.getNom()+" : santé="+j.getSante()+" force="+j.getForce()+" expérience= "+j.getExperiance()+" arme:"+j.getArme().getNom_arme()+" puissance="+j.getArme().getPuissance()+" type d’arme="+j.getArme().getType());

		System.out.println(j2.getNom()+" : santé="+j2.getSante()+" force="+j2.getForce()+" expérience= "+j2.getExperiance()+" arme:"+j2.getArme().getNom_arme()+" puissance="+j2.getArme().getPuissance()+" type d’arme="+j2.getArme().getType());

		
	}
	public void  attaque(Joueurs j1,Joueurs j2) {
		if(j1.getSante()!=0 && j2.getSante()!=0) {
				int res1=j1.getForce()*j1.getSante()*j1.getExperiance()*j1.getArme().puissance;
				int res2=j2.getForce()*j2.getSante()*j2.getExperiance()*j2.getArme().puissance;
				if (res1>res2) {
					j1.setForce(j1.getForce()+1);
					j2.setSante(j2.getSante()-1);	
					System.out.println(j1.getNom() +" a gagné");
					System.out.println(j2.getNom()+ " a été tué");
				}else {
					j2.setForce(j2.getForce()+1);
					j1.setSante(j1.getSante()-1);
					System.out.println(j2.getNom()+" a gagné");
					System.out.println(j1.getNom()+" a été tué");
				}
				j1.setExperiance(j1.getExperiance()+1);
				j2.setExperiance(j2.getExperiance()+1);
	           }
		}
}
