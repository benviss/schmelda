
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.util.Timer;
import java.util.TimerTask;

public class Enemy extends Actor {

public Timer timer;
public static Timer weakTimer;
private int stepCounter;
private boolean inverse = false;


    public Enemy(int x, int y) {
        super(x, y);

        timer = new Timer();
        weakTimer = new Timer();

        this.collidable = true;
        URL loc = this.getClass().getResource("images/redBlob.gif");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }


    public void startTimer(){
      TimerTask timerTask = new TimerTask(){
        @Override
        public void run() {

          if(inverse){
            move(1,0);
          }
          else {
            move(-1,0);
          }
          stepCounter += 1;

          if( stepCounter > 100)
          {
            stepCounter = 0;
            inverse = !inverse;
          }

        }
      };
      this.timer.schedule(timerTask, 0, 50);
    }

    public void startTimer2(){
      TimerTask timerTask = new TimerTask(){
        @Override
        public void run() {

          if(inverse){
            move(0,1);
          }
          else {
            move(0,-1);
          }
          stepCounter += 1;

          if( stepCounter > 100)
          {
            stepCounter = 0;
            inverse = !inverse;
          }

        }
      };
      this.timer.schedule(timerTask, 0, 50);
    }

}
