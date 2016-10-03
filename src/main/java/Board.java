import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board extends JPanel {

// Set size to image size
    private final int OFFSET = 32;
    private final int SPACE = 32;

// player starting position
    private int playerX = 100;
    private int playerY = 100;

    private ArrayList areas = new ArrayList();
    private ArrayList warps = new ArrayList();
    private ArrayList collidables = new ArrayList();

    private Player chain;
    private ArrayList enemies = new ArrayList();

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

    public final void initWorld() {
      int x = OFFSET;
      int y = OFFSET;

      Wall wall;
      Area a;
      Warp warp;
      Water w;

      String currentLevel = Level.getLevel(levelCount)

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
        } else if (item == '@') {
            chain = new Player(playerX, playerY);
            x += SPACE;
        } else if (item == ' ') {
            x += SPACE;
        }

      }

    }
}
