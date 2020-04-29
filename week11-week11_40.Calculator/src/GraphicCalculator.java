
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));

        JTextField resultField = new JTextField("0");
        JTextField middleField = new JTextField();
        resultField.setEnabled(false);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);

        JPanel panel = new JPanel(new GridLayout(1, 3));

        panel.add(plus);
        panel.add(minus);
        panel.add(z);

        CalculatorListener listener = new CalculatorListener(resultField, middleField, plus, minus, z);

        plus.addActionListener(listener);
        minus.addActionListener(listener);
        z.addActionListener(listener);

        container.add(resultField);
        container.add(middleField);
        container.add(panel, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
