import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;

public class HUD extends JPanel {

    public Image heart1;
    public Image heart2;
    public Image heart3;
    public int currentScore;
    public JLabel heartLabelOne;
    public JLabel heartLabelTwo;
    public JLabel heartLabelThree;
    public JLabel score;

    public HUD() {

        initHUD();
    }

    public void initHUD() {

        loadImage();

    }

    public void loadImage() {

      ImageIcon h1 = new ImageIcon("images/Heart.gif");
      heart1 = h1.getImage();
      ImageIcon h2 = new ImageIcon("images/Heart.gif");
      heart2 = h2.getImage();
      ImageIcon h3 = new ImageIcon("images/Heart.gif");
      heart3 = h3.getImage();

      ImageIcon filler = new ImageIcon("");

      heartLabelOne = new JLabel("", h1, JLabel.CENTER);
      add(heartLabelOne);

      heartLabelTwo = new JLabel("", h2, JLabel.CENTER);
      add(heartLabelTwo);

      heartLabelThree = new JLabel("", h3, JLabel.CENTER);
      add(heartLabelThree);

      score = new JLabel("Score: " + Board.getScore(), filler , JLabel.LEADING);
      score.setIconTextGap(250);
      score.setForeground(Color.white);
      add(score);
      System.out.println("Initial score");
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        score.setText("Score: " + Board.getScore());
        g.drawImage(heart2, 0, 0, null);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.drawString("Test this",0,0);

    }

}
