package q4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Button {

    public static JButton createButton(final int index, final JLabel label, final IconSetup icon) {
        final String[] colors = new String[]{"RED", "YELLOW", "BLUE"};
        // Create a button for each color option
        JButton button = new JButton(colors[index]);
        // Define what happens when a button is clicked
        button.addActionListener(event -> {
            // Find the color of the button pressed
            icon.fillPaint(colors[index]);
            // Repaints the rectangle with that color
            label.repaint();
        });
        return button;
    }

    public static void main(String args[]) {
        // Creating myFrame
        JFrame myFrame = new JFrame();
        // Setting the layout of myFrame
        myFrame.setLayout(new FlowLayout());

        // Creating a button for each color, and making a list of them
        JButton red = new JButton();
        JButton yellow = new JButton();
        JButton blue = new JButton();
        JButton colorList[] = {red, yellow, blue};

        // Creates the panel that will hold the icon and the buttons
        JPanel myPanel = new JPanel();
        // Sets up the icon and initializes its size
        IconSetup myIcon = new IconSetup(100);
        JLabel myLabel = new JLabel(myIcon);
        // Displaying myIcon in myPanel
        myPanel.add(myLabel);

        // Displaying a button for each color into myPanel
        for(int i = 0; i < 3; i++) {
            colorList[i] = createButton(i, myLabel, myIcon);
            myPanel.add(colorList[i]);
        }

        // Add the custom myPanel to the frame
        myFrame.add(myPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setLayout(new FlowLayout());
    }
}
