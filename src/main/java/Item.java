import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Item extends Actor {

    public Item(int x, int y) {
        super(x, y);
        URL loc = this.getClass().getResource("images/key.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
