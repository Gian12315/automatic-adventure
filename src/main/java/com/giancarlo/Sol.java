package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Sol {

    public void dibujarSol(Graphics g, int x, int y, Color colorSol, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorSol);

        g.fillOval(x, y, (int) (90 * escala), (int) (90 * escala));

        g.setColor(tmp);
    }
}
