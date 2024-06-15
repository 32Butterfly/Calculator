import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/*
This is the most important button since it is responsible for calculating the result
Therefore every single exception will be thrown from here such as dividing by zero.
 */
public class Equals extends Button{
    public Equals(Calculator calculatorInstance){
        super("=");
        this.calculator = calculatorInstance;
        addActionListener(this);
        setBackground(new Color(218, 165, 32));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Check if the textField is empty or if the input contains the '-' (the start of a negative number)
            if (calculator.textField.getText().isEmpty() || calculator.textField.getText().equals("-")) {
                JOptionPane.showMessageDialog(calculator.frame, "Incorrect expression formatting. " +
                                "Please ensure that you\n input the 1st number, its operation, and the 2nd number",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if (calculator.operation != '√'){
                calculator.num2 = Double.parseDouble(calculator.textField.getText());
            }

            // Make calculation based on the operation character
            switch (calculator.operation) {
                case '+':
                    calculator.result = calculator.num1 + calculator.num2;
                    break;
                case '-':
                    calculator.result = calculator.num1 - calculator.num2;
                    break;
                case '*':
                    calculator.result = calculator.num1 * calculator.num2;
                    break;
                case '/':
                    if (calculator.num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    else {
                        calculator.result = calculator.num1 / calculator.num2;
                    }
                    break;
                case '%':
                    if (calculator.num2 == 0) {
                        throw new ArithmeticException("Cannot get remainder of 0");
                    }
                    else {
                        calculator.result = calculator.num1 % calculator.num2;
                    }
                    break;
                case '√':
                    doRoot();
                    break;
            }
            calculator.textField.setText(String.valueOf(calculator.result));
            calculator.num1 = calculator.result;
            calculator.operation = '+';
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(calculator.frame, "Invalid input. Please enter a valid number.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(calculator.frame, ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void doRoot(){
        String text = calculator.textField.getText();
        String subText = text.substring(1);
        calculator.num1 = Double.parseDouble(subText);

        if (calculator.num1 < 0 ) {
            throw new ArithmeticException("Root cannot be negative");
        }
        else{
            calculator.result = Math.sqrt(calculator.num1);
        }
    }


    @Override
    protected void onMouseEntered(MouseEvent e) {
        // Custom hover behavior for Equals button
        setBackground(new Color(234, 189, 93));
    }

    @Override
    protected void onMouseExited(MouseEvent e) {
        // Custom normal state behavior for Equals button
        setBackground(new Color(218, 165, 32));
    }
}