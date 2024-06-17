import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Delete extends Button{
    public Delete(Calculator calculatorInstance){
        super("DEL");
        addActionListener(this);
        calculator = calculatorInstance;
        setBackground(Color.GRAY);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = calculator.textField.getText();
        calculator.textField.setText("");
        for (int index = 0; index < str.length() - 1; ++index) {
            calculator.textField.setText(calculator.textField.getText() + str.charAt(index));
            //if the char is minus we can set the i to 0 so we can input another negative number
            if (str.charAt(index) == '-'){
                i = 0;
            }
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