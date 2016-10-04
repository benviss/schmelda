import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class CobbleStone extends Actor {

    private Image image;

    public CobbleStone(int x, int y) {
        super(x, y);
        URL loc = this.getClass().getResource("images/mountain-landscape/183.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
