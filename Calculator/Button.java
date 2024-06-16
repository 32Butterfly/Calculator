import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Button class which all specific types of buttons MUST inherit
public abstract class Button extends JButton implements ActionListener {

    protected Calculator calculator;

    public Button(String label) {
        super(label);
        setFocusable(false);
        setBorder(BorderFactory.createEmptyBorder()); //make sure all the buttons don't have an ugly border
        Font font = new Font("Arial", Font.BOLD, 20);
        setFont(font);
        setForeground(Color.WHITE);
        setBackground(new Color(30, 30, 30));

        /*Make it so whenever the mouse is on the button it changes the color to slightly lighter shade
        this provides a more interactive interface */
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                onMouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                onMouseExited(e);
            }
        });
    }

    /*These are the methods that need to be overridden in order to change to the color that suits the specific
    button since in my code different buttons have different colors so their behaviour of when mouse is
    on the button it needs to change to the lighter color of the specific button color*/
    protected void onMouseEntered(MouseEvent e) {
        // Default hover behavior
    }

    protected void onMouseExited(MouseEvent e) {
        // Default normal state behavior
    }

    //Lastly the implementation on what the button does when pressed which also needs to be overridden
    @Override
    public abstract void actionPerformed(ActionEvent e);
}
