package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

public class Arena {
    Ellipse2D[][] piedras = new Ellipse2D[8][10];

    public Arena() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                piedras[i][j] = new Ellipse2D.Double((int) (Math.random() * 800),
                        300 + (25 * i) + (int) (Math.random() * 25), 3, 3);
            }
        }
    }

    public void dibujarArena(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        Graphics2D g2d = (Graphics2D) g;

        Color arenaInicial = new Color(255, 255, 0);
        Color arenaFinal = new Color(245, 245, 0);
        Rectangle2D arena = new Rectangle2D.Double(x, y, (int) (800 * escala), (int) (200 * escala));

        g2d.setPaint(new GradientPaint(0, 10, arenaInicial, 8, 0, arenaFinal, true));
        g2d.fill(arena);

        g2d.setPaint(Color.BLACK);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                g2d.fill(piedras[i][j]);
            }
        }

        g.setColor(tmp);
    }
}
