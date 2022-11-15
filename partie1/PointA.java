package partie1;

public class PointA extends Point {
  private int x, y;

  public PointA(int x, int y) {
    super(x, y);
  }

  public void afficher() {
    System.out.println("Les coordonnées de votre point sont : " + getX() + " - " + getY());
  }

  // Question 3 : On devrait réécrire les méthodes getX() etgetY()

}