
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Enemy extends Actor {

public Timer timer;
public Timer timer2 = new Timer();
private int stepCounter;
private boolean inverse = false;
private int ruld = 0;
private int calc = 3;
Random myRandomGenerator = new Random();

    public Enemy(int x, int y) {
        super(x, y);

        timer = new Timer();

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

    public void leftRightMove(int speed){
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
      this.timer.schedule(timerTask, 0, speed);
    }

    public void upDownMove(int speed){
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
      this.timer.schedule(timerTask, 0, speed);
    }

    public void circleMove(int speed){
      TimerTask timerTask = new TimerTask(){
        @Override
        public void run() {

          if(ruld == 0){
            move(1,0);
          }
          else if(ruld == 1){
            move(0,-1);
          }
          else if(ruld == 2){
            move(-1,0);
          }
          else{
            move(0,1);
          }

          if( stepCounter > 100)
          {
            ruld += 1;

            if(ruld == 4){
              ruld = 0;
            }

            stepCounter = 0;
          }

          stepCounter += 1;
        }
      };
      this.timer.schedule(timerTask, 0, speed);
    }

    public void leftRightMoveRandom(int max){
      TimerTask timerTask = new TimerTask(){

        @Override
        public void run() {
          if(inverse){
            move(calc,0);
            stepCounter += calc;
          }
          else {
            move(-calc,0);
            stepCounter += calc;
          }

          if( stepCounter > 100)
          {
            stepCounter = 0;
            inverse = !inverse;
            calc = myRandomGenerator.nextInt(max) + 2;
          }
        }
      };
      this.timer2.schedule(timerTask, 0, 30);
    }

    public void circleMoveRandom(int speed){
      TimerTask timerTask = new TimerTask(){
        @Override
        public void run() {

          if(ruld == 0){
            move(calc,0);
            stepCounter += calc;
          }
          else if(ruld == 1){
            move(0,-calc);
            stepCounter += calc;
          }
          else if(ruld == 2){
            move(-calc,0);
            stepCounter += calc;
          }
          else{
            move(0,calc);
            stepCounter += calc;
          }

          if( stepCounter > 100)
          {
            ruld += 1;

            if(ruld == 4){
              ruld = 0;
            }

            stepCounter = 0;
            calc = myRandomGenerator.nextInt(speed) + 2;
          }

        }
      };
      this.timer.schedule(timerTask, 0, 30);
    }

}
