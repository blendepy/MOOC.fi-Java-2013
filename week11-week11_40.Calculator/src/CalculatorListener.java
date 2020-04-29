
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorListener implements ActionListener {

    private JTextField resultField;
    private JTextField middleField;
    private JButton plusButton;
    private JButton minusButton;
    private JButton zButton;
    private Calculator calc;

    public CalculatorListener(JTextField upperField, JTextField middleField, JButton plusButton, JButton minusButton, JButton zButton) {
        this.resultField = upperField;
        this.middleField = middleField;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.zButton = zButton;
        this.calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(plusButton.getActionCommand())) {
            try {
                calc.sum(Integer.parseInt(middleField.getText()));
            } catch (NumberFormatException ex) {
                middleField.setText("");
            }
            resultField.setText(calc.getValue() + "");
            middleField.setText("");
        }
        if (e.getActionCommand().equals(minusButton.getActionCommand())) {
            try {
                calc.minus(Integer.parseInt(middleField.getText()));
            } catch (NumberFormatException ex) {
                middleField.setText("");
            }
            resultField.setText(calc.getValue() + "");
            middleField.setText("");
        }
        if (e.getActionCommand().equals(zButton.getActionCommand())) {
            calc.setValue(0);
            resultField.setText(calc.getValue() + "");
            middleField.setText("");
        }
        if (calc.getValue() == 0) {
            this.zButton.setEnabled(false);
        } else {
            this.zButton.setEnabled(true);
        }
    }
}
