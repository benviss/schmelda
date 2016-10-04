import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.regex.*;


public class Board extends JPanel {

  // Set size to image size
  private final int OFFSET = 32;
  private final int SPACE = 32;

  // player starting position
  private int playerX = 320;
  private int playerY = 320;

  private static int score = 5;

  public HUD hud = new HUD();

  public Level level = new Level();
  public ArrayList<String> levelArray = level.returnLevelArray();

  private ArrayList areas = new ArrayList();
  private ArrayList warps = new ArrayList();
  private ArrayList collidables = new ArrayList();

  private Player chain;
  public ArrayList enemies = new ArrayList();

  private int w = 0;
  private int h = 0;
  private int levelCount = 1;
  private boolean completed = false;

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
    Tree t;

    Warp warp;
    Water w;
    Enemy e;
    Fire f;
    Path p;
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
      } else if (item == 'e') {
        e = new Enemy(x, y);
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
      } else if (item == 'f') {
        f = new Fire(x, y);
        p = new Path(x, y);
        areas.add(p);
        collidables.add(f);
        x += SPACE;
      } else if (item == 't') {
        t = new Tree(x, y);
        a = new Area(x, y);
        areas.add(a);
        collidables.add(t);
        x += SPACE;
      } else if (item == '$') {
        p = new Path(x, y);
        areas.add(p);
        x += SPACE;
      } else if (item == '1' || item == '2' || item == '3' || item == '4') {
        p = new Path(x, y);
        areas.add(p);
        warp = new Warp(x, y, item);
        warps.add(warp);
        x += SPACE;
      }

    }
    h = y;
  }
  public void buildWorld(Graphics g) {

    g.setColor(new Color(116, 189, 27));
    g.fillRect(0,0,this.getWidth(), this.getHeight());

    ArrayList world = new ArrayList();

    world.addAll(areas);
    world.addAll(warps);
    world.addAll(collidables);
    world.addAll(enemies);
    world.add(chain);


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

          hud.heartLabelTwo.setVisible(false);

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


}
