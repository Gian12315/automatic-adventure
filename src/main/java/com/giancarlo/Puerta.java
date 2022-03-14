package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Puerta {

    public void dibujarPuerta(Graphics g, int x, int y, Color colorPuerta, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorPuerta);

        g.fillRect(x, y, (int) (75 * escala), (int) (120 * escala));

        g.setColor(Color.YELLOW);
        g.fillOval(x + 10, y + 55, (int) (10 * escala), (int) (10 * escala));

        g.setColor(Color.CYAN);
        g.fillArc(x + 10, y + 15, (int) (50 * escala), (int) (50 * escala), 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(x + 10, y + 15, (int) (50 * escala), (int) (50 * escala), 0, 180);

        // g.setColor(Color.RED);
        // g.fillRect(355, 352, 95, 30);

        g.setColor(tmp);
    }
}
