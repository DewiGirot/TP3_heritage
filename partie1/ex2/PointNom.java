package partie1.ex2;

public class PointNom extends Point {

  private String name;

  public PointNom(int x, int y, String name) {
    setPoint(x, y);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPointName(int x, int y, String name) {
    setPoint(x, y);
    this.name = name;
  }

  public void affCoordNom() {
    super.afficheCoords();
    System.out.println("Nom du point : " + getName());
  }
}
