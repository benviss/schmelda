import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Player extends Actor {
  private final String movingUp = "images/chain-up.gif";
  private final String movingRight = "images/chain-right.gif";
  private final String movingDown = "images/chain-down.gif";
  private final String movingLeft = "images/chain-left.gif";
  private String movementDirection = "images/chain-down.gif";

    public Player(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource(movementDirection);
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }

    public void setMovingUp(){
      movementDirection = movingUp;
    }
    public void setMovingRight(){
      movementDirection = movingRight;
    }
    public void setMovingDown(){
      movementDirection = movingDown;
    }
    public void setMovingLeft(){
      movementDirection = movingLeft;
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}
