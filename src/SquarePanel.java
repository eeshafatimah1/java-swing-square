import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A JPanel that draws a green filled square. The square's size is read from
 * the owning FilledFrame each time the panel is painted.
 */
public class SquarePanel extends JPanel {

    private final FilledFrame frame;

    public SquarePanel(FilledFrame frame) {
        this.frame = frame;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = frame.getSquareSize();
        // Center the square in the panel.
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
    }
}
