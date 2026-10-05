package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCalc extends JFrame {
    JTextField input;
    JLabel result;
    JPanel drawPanel;
    Square square = new Square(20, 20, 0);

    public DrawCalc() {
        super("DrawCalc");

        // first panel: draws the square and shows the result
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawRect(square.getPosX(), square.getPosY(),
                        square.getSideLength(), square.getSideLength());
            }
        };
        drawPanel.setPreferredSize(new Dimension(400, 300));
        result = new JLabel("Enter a side length and press set");
        drawPanel.add(result);

        // second panel: input field and buttons
        JPanel controlPanel = new JPanel();

        add(drawPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        input = new JTextField("", 10);
        controlPanel.add(input);

        JButton setLength = new JButton("set");
        JButton calcArea = new JButton("calc area");
        controlPanel.add(setLength);
        controlPanel.add(calcArea);

        setLength.addActionListener(new ButtonHandler(this, 1));
        calcArea.addActionListener(new ButtonHandler(this, 2));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        DrawCalc app = new DrawCalc();
        app.setVisible(true);
    }
}

class ButtonHandler implements ActionListener {
    DrawCalc theApp;
    int action; // 1 = set length, 2 = calc area

    ButtonHandler(DrawCalc app, int action) {
        this.theApp = app;
        this.action = action;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (action == 1) {
            try {
                Integer length = Integer.valueOf(theApp.input.getText().trim());
                theApp.square.setLength(length);
                theApp.result.setText("Side length set to " + length);
                theApp.drawPanel.repaint();
            } catch (NumberFormatException ex) {
                theApp.result.setText("Please enter a whole number");
            }
        } else if (action == 2) {
            Integer area = theApp.square.calcArea();
            theApp.result.setText("Area = " + area);
        }
    }
}
