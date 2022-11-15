package partie1.ex3;

public class Renault extends Voiture {

  private int anneeFabrication;
  private int reductionConstructeur;

  public Renault(int vitesseMax, double prix, String couleur, int anneeFabrication, int reductionConstructeur) {
    super(vitesseMax, prix, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reductionConstructeur = reductionConstructeur;
  }

  public int getReductionConstructeur() {
    return this.reductionConstructeur;
  }

  @Override
  public double calculerPrixVente() {
    return super.calculerPrixVente() - getReductionConstructeur();
  }

}