import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Path extends Actor {

    public Path(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("images/path.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
