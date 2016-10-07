import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Script extends Actor {

    public Script(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("images/script.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
