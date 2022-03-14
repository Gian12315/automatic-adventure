package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

public class Agua {
    public void dibujarAgua(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        Graphics2D g2d = (Graphics2D) g;

        Color aguaInicial = new Color(0, 0, 100);
        Color aguaFinal = new Color(0, 0, 255);
        Rectangle2D agua = new Rectangle2D.Double(0, 150, 800, 150);

        g2d.setPaint(new GradientPaint(0, 150, aguaInicial, 0, 0, aguaFinal, true));
        g2d.fill(agua);

        g.setColor(tmp);
    }
}
