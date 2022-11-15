package partie3.ex1;

public class IngenieurLogiciel extends Personne{

  public IngenieurLogiciel(String nom){
    super(nom);
  }

  @Override
  public void afficher(){
    System.out.println("Nom logiciel réseau : " + getNom());
  }
  
}