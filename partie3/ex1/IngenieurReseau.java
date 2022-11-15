package partie3.ex1;

public class IngenieurReseau extends Personne{

  public IngenieurReseau(String nom){
    super(nom);
  }

  @Override
  public void afficher(){
    System.out.println("Nom ingénieur réseau : " + getNom());
  }
  
}