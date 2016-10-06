import java.awt.Image;
import java.util.ArrayList;
import java.lang.*;

public class Actor {

  private final int SPACE = 1;

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
      int yModulo = (this.y - SPACE + 16) % 32;
      xCoordinate = this.x - xModulo;
      xtrCoordinate = this.x + 18 - xtrModulo;
      yCoordinate = (this.y - SPACE + 16) - yModulo;
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
      int yModulo = (this.y + 16) % 32;
      int ytrModulo = ((this.y + 24) % 32);
      int xModulo = (this.x - SPACE) % 32;
      yCoordinate = (this.y + 16) - yModulo;
      ytrCoordinate = this.y + 24 - ytrModulo;
      xCoordinate = (this.x - SPACE) - xModulo;

      for (Actor _actor : _allCollidableActors) {
        if((_actor.x() == xCoordinate && _actor.y() == yCoordinate)) {
          if(_actor.getCollidable()) {
            // System.out.println(_actor.x() + "******actor x coordinates******");
            // System.out.println(_actor.y() + "******actor x coordinates******");
            // System.out.println(yCoordinate + "******y coordinates******");
            // System.out.println(xCoordinate + "******x coordinates******");
            // System.out.println(ytrCoordinate + "******ytr coordinates******");
            // System.out.println(rxModulo + "******right x coordinates******");
            // System.out.println(byModulo + "******bottom y coordinates******");
            // System.out.println(centerXModulo + "******center x coordinates******");
            // System.out.println(centerYModulo + "******center y coordinates******");

            return true;
          }
        }
        if((_actor.x() == (xCoordinate) && _actor.y() == ytrCoordinate)) {
          if(_actor.getCollidable()) {
            // System.out.println(_actor.x() + "******actor x coordinates******");
            // System.out.println(_actor.y() + "******actor x coordinates******");
            // System.out.println(yCoordinate + "******y coordinates******");
            // System.out.println(xCoordinate + "******x coordinates******");
            // System.out.println(ytrCoordinate + "******ytr coordinates******");

            return true;
          }
        }
      }
      // System.out.println(yCoordinate + "******y coordinates******");
      // System.out.println(xCoordinate + "******x coordinates******");
      // System.out.println(ytrCoordinate + "******ytr coordinates******");
      //
      return false;
    }
    if (_direction.equals("Right")) {
      int yModulo = (this.y + 16) % 32;
      int ybrModulo = ((this.y + 24) % 32);
      int xModulo = (this.x + SPACE + 18) % 32;
      yCoordinate = (this.y + 16) - yModulo;
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

  public int checkWarp(ArrayList<Warp> _warps) {
    int centerXcoord = this.x + 9;
    int centerYcoord = this.y + 12;

    int xcoord = this.x;
    int ycoord = this.y;

    int rxcoord = this.x + 18;
    int bycoord = this.y + 24;

    int centerYModulo = centerYcoord % 32;
    int centerXModulo = centerXcoord % 32;

    int yModulo = ycoord % 32;
    int xModulo = xcoord % 32;

    int byModulo = bycoord % 32;
    int rxModulo = rxcoord % 32;

    for (Warp warp : _warps) {
      // System.out.println(warp.x() + "******warp x coordinates******");
      // System.out.println(warp.y() + "******warp x coordinates******");
      // System.out.println(yModulo + "******x coordinates******");
      // System.out.println(xModulo + "******y coordinates******");
      // System.out.println(rxModulo + "******right x coordinates******");
      // System.out.println(byModulo + "******bottom y coordinates******");
      // System.out.println(centerXModulo + "******center x coordinates******");
      // System.out.println(centerYModulo + "******center y coordinates******");
      if(((centerXcoord - centerXModulo) == warp.x()) && ((centerYcoord - centerYModulo) == warp.y()) ||
        (((xcoord - xModulo) == warp.x()) && ((ycoord - yModulo) == warp.y())) ||
        (((rxcoord - rxModulo) == warp.x()) && ((bycoord - byModulo) == warp.y()))) {

        return warp.getId();
      }
    }
    return -1;
  }

  public boolean checkTile(ArrayList<CobbleStone> _tiles) {
    int centerX = this.x + 9;
    int centerY = this.y + 12;
    int yModulo = centerY % 32;
    int xModulo = centerX % 32;
    for (CobbleStone tile : _tiles) {

      if(((centerX - xModulo) == tile.x()) && ((centerY - yModulo) == tile.y())) {
        return true;
      }
    }
    return false;
  }

  public boolean checkItem(ArrayList<Item> _items) {
    int centerX = this.x + 9;
    int centerY = this.y + 12;
    int yModulo = centerY % 32;
    int xModulo = centerX % 32;
    for (Item item : _items) {

      if(((centerX - xModulo) == item.x()) && ((centerY - yModulo) == item.y())) {

        return true;
      }
    }
    return false;
  }

  public void setNewPosition(){
    if(this.x < 100){
      this.x = 1568;
    } else if(this.x > 1500){
      this.x = 64;
    } else if(this.y < 100){
      this.y = 928;
    } else if(this.y > 800){
      this.y = 64;
    }
  }

  public boolean checkEnemy(ArrayList<Enemy> _allEnemies, Player chain){
    int x = this.x + 12;
    int y = this.y - 20;

    for(Enemy currentEnemy : _allEnemies){

      if(((Math.abs(currentEnemy.x()+16 - x) < 20) && (Math.abs(currentEnemy.y()-16 - y) < 20))){
        if (chain.getAttacking() == true){
          _allEnemies.remove(_allEnemies.indexOf(currentEnemy));
        }

        return true;
      }
        else if(((Math.abs(currentEnemy.x()+16 - x) >= 20) && (Math.abs(currentEnemy.x()+16 - x) < 40)) && ((Math.abs(currentEnemy.y()+16 - y) >= 20) && (Math.abs(currentEnemy.y()-16 - y) < 40))){
        if (chain.getAttacking() == true){
          _allEnemies.remove(_allEnemies.indexOf(currentEnemy));
          return false;

      }
    }
  }

    return false;
  }

  public boolean checkTile(ArrayList<CobbleStone> _allTiles, Player chain){
    int x = this.x + 12;
    int y = this.y - 20;

    for(CobbleStone currentTile : _allTiles){

      if(((Math.abs(currentTile.x()+16 - x) < 20) && (Math.abs(currentTile.y()-16 - y) < 20))){
        return true;
    }
  }

    return false;
  }
}
