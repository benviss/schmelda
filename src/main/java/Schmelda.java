import javax.swing.*;
import java.awt.*;

public final class Schmelda extends JFrame {

    private final int OFFSET = 30;

    public Schmelda() {
        InitUI();
    }

    public void InitUI() {
      MasterBoard pane = new MasterBoard();

        Board board = new Board();
        add(board);
        

        Dimension size = new Dimension(500, 50);
        board.hud.setMaximumSize(size);
        board.hud.setPreferredSize(size);
        board.hud.setMinimumSize(size);

        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        pane.add(board.hud);
        pane.add(board);

        add(pane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoardWidth() + OFFSET,
                board.getBoardHeight() + 2*OFFSET);
        setLocationRelativeTo(null);
        setTitle("Schmelda");
    }


    public static void main(String[] args) {

        Schmelda schmelda = new Schmelda();
        schmelda.setVisible(true);
    }
}
