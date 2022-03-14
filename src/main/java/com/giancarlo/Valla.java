package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Valla {

    public void dibujarVallas(Graphics g, int x, int y, Color color, double escala, int numero) {
        Color tmp = g.getColor();
        g.setColor(color);
        for (int i = 0; i < numero; i++) {
            g.fillRect(x + (35 * i), y, (int) (30 * escala), (int) (80 * escala));

            if (i != 0) {
                g.fillRect(x + (35 * i) - 5, y + 20, (int) (5 * escala), (int) (10 * escala));
                g.fillRect(x + (35 * i) - 5, y + 50, (int) (5 * escala), (int) (10 * escala));
            }
        }
        g.setColor(tmp);
    }
}
