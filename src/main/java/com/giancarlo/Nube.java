package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Nube {

    public void dibujarNube(Graphics g, int x, int y, Color color, double escala) {
        Color tmp = g.getColor();
        for (int i = 0; i < 4; i++) {
            g.setColor(color);
            g.fillOval(x + (40 * i), y, (int) (65 * escala), (int) (50 * escala));
        }
        g.setColor(tmp);
    }
}
