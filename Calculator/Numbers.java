import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

//Numbers class aka 0-9
public class Numbers extends Button {

    public Numbers(int number) {
        super(String.valueOf(number));
        setBackground(new Color(89, 55, 50));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //there is no need for additional functionality
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