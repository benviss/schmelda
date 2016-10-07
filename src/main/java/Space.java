import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Space extends Actor {

    private Image image;

    public Space(int x, int y) {
        super(x, y);

        this.collidable = true;
      

    }
}
