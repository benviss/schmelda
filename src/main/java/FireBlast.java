import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class FireBlast extends Actor {

    private Image image;

    public FireBlast(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/fireBlast.gif");
        ImageIcon iia = new ImageIcon(loc);
        image = iia.getImage();
        image.flush();
        this.setImage(image);

    }
}
