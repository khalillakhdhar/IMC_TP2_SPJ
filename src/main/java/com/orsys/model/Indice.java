package com.orsys.model;

public class Indice {
private double poid,taille;

public double getPoid() {
	return poid;
}

public void setPoid(double poid) {
	this.poid = poid;
}

public double getTaille() {
	return taille;
}

public void setTaille(double taille) {
	this.taille = taille;
}

public Indice(double poid, double taille) {
	super();
	this.poid = poid;
	this.taille = taille;
}


public int calculer()
{
double a=this.poid/Math.pow(this.taille,2);
	return (int) Math.round(a);


}
public String result()
{
	if(calculer()<20)
		return "vous �tes maigre!";
	else if(calculer()<=25)
		return "vous �tes id�ale";
	else
		return "vous �tes en surpoids";
	

}
}
