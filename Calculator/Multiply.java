import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Multiply extends Button{

    public Multiply(Calculator calculatorInstance){
        super("×");
        addActionListener(this);
        calculator = calculatorInstance;
        setBackground(new Color(204, 153, 102));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.num1 = Double.parseDouble(calculator.textField.getText());
        calculator.operation = '*';
        calculator.textField.setText("");
    }

    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Multiply button
        setBackground(new Color(218, 176, 124));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Multiply button
        setBackground(new Color(204, 153, 102));
    }
}
