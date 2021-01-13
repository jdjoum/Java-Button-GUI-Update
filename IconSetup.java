package q4;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Component;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Graphics;

public class IconSetup implements Icon {

    private Color myColor;
    private int mySize;

    IconSetup (int n) {
        myColor = Color.YELLOW;
        mySize = n;
    }

    public int getIconWidth() { return mySize; }

    public int getIconHeight() { return mySize; }

    public void paintIcon(Component comp, Graphics gfx, int a, int b) {
        // Defines the shape of the icon
        Rectangle2D.Double design = new Rectangle2D.Double(a,b,mySize,mySize);
        Graphics2D gfx2 = (Graphics2D) gfx;
        gfx2.setColor(myColor);
        gfx2.fill(design);
    }

    public void fillPaint(String color) {
        if (color == "RED") myColor = Color.RED;
        else if (color == "YELLOW") myColor = Color.YELLOW;
        else if (color == "BLUE") myColor = Color.BLUE;
    }
}

