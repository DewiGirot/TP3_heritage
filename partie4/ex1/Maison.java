package partie4.ex1;

public class Maison extends Batiment{

  private int surfaceJ;
  private int nbPieces;
  
  public Maison(String adresse, int surfaceH, int surfaceJ, int nbPieces){
    super(adresse, surfaceH);
    this.surfaceJ = surfaceJ;
    this.nbPieces = nbPieces;
  }

  public int getNbPieces(){
    return this.nbPieces;
  }

  public double getSurfaceJardin(){
    return this.surfaceJ;
  }

  @Override
  public String toString(){
    return super.toString() + ". La surface du jardin est de " + getSurfaceJardin() + " et le possède " + getNbPieces() + " pièces.";
  }
  
}