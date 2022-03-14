package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Luna {

    public void dibujarLuna(Graphics g, int x, int y, Color colorLuna, Color fondoLuna, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorLuna);
        g.fillOval(x, y, (int) (90 * escala), (int) (90 * escala));
        g.setColor(fondoLuna);
        g.fillOval(x + 20, y, (int) (90 * escala), (int) (90 * escala));

        g.setColor(tmp);
    }
}
