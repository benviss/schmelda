
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
private int stepCounter;
private boolean inverse = false;
private int ruld = 0;
private int calc = 3;
private boolean clock = true;
Random myRandomGenerator = new Random();

    public Boss(int x, int y) {
        super(x, y);

        timer = new Timer();
        this.collidable = true;
        URL loc = this.getClass().getResource("images/redBlob.gif");
        ImageIcon iia = new ImageIcon(loc);
        Image blob = iia.getImage();
        this.setImage(blob);
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
            URL loc = this.getClass().getResource("images/fireBlast.gif");
            ImageIcon iia = new ImageIcon(loc);
            Image fire = iia.getImage();
            move(-70,0);
            setImage(fire);
            clock = false;
          }
          else{
            URL loc = this.getClass().getResource("images/redBlob.gif");
            ImageIcon iia = new ImageIcon(loc);
            Image blob = iia.getImage();
            move(70,0);
            setImage(blob);
            clock = true;
          }
        }

      };
      this.timer.schedule(timerTask, 3000, 3000);
    }

}
