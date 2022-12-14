package partie1.ex3;

public class Voiture {

  private int vitesseMax;
  private double prixDeBase;
  private String couleur;

  public Voiture(int vitesseMax, double prix, String couleur) {
    this.vitesseMax = vitesseMax;
    this.prixDeBase = prix;
    this.couleur = couleur;
  }

  public int getVitesseMax() {
    return vitesseMax;
  }

  public void setVitesseMax(int vitesseMax) {
    this.vitesseMax = vitesseMax;
  }

  public double getPrix() {
    return prixDeBase;
  }

  public void setPrix(double prix) {
    this.prixDeBase = prix;
  }

  public String getCouleur() {
    return couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public double calculerPrixVente() {
    return this.prixDeBase;
  }

}