import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.ArrayList;


public class Enemy extends Actor {
  Random myRandomGenerator = new Random();
  public Timer timer;
  public Timer timer2 = new Timer();
  private boolean inverse = false;
  private int stepCounter;
  private int mId;
  private int ruld = 0;
  private int calc = 3;
  private char movePattern;
  // private int speed;

  public Enemy(int x, int y, int type, int _id, char _move) {
    super(x, y);
    mId = _id;
    timer = new Timer();
    this.movePattern = _move;
    if (type == 1) {
      this.collidable = true;
      URL loc = this.getClass().getResource("images/blueBlob.gif");
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    } else if(type == 2) {
      this.collidable = true;
      URL loc = this.getClass().getResource("images/camoBlob.gif");
      ImageIcon iia = new ImageIcon(loc);
      Image image = iia.getImage();
      this.setImage(image);
    }
  }
  public int getId(){
    return mId;
  }
  public char getMovePattern() {
    return movePattern;
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
        }else if(ruld == 1){
          move(0,-1);
        }else if(ruld == 2){
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
          calc = myRandomGenerator.nextInt(max) + 1;
        }
      }
    };
    System.out.println(calc);
    this.timer2.schedule(timerTask, 0, 50);
  }

  public void circleMoveRandom(int speed){
    TimerTask timerTask = new TimerTask(){
      @Override
      public void run() {

        if(ruld == 0){
          move(calc,0);
          stepCounter += calc;
        }else if(ruld == 1){
          move(0,-calc);
          stepCounter += calc;
        }else if(ruld == 2){
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
          calc = myRandomGenerator.nextInt(speed) + 1;
        }
      }
    };
    this.timer.schedule(timerTask, 0, 50);
  }

  public static void movePatterns(ArrayList<Enemy> _enemies) {
    for (Enemy currentEnemy : _enemies) {
      switch (currentEnemy.getMovePattern()) {
        case 'm':
          currentEnemy.leftRightMove(40);
          break;
        case 'M':
          currentEnemy.leftRightMove(10);
          break;
        case 'n':
          currentEnemy.upDownMove(40);
          break;
        case 'N':
          currentEnemy.upDownMove(10);
          break;
        case 'o':
          currentEnemy.circleMoveRandom(2);
          break;
        case 'O':
          currentEnemy.circleMoveRandom(5);
          break;
        case 'q':
          currentEnemy.leftRightMoveRandom(2);
          break;
        case 'Q':
          currentEnemy.leftRightMoveRandom(5);
          break;
      }
    }
  }
}
