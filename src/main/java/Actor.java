import java.awt.Image;
import java.util.ArrayList;


public class Actor {

  private final int SPACE = 4;

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
    int xtlCoordinate = 0;
    int xtrCoordinate = 0;
    int xblCoordinate = 0;
    int xbrCoordinate = 0;
    int ytlCoordinate = 0;
    int ytrCoordinate = 0;
    int yblCoordinate = 0;
    int ybrCoordinate = 0;
    int yCoordinate = 0;
    if (_direction.equals("Up")) {
      int xModulo = this.x % 32;
      int xtrModulo = ((this.x + 18) % 32);
      int yModulo = (this.y - SPACE) % 32;
      xCoordinate = this.x - xModulo;
      xtrCoordinate = this.x + 18 - xtrModulo;
      yCoordinate = (this.y - SPACE) - yModulo;
      for (Actor _actor : _allCollidableActors) {
        if((_actor.x() == xCoordinate && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
        if((_actor.x() == (xtrCoordinate) && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
      }
      return false;
    }
    if (_direction.equals("Down")) {
      int xModulo = this.x % 32;
      int xbrModulo = ((this.x + 18) % 32);
      int yModulo = (this.y + SPACE + 24) % 32;
      xCoordinate = this.x - xModulo;
      xbrCoordinate = this.x + 18 - xbrModulo;
      yCoordinate = (this.y + SPACE + 24 - yModulo);
      for (Actor _actor : _allCollidableActors) {
        if((_actor.x() == xCoordinate && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
        if((_actor.x() == (xbrCoordinate) && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
      }
      return false;
    }
    if (_direction.equals("Left")) {
      int yModulo = this.y % 32;
      int ytrModulo = ((this.y + 24) % 32);
      int xModulo = (this.x - SPACE) % 32;
      yCoordinate = this.y - yModulo;
      ytrCoordinate = this.y + 24 - ytrModulo;
      xCoordinate = (this.x - SPACE) - xModulo;
      for (Actor _actor : _allCollidableActors) {
        if((_actor.x() == xCoordinate && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
        if((_actor.x() == (xCoordinate) && _actor.y() == ytrCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
      }
      return false;
    }
    if (_direction.equals("Right")) {
      int yModulo = this.y % 32;
      int ybrModulo = ((this.y + 24) % 32);

      int xModulo = (this.x + SPACE + 18) % 32;

      yCoordinate = this.y - yModulo;
      ybrCoordinate = this.y + 24 - ybrModulo;

      xCoordinate = (this.x + SPACE + 18 - xModulo);
      for (Actor _actor : _allCollidableActors) {
        if((_actor.x() == xCoordinate && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
        if((_actor.x() == xCoordinate && _actor.y() == ybrCoordinate)) {
          if(_actor.getCollidable()) {
            return true;
          }
        }
      }
      return false;
    }
    return false;

  }
}
