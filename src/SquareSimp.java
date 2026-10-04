import javax.swing.SwingUtilities;

/**
 * Entry point: creates a FilledFrame and makes it visible.
 */
public class SquareSimp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FilledFrame frame = new FilledFrame();
            frame.setVisible(true);
        });
    }
}
