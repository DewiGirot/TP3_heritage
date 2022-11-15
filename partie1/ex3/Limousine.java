package partie1.ex3;

public class Limousine extends Voiture {

  private int longueur;

  public Limousine(int vitesseMax, double prix, String couleur, int longueur) {
    super(vitesseMax, prix, couleur);
    this.longueur = longueur;
  }

  public int getLongueur() {
    return this.longueur;
  }

  @Override
  public double calculerPrixVente() {
    if (getLongueur() > 6) {
      return super.calculerPrixDeVente() / 1.05;
    } else {
      return super.calculerPrixDeVente() * 1.1;
    }
  }

}