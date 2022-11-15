package partie1.ex3;

public class Camion extends Voiture {

  private int poids;
  private double prixPoids;

  public Camion(int vitesseMax, double prix, String couleur, int poids) {
    super(vitesseMax, prix, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixVente(){
    double prixVente = super.calculerPrixVente();
    if (poids > 2000) {
      prixVente = super.calculerPrixVente() / 1.10;
    } else {
      prixVente = super.calculerPrixVente() / 1.20;
    }
    return prixVente;
  }

}