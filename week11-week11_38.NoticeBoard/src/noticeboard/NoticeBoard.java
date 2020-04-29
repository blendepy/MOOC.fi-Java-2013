package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    private JTextField textField;
    private JLabel label;
    private JButton button;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));

        this.textField = new JTextField();
        this.button = new JButton("Copy!");
        this.label = new JLabel();

        this.button.addActionListener(new ActionEventListener(label, textField));

        container.add(this.textField);
        container.add(this.button);
        container.add(this.label);

    }
}
