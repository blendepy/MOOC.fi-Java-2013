package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {

    private JLabel textArea;
    private Calculator calc;

    public ClickListener(Calculator calc, JLabel textArea) {
        this.textArea = textArea;
        this.calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        this.textArea.setText(calc.giveValue() + "");
    }

}
