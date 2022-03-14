package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Planta {

    public void dibujarPlanta(Graphics g, int x, int y, Color colorMaceta, Color planta) {
        Color tmp = g.getColor();
        for (int i = 0; i < 5; i++) {
            g.setColor(Color.BLACK);
            g.drawOval(x + (2 * i), y - (15 * i), 40 - (4 * i), 40 - (4 * i));

            g.setColor(planta);
            g.fillOval(x + (2 * i), y - (15 * i), 40 - (4 * i), 40 - (4 * i));
        }

        int[] xPuntos = { x, x + 10, x + 30, x + 40 };
        int[] yPuntos = { y + 35, y + 55, y + 55, y + 35 };

        g.setColor(Color.BLACK);
        g.drawPolyline(xPuntos, yPuntos, 4);
        g.setColor(colorMaceta);
        g.fillPolygon(xPuntos, yPuntos, 4);
        g.setColor(tmp);
    }
}
