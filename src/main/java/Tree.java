import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Tree extends Actor {

    public Tree(int x, int y) {
        super(x, y);

        this.collidable = true;
        URL loc = this.getClass().getResource("images/tree.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
