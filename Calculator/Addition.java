import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Addition extends Button{

    public Addition(Calculator calculatorInstance) {
        super("+");
        this.calculator = calculatorInstance;
        addActionListener(this);
        setBackground(new Color(204, 153, 102));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.num1 = Double.parseDouble(calculator.textField.getText());
        calculator.operation = '+';
        calculator.textField.setText("");
    }

    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Addition button
        setBackground(new Color(218, 176, 124));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Addition button
        setBackground(new Color(204, 153, 102));
    }
}
