import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Heart extends Actor {

    public Heart(int x, int y) {
        super(x, y);
        URL loc = this.getClass().getResource("images/Heart.gif");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
