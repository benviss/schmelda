import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Castle extends Actor {

    private Image image;

    public Castle(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/castle2.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
