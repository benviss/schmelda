import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;


import java.util.TimerTask;
import java.util.regex.*;


public class Board extends JPanel {

  // Set size to image size
  private final int OFFSET = 32;
  private final int SPACE = 32;

  // player starting position
  private int playerX = 320;
  private int playerY = 640;

  private static int score = 5;

  public HUD hud = new HUD();
  public Timer timer = new Timer();
  public Timer newtimer = new Timer();

  public Level level = new Level();
  public ArrayList<String> levelArray = level.returnLevelArray();

  private ArrayList areas = new ArrayList();
  private ArrayList<Warp> warps = new ArrayList<>();
  private ArrayList<CobbleStone> tiles = new ArrayList<>();
  private ArrayList<CobbleStone> dangerTiles = new ArrayList<>();
  private ArrayList collidables = new ArrayList();
  private ArrayList<Item> items = new ArrayList();

  private Player chain;
  public ArrayList<Enemy> enemies = new ArrayList<Enemy>();
  public int enemyCounter;

  private int w = 0;
  private int h = 0;
  public static int levelCount = 1;
  private boolean completed = false;
  private boolean invincible = false;
  private final int DELAY = 10;

  public static boolean isFire = false;

  private Boss boss;

  public Board() {
    addKeyListener(new TAdapter());
    setFocusable(true);
    initWorld();
    startTimer();
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
    StatueBottom statueBottom;
    CobbleStone cobbleStone;
    CobbleStone specialTile;
    CobbleStone dangerTile;
    CastleWall castleWall;
    Pillar pillar;
    Water w;
    StatueTop statueTop;
    Item key;


    Enemy e;
    Enemy hard;
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
        wall = new Wall(x, y, 'g');
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
      } else if (item == 'B') {
        a = new Area(x, y);
        areas.add(a);
        boss = new Boss(x, y);
        boss.fireBlastCounter();
        collidables.add(boss);
        x += SPACE;
      } else if (item == 'e') {
        enemyCounter = enemies.size();
        e = new Enemy(x, y, 1, enemyCounter, 'e');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      } else if (item == 'E') {
        enemyCounter = enemies.size();
        hard = new Enemy(x, y, 2, enemyCounter, 'E');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(hard);
        x += SPACE;
      } else if (item == 'q') {
        enemyCounter = enemies.size();
        e = new Enemy(x, y, 1, enemyCounter, 'q');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      }else if (item == 'Q') {
        enemyCounter = enemies.size();
        hard = new Enemy(x, y, 2, enemyCounter, 'Q');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(hard);
        x += SPACE;
      }else if (item == 'o') {
        enemyCounter = enemies.size();
        e = new Enemy(x, y, 1, enemyCounter, 'o');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      }else if (item == 'O') {
        enemyCounter = enemies.size();
        hard = new Enemy(x, y, 2, enemyCounter, 'O');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(hard);
        x += SPACE;
      }else if (item == 'n') {
        enemyCounter = enemies.size();
        e = new Enemy(x, y, 1, enemyCounter, 'n');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      }else if (item == 'N') {
        enemyCounter = enemies.size();
        hard = new Enemy(x, y, 2, enemyCounter, 'N');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(hard);
        x += SPACE;
      }else if (item == 'm') {
        enemyCounter = enemies.size();
        e = new Enemy(x, y, 1, enemyCounter, 'm');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(e);
        x += SPACE;
      }else if (item == 'M') {
        enemyCounter = enemies.size();
        hard = new Enemy(x, y, 2, enemyCounter, 'M');
        a = new Area(x, y);
        areas.add(a);
        enemies.add(hard);
        x += SPACE;
      }else if (item == 'k') {
        a = new Area(x, y);
        areas.add(a);
        if(!hud.keyIcon.isVisible())
        {
          key = new Item(x, y);
          items.add(key);
        }
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
      } else if (item == '1' || item == '2' || item == '3' || item == '4'|| item == '5'|| item == '6'|| item == '7'|| item == '8'|| item == '9') {
        p = new Path(x, y);
        areas.add(p);
        warp = new Warp(x, y, item);
        warps.add(warp);
        x += SPACE;
      } else if (item == '%') {
        statueBottom = new StatueBottom(x,y);
        collidables.add(statueBottom);
        x += SPACE;
      } else if (item == '^') {
        statueTop = new StatueTop(x,y);
        collidables.add(statueTop);
        x += SPACE;
      } else if (item == '+') {
        cobbleStone = new CobbleStone(x,y);
        areas.add(cobbleStone);
        x += SPACE;
      } else if (item == 'z') {
        specialTile = new CobbleStone(x,y);
        areas.add(specialTile);
        tiles.add(specialTile);
        x += SPACE;
      } else if (item == 'd') {
        dangerTile = new CobbleStone(x,y);
        dangerTiles.add(dangerTile);
        x += SPACE;
      } else if (item == 'I') {
        pillar = new Pillar(x,y);
        collidables.add(pillar);
        x += SPACE;
      } else if (item == '|') {
        castleWall = new CastleWall(x,y);
        collidables.add(castleWall);
        x += SPACE;
      } else if (item == 'g') {
        wall = new Wall(x,y, 'g');
        collidables.add(wall);
        x += SPACE;
      }else if (item == 'l') {
        wall = new Wall(x,y, 'l');
        collidables.add(wall);
        x += SPACE;
      }else if (item == 'c') {
        wall = new Wall(x,y, 'c');
        collidables.add(wall);
        x += SPACE;
      }else if (item == 'h') {
        wall = new Wall(x,y, 'h');
        collidables.add(wall);
        x += SPACE;
      }





    }
    chain = new Player(playerX, playerY);
    h = y;

    chain.setArrayList(collidables);
    Enemy.movePatterns(enemies);
    // for(int i = 0; i < enemies.size(); i++){
    //   if(i == 0){
    //     enemies.get(i).leftRightMove(40);
    //   }
    //   else if(i == 1){
    //     System.out.println(enemies.size() + "what");
    //     enemies.get(i).upDownMove(40);
    //   }
    //   else if(i == 2){
    //     enemies.get(i).leftRightMoveRandom(2);
    //   }
    //   else if(i == 3){
    //     enemies.get(i).circleMoveRandom(2);
    //   }
    // }

    // for(int i = 0; i < hardEnemies.size(); i++){
    //   if(i == 0){
    //     hardEnemies.get(i).leftRightMove(10);
    //   }
    //   else if(i == 1){
    //     hardEnemies.get(i).upDownMove(10);
    //   }
    //   else if(i == 2){
    //     hardEnemies.get(i).leftRightMoveRandom(5);
    //   }
    //   else if(i == 3){
    //     hardEnemies.get(i).circleMoveRandom(5);
    //   }
    // }

  }
  public void buildWorld(Graphics g) {

    g.setColor(new Color(0, 0, 0));
    g.fillRect(0,0,this.getWidth(), this.getHeight());

    ArrayList world = new ArrayList();

    world.addAll(dangerTiles);
    world.addAll(areas);
    if(isFire){
      world.add(boss.blast);
    }
    world.addAll(warps);
    world.addAll(collidables);
    world.addAll(enemies);
    world.addAll(items);
    world.add(chain);

    for (int i = 0; i < world.size(); i++) {
      Actor item = (Actor) world.get(i);
      if ((item instanceof Player) || (item instanceof Enemy)) {
        g.drawImage(item.getImage(), item.x() + 2, item.y() + 2, this);
      } else {
        g.drawImage(item.getImage(), item.x(), item.y(), this);
      }

      if (completed) {
        g.setColor(new Color(0, 0, 0));
        g.drawString("Completed", 25, 20);
      }

      if(chain.checkEnemy(enemies, chain)){
        // if (chain.checkAttacking()) {
        //
        // } else {
        if(!invincible){

          if(hud.heartLabelTwo.isVisible() == false) {
            hud.heartLabelTwo.setVisible(true);
            hud.heartLabelThree.setVisible(true);
            levelCount = 1;
            chain.setNewPosition();
            playerX = 1000;
            playerY = 200;
            restartLevel();
            repaint();
          } else if(hud.heartLabelThree.isVisible() == false) {
            hud.heartLabelTwo.setVisible(false);
          } else {
            hud.heartLabelThree.setVisible(false);
          }
          InvincibleTimer();
        }
        invincible = true;
        // }
      }

      if(chain.checkTile(dangerTiles, chain)){

        if(!invincible && isFire){

          if(hud.heartLabelTwo.isVisible() == false) {
            hud.heartLabelTwo.setVisible(true);
            hud.heartLabelThree.setVisible(true);
            levelCount = 1;
            chain.setNewPosition();
            playerX = 1000;
            playerY = 200;
            restartLevel();
            repaint();
          } else if(hud.heartLabelThree.isVisible() == false) {
            hud.heartLabelTwo.setVisible(false);
          } else {
            hud.heartLabelThree.setVisible(false);
          }
          InvincibleTimer();
          invincible = true;
        }
      }
    }
  }

  // public void moveTimer(){
  //   TimerTask timerTask = new TimerTask(){
  //     @Override
  //     public void run() {
  //       chain.move();
  //       System.out.println("hmm");
  //       }
  //     };
  //
  //   this.movetimer.schedule(timerTask, 100);
  // }
  public void startTimer() {
    TimerTask myTask = new TimerTask() {
      @Override
      public void run() {
        try{
          chain.move();
          chain.checkAttack();
          if(chain.checkWarp(warps) != -1) {
            levelCount = chain.checkWarp(warps);
            chain.setNewPosition();
            playerX = chain.x();
            playerY = chain.y();
            restartLevel();
            hud.needKey.setVisible(false);
            repaint();
          }
          // throw new ConcurrentModificationException();
        }
        catch (Exception e){
        }
      }
    };
    timer.schedule(myTask,  10, 10);

  }

  class TAdapter extends KeyAdapter {


    @Override
    public void keyPressed(KeyEvent e) {

      int key = e.getKeyCode();

      if (key == KeyEvent.VK_LEFT) {
        chain.setMovingLeft();
        chain.setMovement("Left");
        chain.setDx(-chain.getSpace());
      } else if (key == KeyEvent.VK_RIGHT) {
        chain.setMovingRight();
        chain.setMovement("Right");
        chain.setDx(chain.getSpace());
      } else if (key == KeyEvent.VK_UP) {
        chain.setMovingUp();
        chain.setMovement("Up");
        chain.setDy(-chain.getSpace());

      } else if (key == KeyEvent.VK_DOWN) {
        chain.setMovingDown();
        chain.setMovement("Down");
        chain.setDy(chain.getSpace());
      } else if (key == KeyEvent.VK_SPACE) {
        chain.setAttackingImg();
        chain.attacking();
        System.out.println("SWORD ATTACK GO!");
      } else if (key == KeyEvent.VK_R) {
        restartLevel();
      }


      if(chain.checkTile(tiles)) {
        if(levelCount == 8)
        {
          hud.needKey.setVisible(true);
          repaint();
        }
      }

      if(chain.checkItem(items)) {
        hud.keyIcon.setVisible(true);
        items.clear();
        repaint();
      }

      repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
      int key = e.getKeyCode();

      if (key == KeyEvent.VK_LEFT) {
        chain.setDx(0);
      }
      if (key == KeyEvent.VK_RIGHT) {
        chain.setDx(0);
      }
      if (key == KeyEvent.VK_UP) {
        chain.setDy(0);
      }
      if (key == KeyEvent.VK_DOWN) {
        chain.setDy(0);
      }
      if (key == KeyEvent.VK_SPACE) {
        chain.setMovingDown();
      }
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
    items.clear();
    initWorld();
    if (completed) {
      completed = false;
    }
  }

  public void InvincibleTimer(){
    TimerTask timerTask = new TimerTask(){
      @Override
      public void run() {
        invincible = false;
      }
    };

    this.timer.schedule(timerTask, 1000);
  }

}
