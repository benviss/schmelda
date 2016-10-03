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



}
