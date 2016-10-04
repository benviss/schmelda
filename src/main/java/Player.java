import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.ArrayList;


public class Player extends Actor {
  private final String movingUp = "images/chain-up.gif";
  private final String movingRight = "images/chain-right.gif";
  private final String movingDown = "images/chain-down.gif";
  private final String movingLeft = "images/chain-left.gif";
  private String movementDirection = "images/chain-down.gif";

  private int dx = 0;
  private int dy = 0;
  private String moveDirection = "Idle";
  private ArrayList collidables = new ArrayList();

    public Player(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource(movementDirection);
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }


    public void setMovement(String _direction) {
      this.moveDirection = _direction;
    }

    public void setArrayList(ArrayList collidable) {
      this.collidables.addAll(collidable);
    }

    public void setDx(int _new) {
      this.dx = _new;
    }
    public void setDy(int _new) {
      this.dy = _new;
    }
    public void setMovingUp(){
      movementDirection = movingUp;
      URL loc = this.getClass().getResource(movementDirection);
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }
    public void setMovingRight(){
      movementDirection = movingRight;
      URL loc = this.getClass().getResource(movementDirection);
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }
    public void setMovingDown(){
      movementDirection = movingDown;
      URL loc = this.getClass().getResource(movementDirection);
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }
    public void setMovingLeft(){
      movementDirection = movingLeft;
      URL loc = this.getClass().getResource(movementDirection);
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }

    public void move() {
      if (this.moveDirection.equals("Up")) {
        if(!this.checkCollidable(collidables,"Up")) {
          this.setX(this.x() + dx);
          this.setY(this.y() + dy);
        }
      } else if (this.moveDirection.equals("Down")) {
        if(!this.checkCollidable(collidables,"Down")) {
          this.setX(this.x() + dx);
          this.setY(this.y() + dy);
        }
      } else if (this.moveDirection.equals("Left")) {
        if(!this.checkCollidable(collidables,"Left")) {
          this.setX(this.x() + dx);
          this.setY(this.y() + dy);
        }
      } else if (this.moveDirection.equals("Right")) {
        if(!this.checkCollidable(collidables,"Right")) {
          this.setX(this.x() + dx);
          this.setY(this.y() + dy);
        }
      } else {

      }
    }
}
