package Exercice_heritage;

public class Personel extends Role{
private String Nom;
private String Prénom;
private String Email;
private String Tel;
private double Salaire;

public Personel() {
	// TODO Auto-generated constructor stub
}


public String afficher() {
	return "Personel [Nom=" + Nom + ", Prénom=" + Prénom + ", Email=" + Email + ", Tel=" + Tel + ", Salaire=" + Salaire
			+ "]";
}
public Personel(String nom, String prénom, String email, String tel, int salaire) {
	super();
	Nom = nom;
	Prénom = prénom;
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
public String getPrénom() {
	return Prénom;
}
public void setPrénom(String prénom) {
	Prénom = prénom;
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
