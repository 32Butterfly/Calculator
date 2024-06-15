import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    public JFrame frame;
    public JTextField textField;
    private final Button[] operationButtons = new Button[10];
    private final Numbers[] numberButtons = new Numbers[10];
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    /*default operation is + so that if you just input a number and press = it will just add that
    number to 0 the second time it will add to the previous result and so on */
    char operation = '+';

    Font font = new Font("Roboto", Font.BOLD, 22);

    public Calculator() {
        createWindow();
        setupTextField();

        //create all of our buttons
        createOperationButtons();
        setupOperationButtons();
        createNumberButtons();

        panel = new JPanel();
        panel.setBounds(25, 100, 360, 385);
        panel.setLayout(new GridLayout(5, 4, 3, 3));
        panel.setBackground(new Color(40, 40, 40));

        //Add buttons to panel. If you have created a new button make sure to add it to this METHOD!!!!!!!
        addButtonsToPanel();

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    private void createWindow(){
        frame = new JFrame("Calculator :3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setResizable(false); //make sure the size can't be changed
        frame.getContentPane().setBackground(new Color(40, 40, 40));
    }

    private void setupTextField(){
        textField = new JTextField();
        textField.setBounds(26, 25, 356,50);
        textField.setFont(font);
        textField.setEditable(false);
        textField.setFocusable(false);
    }


    private void createOperationButtons(){
        operationButtons[0] = new Addition(this);
        operationButtons[1] = new Subtraction(this);
        operationButtons[2] = new Multiply(this);
        operationButtons[3] = new Divide(this);
        operationButtons[4] = new Decimal(this);
        operationButtons[5] = new Equals(this);
        operationButtons[6] = new Delete(this);
        operationButtons[7] = new Clear(this);
        operationButtons[8] = new Remainder(this);
        operationButtons[9] = new Root(this);
    }

    private void setupOperationButtons(){
        for (int i = 0; i < 9; ++i) {
            operationButtons[i].addActionListener(this);
        }
    }

    private void createNumberButtons(){
        for (int i = 0; i < 10; ++i) {
            numberButtons[i] = new Numbers(i); // Use NumberButton to create number buttons;
            numberButtons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){

        //when number button is pressed we input the number to the textField
        for (int i = 0; i < 10; ++i) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
    }

     // Please add your button to this method!!!!!!
    private void addButtonsToPanel() {
        //1st row of buttons
        panel.add(operationButtons[6]);
        panel.add(operationButtons[7]);
        panel.add(operationButtons[8]);
        panel.add(operationButtons[3]);

        //2nd row of buttons
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(operationButtons[0]);

        //3rd row of buttons
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(operationButtons[1]);

        //4th row of buttons
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(operationButtons[2]);

        //5th row of buttons
        panel.add(numberButtons[0]);
        panel.add(operationButtons[4]);
        panel.add(operationButtons[9]);
        panel.add(operationButtons[5]);
    }
}