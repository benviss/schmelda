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
          case 'j':
            loc = this.getClass().getResource("images/landscape/rock.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'g':
            loc = this.getClass().getResource("images/landscape/rock-top.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'c':
            loc = this.getClass().getResource("images/landscape/rock-right.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'h':
          loc   = this.getClass().getResource("images/landscape/rock-bottom.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'l':
          loc   = this.getClass().getResource("images/landscape/rock-left.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'r':
          loc   = this.getClass().getResource("images/landscape/rock-top-cri.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 's':
          loc   = this.getClass().getResource("images/landscape/rock-top-cli.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'a':
          loc   = this.getClass().getResource("images/landscape/rock-bottom-cri.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'b':
          loc   = this.getClass().getResource("images/landscape/rock-bottom-cli.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'u':
          loc   = this.getClass().getResource("images/landscape/rock-top-clo.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'p':
          loc   = this.getClass().getResource("images/landscape/rock-top-cro.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'y':
          loc   = this.getClass().getResource("images/landscape/rock-bottom-clo.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;
          case 'v':
          loc   = this.getClass().getResource("images/landscape/rock-bottom-cro.png");
            iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);
          break;

        }

    }


}
