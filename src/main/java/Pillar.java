import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Pillar extends Actor {

    private Image image;

    public Pillar(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/camp-fire.gif");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
