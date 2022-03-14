package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Pozo {

    public void dibujarPozo(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        g.setColor(new Color(82, 49, 26));
        g.fillRect(x - 30, y - 75, 15, 120);
        g.fillRect(x + 135, y - 75, 15, 120);

        g.fillRect(x - 30, y - 75, 165, 15);

        g.setColor(new Color(112, 79, 56));

        for (int i = 0; i < 3; i++) {
            g.fillRect(x + 47 + (10 * i), y - 75, 5, 15);
        }

        g.fillRect(x + 57, y - 65, 5, 20);

        g.fillPolygon(new int[] { x + 34, x + 49, x + 69, x + 84 }, new int[] { y - 35, y - 5, y - 5, y - 35 }, 4);

        g.setColor(Color.BLACK);
        g.drawArc(x + 34, y - 50, 50, 30, 0, 180);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(x + (30 * i), y + (15 * j), 30, 15);
                g.setColor(Color.BLACK);
                g.drawRect(x + (30 * i), y + (15 * j), 30, 15);
            }
        }

        g.setColor(tmp);
    }
}
