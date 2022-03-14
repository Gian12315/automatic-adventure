package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Pasto {

    public void dibujarPasto(Graphics g, int x, int y, Color colorPasto, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorPasto);

        g.fillRect(x, y, (int) (800 * escala), (int) (200 * escala));

        g.setColor(tmp);
    }
}
