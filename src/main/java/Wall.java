import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Wall extends Actor {

    private Image image;

    public Wall(int x, int y, char type) {
        super(x, y);
        this.collidable = true;
        URL loc;
        ImageIcon iia;
        switch (type){

          case 'g':
            loc = this.getClass().getResource("images/terrain/top-rock.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'c':
            loc = this.getClass().getResource("images/terrain/right-rock.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'h':
          loc   = this.getClass().getResource("images/terrain/bottom-rock.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'l':
          loc   = this.getClass().getResource("images/terrain/left-rock.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;



        }

    }


}
