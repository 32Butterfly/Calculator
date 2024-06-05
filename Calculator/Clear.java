import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Clear extends Button{
    private final Calculator calculator;
    public Clear(Calculator calculator){
        super("AC");
        this.calculator = calculator;
        addActionListener(this);
        setBackground(Color.GRAY);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.textField.setText("");
        calculator.num1 = 0;
        calculator.num2 = 0;
    }

    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Clear button
        setBackground(new Color(169, 167, 167));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Clear button
        setBackground(Color.GRAY);
    }
}
