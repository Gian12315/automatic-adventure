package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

public class Olas {
    int x;
    int yInicial;
    int yActual;
    int yFinal;
    int numOlas;

    public Olas(int yInicial, int yFinal, int x, int numOlas) {
        this.yInicial = yInicial;
        this.yActual = yInicial;
        this.yFinal = yFinal;
        this.x = x;
        this.numOlas = numOlas;
    }

    public void desplazar() {
        if (yActual < yFinal) {
            yActual++;
        } else {
            yActual = yInicial;
        }
    }

    public void dibujarOlas(Graphics g) {
        Color tmp = g.getColor();

        Graphics2D g2d = (Graphics2D) g;

        Color olaInicial = new Color(0, 0, 255);
        Color olaFinal = Color.WHITE;

        g2d.setPaint(new GradientPaint(0, 0, olaInicial, 0, 20, olaFinal, true));
        for (int i = 0; i < numOlas; i++) {
            g2d.fillRect(x + (20 * i), yActual, 20, 20);
        }

        g.setColor(tmp);
    }
}

// package com.giancarlo;

// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.*;
// import java.awt.geom.*;

// public class Olas {
// int xInicial;
// int xActual;
// int xFinal;
// int y;
// int numOlas;

// public Olas(int xInicial, int xFinal, int y, int numOlas) {
// this.xInicial = xInicial;
// this.xActual = xInicial;
// this.xFinal = xFinal;
// this.y = y;
// this.numOlas = numOlas;
// }

// public void desplazar() {
// if (xActual < xFinal) {
// xActual++;
// } else {
// xActual = xInicial;
// }
// }

// public void dibujarOlas(Graphics g) {
// Color tmp = g.getColor();

// Graphics2D g2d = (Graphics2D) g;

// Color olaInicial = new Color(0, 0, 255);
// Color olaFinal = Color.WHITE;

// g2d.setPaint(new GradientPaint(0, 0, olaInicial, 30, 10, olaFinal, true));
// for (int i = 0; i < numOlas; i++) {
// int[] xPoints = { xActual - 30 + (20 * i), xActual + (20 * i), xActual + (20
// * i) };
// int[] yPoints = { y + 30, y, y + 30 };
// g2d.fillPolygon(xPoints, yPoints, 3);
// }

// g.setColor(tmp);
// }
// }
