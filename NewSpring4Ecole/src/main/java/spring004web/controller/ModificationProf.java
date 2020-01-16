package spring004web.controller;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class ModificationProf {
private Integer id;
@NotEmpty(message="{modification.prof.nom.notempty}")
private String nom;
@NotEmpty(message="{modification.prof.prenom.notempty}")
private String prenom;
@NotEmpty(message="{modification.prof.date_naissance.notempty}")
private Date date_naissance;
@NotEmpty(message="{modification.prof.adresse.notempty}")
private String adresse;
@NotEmpty(message="{modification.prof.sexe.notempty}")
private String sexe;
public Integer getId() {
return id;
}
public void setId(final Integer pId) {
id = pId;
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
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}

}
