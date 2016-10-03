import javax.swing.JFrame;


public final class Schmelda extends JFrame {

    private final int OFFSET = 30;

    public Schmelda() {
        InitUI();
    }

    public void InitUI() {
        Board board = new Board();
        add(board);

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
