package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Arbol {

    public void dibujarArbol(Graphics g, int x, int y, Color colorTronco, Color colorHojas, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorTronco);
        g.fillRect(x, y, (int) (30 * escala), (int) (100 * escala));

        for (int i = 0; i < 5; i++) {
            g.setColor(Color.BLACK);
            g.drawOval(x - 35 + (6 * i), y - 75 - (25 * i), (int) ((100 - (12 * i)) * escala),
                    (int) ((100 - (12 * i)) * escala));

            g.setColor(colorHojas);
            g.fillOval(x - 35 + (6 * i), y - 75 - (25 * i), (int) ((100 - (12 * i)) * escala),
                    (int) ((100 - (12 * i)) * escala));
        }
        g.setColor(tmp);
    }
}
