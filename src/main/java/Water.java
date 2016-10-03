import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Water extends Actor {

    private Image image;

    public Water(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/water.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
