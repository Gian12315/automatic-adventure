package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;

public class Palmera {

    public void dibujarPalmera(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new GradientPaint(0, 0, new Color(255, 178, 102), 0, 10, new Color(255, 204, 153), true));

        for (int i = 0; i < 30; i++) {
            g.fillArc(x, y + (5 * i), 20, 15, 0, 180);
        }

        for (int i = 0; i < 5; i++) {
            // g.setColor(Color.BLACK);
            // g.drawOval(x - 35 + (6 * i), y - 75 - (25 * i), (int) ((100 - (12 * i)) *
            // escala),
            // (int) ((100 - (12 * i)) * escala));

            g.setColor(Color.GREEN);
            g.fillArc(x - 60, y + (15 * i), 80, 30, 0, 180);
            g.fillArc(x, y + (15 * i), 80, 30, 0, 180);
        }
        g.setColor(tmp);
    }
}
