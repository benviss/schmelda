import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Rock extends Actor {

    private Image image;

    public Rock(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/grass-rock.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
