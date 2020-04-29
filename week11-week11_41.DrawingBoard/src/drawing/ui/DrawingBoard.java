package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(100, 50, 70, 70);
        graphics.fillRect(220, 50, 70, 70);
        graphics.fillRect(20, 170, 70, 70);
        graphics.fillRect(300, 170, 70, 70);
        graphics.fillRect(90, 240, 210, 70);
    }
}
