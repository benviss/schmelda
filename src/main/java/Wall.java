import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Wall extends Actor {

    private Image image;

    public Wall(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/rock-border.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
