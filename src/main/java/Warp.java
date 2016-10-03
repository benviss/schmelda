import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Warp extends Actor {

    private Image image;

    public Warp(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
