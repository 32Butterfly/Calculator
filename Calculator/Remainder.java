import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Remainder extends Button{
    private final Calculator calculator;
    public Remainder(Calculator calculator){
        super("%");
        this.calculator = calculator;
        addActionListener(this);
        setBackground(Color.GRAY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.num1 = Double.parseDouble(calculator.textField.getText());
        calculator.operation = '%';
        calculator.textField.setText("");
    }

    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Remainder button
        setBackground(new Color(169, 167, 167));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Remainder button
        setBackground(Color.GRAY);
    }
}