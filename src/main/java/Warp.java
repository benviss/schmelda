import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Warp extends Actor {
  private int levelId;

    private Image image;

    public Warp(int x, int y, char _levelId) {
        super(x, y);

        levelId = Integer.valueOf(_levelId);

        URL loc = this.getClass().getResource("images/chain-down.gif");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
