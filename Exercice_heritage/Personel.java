package Exercice_heritage;

public class Personel extends Role{
private String Nom;
private String Pr�nom;
private String Email;
private String Tel;
private double Salaire;

public Personel() {
	// TODO Auto-generated constructor stub
}


public String afficher() {
	return "Personel [Nom=" + Nom + ", Pr�nom=" + Pr�nom + ", Email=" + Email + ", Tel=" + Tel + ", Salaire=" + Salaire
			+ "]";
}
public Personel(String nom, String pr�nom, String email, String tel, int salaire) {
	super();
	Nom = nom;
	Pr�nom = pr�nom;
	Email = email;
	Tel = tel;
	Salaire = salaire;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPr�nom() {
	return Pr�nom;
}
public void setPr�nom(String pr�nom) {
	Pr�nom = pr�nom;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getTel() {
	return Tel;
}
public void setTel(String tel) {
	Tel = tel;
}
public int getSalaire() {
	return Salaire;
}
public void setSalaire(int salaire) {
	Salaire = salaire;
}

public double calculerSalaire() {
	
		return this.Salaire();
}
}
