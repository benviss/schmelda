import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



public class Player extends Actor{
  private final String movingUp = "images/chain-up.gif";
  private final String movingRight = "images/chain-right.gif";
  private final String movingDown = "images/chain-down.gif";
  private final String movingLeft = "images/chain-left.gif";

  private final String attackingImgRight = "images/attack-right.gif";
  private final String attackingImgLeft = "images/attack-left.gif";
  private String movementDirection = "images/chain-up.gif";
  private String lastMove;

  private boolean attacking = false;
  public final static int ONE_SECOND = 1000;
  // public Timer(ONE_SECOND, ActionListener listener);


  public long attackTimer;
  public long lastAttack;

  public long gifAnimation = 450;
  public long attackCooldown = ONE_SECOND;

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

  public boolean getAttacking(){
    return attacking;
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

  // public class myTimer implements ActionListener {
  //   public void actionPerformed(ActionEvent evt) {
  //         this.attacking = false;
  //         this.setMovingDown();
  //
  //   }
  // }

  public void attacking() {
    if(lastAttack + attackCooldown < System.currentTimeMillis()){
      lastAttack = System.currentTimeMillis();
      this.setAttackingImg();
      this.attacking =true;
    }
  }
  public boolean checkAttack(){
    if(System.currentTimeMillis() - lastAttack > gifAnimation){
      this.attacking = false;
      URL loc = this.getClass().getResource(movementDirection);
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }
    if(System.currentTimeMillis() - lastAttack > attackCooldown) {
          return true;
    }
    else {
      return false;
    }
  }

  public void setAttackingImg(){
    if(movementDirection.equals("images/chain-up.gif"
  ) || movementDirection.equals("images/chain-right.gif")) {
      URL loc = this.getClass().getResource("images/attack-right.gif");
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      image.flush();
      this.setImage(image);
    } else {
      URL loc = this.getClass().getResource("images/attack-left.gif");
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      image.flush();
      this.setImage(image);
    }
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
      }else {
      }
    } else if (this.moveDirection.equals("Down")) {
      if(!this.checkCollidable(collidables,"Down")) {
        this.setX(this.x() + dx);
        this.setY(this.y() + dy);
      }else {
      }
    } else if (this.moveDirection.equals("Left")) {
      if(!this.checkCollidable(collidables,"Left")) {
        this.setX(this.x() + dx);
        this.setY(this.y() + dy);
      } else {
      }
    } else if (this.moveDirection.equals("Right")) {
      if(!this.checkCollidable(collidables,"Right")) {
        this.setX(this.x() + dx);
        this.setY(this.y() + dy);
      }else {
      }
    }
  }
}
