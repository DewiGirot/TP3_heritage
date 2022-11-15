package partie4.ex1;

public class Batiment{

  private String adresse;
  private double surfaceHabitable;

  public Batiment(String adresse, double surfaceHabitable){
    this.adresse = adresse;
    this.surfaceHabitable = surfaceHabitable;
  }

  public String getAdresse(){
    return this.adresse;
  }

  public double getSurfaceHabitable(){
    return this.surfaceHabitable;
  }

  @Override
  public String toString(){
    return "L'adresse est : " + getAdresse() + " et sa surface habitable est de " + getSurfaceHabitable() + " m²";
  }
}