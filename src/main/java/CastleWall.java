import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class CastleWall extends Actor {

    private Image image;

    public CastleWall(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/mountain-landscape/76.png");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        this.setImage(image);

    }
}
