import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Subtraction extends Button{
    private int i = 0;
    private final Calculator calculator;
    public Subtraction(Calculator calculator){
        super("-");
        this.calculator = calculator;
        addActionListener(this);
        setBackground(new Color(204, 153, 102));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*If the text is empty and - has not been pressed it adds -
        to the textField, so it acts like an ability to create a negative number */
        if (calculator.textField.getText().isEmpty() && i == 0){
            calculator.textField.setText("-");
            i++;
        }
        else {
            calculator.num1 = Double.parseDouble(calculator.textField.getText());
            calculator.operation = '-';
            calculator.textField.setText("");
            i = 0; //reset the number to 0, so we can input negative number
        }
    }

    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Delete button
        setBackground(new Color(218, 176, 124));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Delete button
        setBackground(new Color(204, 153, 102));
    }
}
