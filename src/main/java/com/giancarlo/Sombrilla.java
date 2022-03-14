package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

public class Sombrilla {
    public void dibujarSombrilla(Graphics g, int x, int y, Color principal, Color secundario, double escala) {
        Color tmp = g.getColor();

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new Color(112, 79, 56));

        g2d.fillRect(x + 70, y, (int) (10 * escala), (int) (120 * escala));

        Arc2D sombrilla = new Arc2D.Double(x, y, (int) (150 * escala), (int) (60 * escala), 0, 180, Arc2D.OPEN);

        g2d.setPaint(new GradientPaint(0, 0, principal, 0, 5, secundario, true));
        g2d.fill(sombrilla);

        g.setColor(tmp);
    }
}
