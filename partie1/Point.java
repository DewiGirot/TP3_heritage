package partie1;

class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void deplacee(int dx, int dy) {
    x += dx;
    y += dy;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}