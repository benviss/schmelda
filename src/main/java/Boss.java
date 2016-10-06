
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Boss extends Actor {

  private Image fire;
  private Image blob;
  public Timer timer;
  public Timer timer2 = new Timer();

  public int health = 5;
  private boolean alive = true;
  private int invincible = 2000;
  private long lastHit = 0;

  public FireBlast blast;

  private boolean clock = true;

  Random myRandomGenerator = new Random();

  public Boss(int x, int y) {
    super(x, y);

    timer = new Timer();
    this.collidable = true;
    URL loc = this.getClass().getResource("images/kingBlob.gif");
    ImageIcon iia = new ImageIcon(loc);
    Image blob = iia.getImage();
    this.setImage(blob);
    move(-32,-32);
  }

  public void move(int x, int y) {
    int nx = this.x() + x;
    int ny = this.y() + y;
    this.setX(nx);
    this.setY(ny);
  }

  public boolean getAlive() {
    return alive;
  }
  public int health() {
    return health;
  }
  public void fireBlastCounter(Boss boss){
      TimerTask timerTask = new TimerTask(){

        @Override
        public void run() {
          if(clock){
            blast = new FireBlast(boss.x()-50,boss.y()-50);
            clock = false;
            Board.fireState = true;
          }
          else{

            clock = true;
            Board.fireState = false;
            if(Board.levelCount != 0)
            {
              timer.cancel();
            }
            if(!alive)
            {
              timer.cancel();
            }
          }
        }

      };
      this.timer.schedule(timerTask, 3000, 3000);

  }

  public boolean checkBoss(Player chain){
    int x = chain.x() + 12;
    int y = chain.y() - 20;

    if((Math.abs(this.x()+16 - x) < 40) && (Math.abs(this.y()-16 - y) < 40)){
      if (chain.getAttacking()){
        System.out.println("  x  " + x + "  **  " + "  y  " + y + "  **  ");
        System.out.println("  x  " + this.x() + "  **  " + "  y  " + this.y() + "  **  ");
        if(this.checkBossHealth()) {
          if(this.alive) {
            Board.score += 5000;
            System.out.println("Win");
            this.alive = false;
          }
          return true;
        } else {
          System.out.println("hit");
          return false;
        }
      }
    }
    return false;
  }

  public boolean checkBossHealth() {
    if (System.currentTimeMillis() - lastHit > invincible) {
      health -= 1;
      lastHit = System.currentTimeMillis();
    }
    if(health == 0) {
      return true;
    }
    return false;
  }
}
