package sql;
//couche m�tier ou mod�le

public class Client {
private int id;
private String nom;
private String prenom;

public Client(String nom, String prenom) {
  super();
  this.nom = nom;
  this.prenom = prenom;
}

public String getNom() {
  return nom;
}

public void setNom(String nom) {
  this.nom = nom;
}

public String getPrenom() {
  return prenom;
}

public void setPrenom(String prenom) {
  this.prenom = prenom;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}