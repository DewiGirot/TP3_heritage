package partie4.ex1.*;

public class testBatiment{

  public static void main(String[] args){
    Batiment b = new Batiment("1 rue de la paix", 1000);
    Maison m = new Maison("2 rue de la paix", 2000, 500, 7);
    Immeuble i = new Immeuble("3 rue de la paix", 2000, 6);

    b.afficher();
    m.afficher();
    i.afficher();

    public int surfaceHabitableTotale(Batiment[] tabBat){
      int res = 0;
      for(int i=0; i<tabBat.length; i++){
        res += i.getSurfaceHabitable();
      }
      return res;
    }

    public int surfaceJardinTotale(Batiment[] tabBat){
      
    }
  }
  
}