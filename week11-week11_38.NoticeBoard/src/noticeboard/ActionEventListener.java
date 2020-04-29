package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {

    public ActionEventListener(JLabel label, JTextField textField) {
        this.label = label;
        this.textField = textField;
    }

    private JLabel label;
    private JTextField textField;

    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(this.textField.getText());
        this.textField.setText("");
    }

}
