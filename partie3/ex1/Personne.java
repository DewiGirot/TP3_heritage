package partie3.ex1;

public class Personne{

  private String nom;

  public Personne(String nom){
    this.nom = nom;
  }
  
  public String getNom(){
    return this.nom;
  }

  public void afficher(){
    System.out.println("Nom : " + getNom());
  }
  
}