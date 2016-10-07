import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Princess extends Actor {

    public Princess(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/princess.gif");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
