package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Techo {

    public void dibujarTecho(Graphics g, int x, int y, Color colorTecho) {
        Color tmp = g.getColor();

        g.setColor(colorTecho);

        // x = 100, y = 150

        for (int i = 0; i < 2; i++) {
            int[] xPoints = { x + 125 + (150 * i), x + 200 + (150 * i), x + 275 + (150 * i) };
            int[] yPoints = { y - 65, y, y - 65 };
            g.fillPolygon(xPoints, yPoints, 3);
        }

        int[] xPuntosTrianguloGrande = { x, x + 100, x + 200 };
        int[] yPuntosTrianguloGrande = { y, y - 100, y };
        g.fillPolygon(xPuntosTrianguloGrande, yPuntosTrianguloGrande, 3);
        g.setColor(Color.BLACK);
        g.drawPolyline(xPuntosTrianguloGrande, yPuntosTrianguloGrande, 3);

        for (int i = 0; i < 2; i++) {
            int[] xPuntos = { x + 200 + (150 * i), x + 275 + (150 * i), x + 350 + (150 * i) };
            int[] yPuntos = { y, y - 65, y };
            g.setColor(colorTecho);
            g.fillPolygon(xPuntos, yPuntos, 3);
            g.setColor(Color.BLACK);
            g.drawPolyline(xPuntos, yPuntos, 3);
        }

        g.setColor(tmp);
    }
}
