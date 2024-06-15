import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Root extends Button{
    public Root(Calculator calculatorInstance) {
        super("√");
        addActionListener(this);
        calculator = calculatorInstance;
        setBackground(new Color(89, 55, 50));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.operation = '√';
        calculator.textField.setText("√");
    }

    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Number button
        setBackground(new Color(126, 91, 86));
    }

    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Number button
        setBackground(new Color(89, 55, 50));
    }
}
