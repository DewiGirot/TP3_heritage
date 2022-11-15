package partie4.ex1;

public class Immeuble{

  private int nbAppart;

  public Immeuble(String adresse, double surfaceHabitable, int nbAppart){
    super(adresse, surfaceHabitable);
    this.nbAppart = nbAppart;
  }

  public int getNbAppart(){
    return this.nbAppart;
  }

  @Override
  public String toString(){
    return super.toString() + ". Le nombre d'appartement " + getNbAppart();
  }
}