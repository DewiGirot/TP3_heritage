package partie1.ex3;

public class Camion extends Voiture {

  private int poids;
  private double prixPoids;

  public Camion(int vitesseMax, double prix, String couleur, int poids) {
    super(vitesseMax, prix, couleur);
    this.poids = poids;

    if (poids > 2000) {
      this.prixPoids = super.calculerPrixDeVente() / 1.10;
    } else {
      this.prixPoids = super.calculerPrixDeVente() / 1.20;
    }
  }

}