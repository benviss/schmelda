import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Warp extends Actor {
  private int levelId;

    private Image image;

    public Warp(int x, int y, char _levelId) {
        super(x, y);
        URL loc;
        ImageIcon iia;
        if(_levelId == 'i') {
          levelId = 8;
          loc = this.getClass().getResource("images/tree.png");
          iia = new ImageIcon(loc);
          image = iia.getImage();
          this.setImage(image);
        } else {
          levelId = Character.getNumericValue(_levelId);
          loc = this.getClass().getResource("images/new-grass.png");
          iia = new ImageIcon(loc);
          image = iia.getImage();
          this.setImage(image);
        }


    }

    public int getId() {
      return levelId;
    }
}
