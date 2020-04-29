package clicker.ui;

import clicker.applicationlogic.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private PersonalCalculator calculator;

    public UserInterface(PersonalCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JLabel textArea = new JLabel("0");
        JButton clickButton = new JButton("Click!");

        ClickListener listener = new ClickListener(calculator, textArea);
        clickButton.addActionListener(listener);

        container.add(textArea);
        container.add(clickButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
