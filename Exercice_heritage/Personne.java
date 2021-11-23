package Exercice_heritage;

public class Personne extends Personel {
private String login;
private String mot_de_passe; 
private String service;
private Role role;

public Personne(String login, String mot_de_passe, String service, Role role) {
	super();
	this.login = login;
	this.mot_de_passe = mot_de_passe;
	this.service = service;
}
public Personne(String login, String mot_de_passe, String service, Role role) {
	super();
}
//getter setter 
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMot_de_passe() {
	return mot_de_passe;
}
public void setMot_de_passe(String mot_de_passe) {
	this.mot_de_passe = mot_de_passe;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}

public double calculerSalaire() {
	if (this.role.getLibelle().equalsIgnoreCase("manager")) {
		return 1.1 * this.getSalaire();
	} else if (this.Role.getLibelle().equalsIgnoreCase("directeur general")){
		return 1.4 * this.getSalaire();
	}else 
		return super.calculerSalaire();
}

public String afficher() {
	return super.afficher()+" "+ role.getLibelle()="]";
}

}
