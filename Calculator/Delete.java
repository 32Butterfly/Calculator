import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Delete extends Button{
    public Delete(Calculator calculatorInstance){
        super("Del");
        addActionListener(this);
        calculator = calculatorInstance;
        setBackground(Color.GRAY);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = calculator.textField.getText();
        calculator.textField.setText("");
        for (int i = 0; i < str.length() - 1; i++) {
            calculator.textField.setText(calculator.textField.getText() + str.charAt(i));
        }
    }
    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Delete button
        setBackground(new Color(169, 167, 167));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Delete button
        setBackground(Color.GRAY);
    }
}