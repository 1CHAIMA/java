package Exercice_heritage;

public class Role  {
private int code; 
private int libelle;

public Role(int code, int libelle) {
	super();
	this.code = code;
	this.libelle = libelle;
}

public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public int getLibelle() {
	return libelle;
}
public void setLibelle(int libelle) {
	this.libelle = libelle;
}

}
