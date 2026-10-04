import javax.swing.JFrame;

/**
 * A JFrame that holds a SquarePanel. The size of the square drawn by the
 * panel is controlled by the {@code squareSize} variable stored here.
 */
public class FilledFrame extends JFrame {

    /** Side length of the square, in pixels. */
    private int squareSize = 150;

    public FilledFrame() {
        super("Filled Square");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        add(new SquarePanel(this));
    }

    public int getSquareSize() {
        return squareSize;
    }

    public void setSquareSize(int squareSize) {
        this.squareSize = squareSize;
        repaint();
    }
}
