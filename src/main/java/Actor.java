import java.awt.Image;
import java.util.ArrayList;


public class Actor {

  private final int SPACE = 8;

  private int x;
  private int y;
  private Image image;

  public boolean collidable = false;

  public Actor(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public Image getImage() {
    return this.image;
  }
  public void setImage(Image img) {
    image = img;
  }
  public int x() {
    return this.x;
  }
  public int getSpace() {
    return SPACE;
  }
  public boolean getCollidable() {
    return collidable;
  }
  public int y() {
      return this.y;
  }
  public void setX(int x) {
      this.x = x;
  }
  public void setY(int y) {
      this.y = y;
  }

  public boolean checkCollidable(ArrayList<Actor> _allCollidableActors, String _direction) {
    int xCoordinate = 0;
    int yCoordinate = 0;
    if (_direction.equals("Up")) {
      int xModulo = this.x % 32;
      int yModulo = (this.y - SPACE) % 32;
      xCoordinate = this.x - xModulo;
      yCoordinate = (this.y - SPACE) - yModulo;
    }
    if (_direction.equals("Down")) {
      int xModulo = this.x % 32;
      int yModulo = (this.y + SPACE) % 32;
      xCoordinate = this.x - xModulo;
      yCoordinate = (this.y + SPACE) - yModulo;
    }
    if (_direction.equals("Left")) {
      int xModulo = (this.x - SPACE) % 32;
      int yModulo = this.y % 32;
      xCoordinate = (this.x - SPACE) - xModulo;
      yCoordinate = this.y - yModulo;
    }
    if (_direction.equals("Right")) {
      int xModulo = (this.x + SPACE) % 32;
      int yModulo = this.y % 32;
      xCoordinate = (this.x + SPACE) - xModulo;
      yCoordinate = this.y - yModulo;
    }
    for (Actor _actor : _allCollidableActors) {
      if((_actor.x() == xCoordinate) && (_actor.y() == yCoordinate)) {
        return _actor.getCollidable();
      }
    }
    return false;
  }
}
