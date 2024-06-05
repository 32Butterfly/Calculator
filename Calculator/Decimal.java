import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Decimal extends Button{
    private final Calculator calculator;
    public Decimal(Calculator calculator){
        super(".");
        this.calculator = calculator;
        addActionListener(this);
        setBackground(new Color(89, 55, 50));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //make it so whenever decimal is places in the textField text . is added
        calculator.textField.setText(calculator.textField.getText().concat("."));
    }

    protected void onMouseEntered(MouseEvent e) {
        // Default Decimal hover behavior
        setBackground(new Color(126, 91, 86));
    }

    protected void onMouseExited(MouseEvent e) {
        // Default Decimal state behavior
        setBackground(new Color(89, 55, 50));
    }

}