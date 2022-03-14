package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Calle {

    public void dibujarCalle(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        // Calle

        g.setColor(Color.BLACK);
        g.fillRect(x, y, (int) (800 * escala), (int) (100 * escala));

        g.setColor(Color.YELLOW);
        for (int i = 0; i < 7; i++) {
            g.fillRect(x + 10 + (120 * i), y + 40, (int) (100 * escala), (int) (25 * escala));
        }

        // Banqueta

        g.setColor(Color.GRAY);
        g.fillRect(x, y, (int) (800 * escala), (int) (25 * escala));
        g.fillRect(x, y + 75, (int) (800 * escala), (int) (25 * escala));
        g.setColor(Color.BLACK);

        for (int i = 0; i < 7; i++) {
            g.drawRect(x + (120 * i), y, (int) (120 * escala), (int) (25 * escala));
            g.drawRect(x + (120 * i), y + 75, (int) (120 * escala), (int) (25 * escala));
        }
        g.setColor(tmp);
    }
}
