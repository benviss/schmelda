
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

    public void fireBlastCounter(){
      TimerTask timerTask = new TimerTask(){

        @Override
        public void run() {
          if(clock){
            blast = new FireBlast(370,670);
            clock = false;
            Board.isFire = true;
            System.out.println("Fire on: " + Board.isFire );
          }
          else{

            clock = true;
            Board.isFire = false;
            System.out.println("Fire off: " + Board.isFire );
            if(Board.levelCount != 1)
            {
              timer.cancel();
              System.out.println("Timer cancelled");
            }
          }
        }

      };
        this.timer.schedule(timerTask, 3000, 3000);
    }

}
