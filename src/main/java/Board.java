import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel {

  // Set size to image size
  private final int OFFSET = 32;
  private final int SPACE = 32;


  // player starting position
  private int playerX = 96;
  private int playerY = 96;

  private static int score = 5;

  public HUD hud = new HUD();
  public Timer timer = new Timer();

  private ArrayList areas = new ArrayList();
  private ArrayList warps = new ArrayList();
  private ArrayList collidables = new ArrayList();

  private Player chain;
  public ArrayList<Enemy> enemies = new ArrayList<Enemy>();

  private int w = 0;
  private int h = 0;
  private int levelCount = 1;
  private boolean completed = false;
  private boolean invincible = false;

  public Board() {
    addKeyListener(new TAdapter());
    setFocusable(true);
    initWorld();
  }

  public int getBoardWidth() {
    return this.w;
  }

  public int getBoardHeight() {
    return this.h;
  }

  public static int getScore() {
    return score;
  }

  public final void initWorld() {
    int x = OFFSET;
    int y = OFFSET;

    Wall wall;
    Area a;
    Warp warp;
    Water w;
    Enemy e;

    String currentLevel = Level.getLevel(levelCount);

    for (int i = 0; i < currentLevel.length(); i++) {
      char item = currentLevel.charAt(i);

      if (item == '\n') {
        y += SPACE;
        if (this.w < x) {
          this.w = x;
        }
        x = OFFSET;
      } else if (item == '#') {
        wall = new Wall(x, y);
        collidables.add(wall);
        x += SPACE;
      } else if (item == 'w') {
        w = new Water(x, y);
        collidables.add(w);
        x += SPACE;
      } else if (item == '.') {
        a = new Area(x, y);
        areas.add(a);
        x += SPACE;
      } else if (item == '?') {
        warp = new Warp(x, y);
        warps.add(warp);
        x += SPACE;
      } else if (item == 'e') {
        e = new Enemy(x, y);
        collidables.add(e);
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      } else if (item == '@') {
        chain = new Player(playerX, playerY);
        a = new Area(x, y);
        areas.add(a);
        x += SPACE;
      } else if (item == ' ') {
        x += SPACE;
      }

    }
    h = y;

    if(enemies.size() > 0){
      enemies.get(0).leftRightMoveRandom(4);
      enemies.get(1).circleMove(30);
    }

  }
  public void buildWorld(Graphics g) {

    g.setColor(new Color(116, 189, 27));
    g.fillRect(0,0,this.getWidth(), this.getHeight());

    ArrayList world = new ArrayList();
    world.addAll(collidables);
    world.addAll(areas);
    world.addAll(warps);
    world.add(chain);
    world.addAll(enemies);

    for (int i = 0; i < world.size(); i++) {
      Actor item = (Actor) world.get(i);
      if ((item instanceof Player) || (item instanceof Enemy)) {
        g.drawImage(item.getImage(), item.x() + 2, item.y() + 2, this);
      } else {
        g.drawImage(item.getImage(), item.x(), item.y(), this);
      }

      if (completed) {
        g.setColor(new Color(116, 189, 27));
        g.drawString("Completed", 25, 20);
      }

      if(chain.checkEnemy(enemies)){

          if(!invincible){

            if(hud.heartLabelTwo.isVisible() == false)
              hud.heartLabelOne.setVisible(false);

            else if(hud.heartLabelThree.isVisible() == false)
              hud.heartLabelTwo.setVisible(false);

            else
              hud.heartLabelThree.setVisible(false);

            System.out.println("**Timer Starts**");
            System.out.println("**Take Damage**");
            InvincibleTimer();
          }

          invincible = true;
     }

    }
  }

  class TAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {

        if (completed) {
            return;
        }

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
          chain.setMovingLeft();


            if(!chain.checkCollidable(collidables,"Left")) {
            chain.move(-chain.getSpace(), 0);
            }

        } else if (key == KeyEvent.VK_RIGHT) {
          chain.setMovingRight();
            if(!chain.checkCollidable(collidables,"Right")) {
            chain.move(chain.getSpace(), 0);
            }

        } else if (key == KeyEvent.VK_UP) {
          chain.setMovingUp();
            if(!chain.checkCollidable(collidables,"Up")) {
            chain.move(0,-chain.getSpace());
            }
        } else if (key == KeyEvent.VK_DOWN) {
          chain.setMovingDown();
            if(!chain.checkCollidable(collidables,"Down")) {
            chain.move(0,chain.getSpace());
            }
            // if (checkWallCollision(chain,
            //         WARP_COLLISION)) {
            //     if(levelCount == 4) {
            //       levelCount = 2;
            //       playerX = 390;
            //       playerY = 50;
            //       restartLevel();
            //       repaint();
            //       return;
            //     }
            // }

        } else if (key == KeyEvent.VK_R) {
            restartLevel();
        }
        repaint();
    }
}


  @Override
  public void paint(Graphics g) {
    super.paint(g);
    buildWorld(g);
  }

  public void restartLevel() {
    areas.clear();
    warps.clear();
    enemies.clear();
    collidables.clear();
    initWorld();
    if (completed) {
        completed = false;
    }
  }

  public void InvincibleTimer(){
    TimerTask timerTask = new TimerTask(){
      @Override
      public void run() {
         System.out.println("**Timer Ends**");
         invincible = false;
        }
      };

    this.timer.schedule(timerTask, 3000);
  }

}
