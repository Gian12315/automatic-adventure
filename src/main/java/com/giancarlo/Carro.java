package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Carro {
    int xActual;
    int y;
    int xInicial;
    int xFinal;
    Color[] colores = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.YELLOW, Color.WHITE };
    int colorActual;

    public Carro(int xInicial, int xFinal, int y) {
        this.xActual = xInicial;
        this.y = y;
        this.xInicial = xInicial;
        this.xFinal = xFinal;
        this.colorActual = (int) (Math.random() * 6);
    }

    public void desplazar() {
        if (xActual < xFinal) {
            xActual += 2;
        } else {
            xActual = xInicial;
            colorActual = (int) (Math.random() * 6);
        }
    }

    public void dibujarCarro(Graphics g) {
        Color tmp = g.getColor();

        g.setColor(colores[colorActual]);

        g.fillRect(xActual + 30, y, 80, 30);
        g.fillRect(xActual, y + 30, 150, 50);

        g.setColor(Color.BLACK);
        g.drawRect(xActual + 30, y, 80, 30);
        g.drawRect(xActual, y + 30, 150, 50);

        g.fillOval(xActual + 20, y + 70, 30, 30);
        g.fillOval(xActual + 100, y + 70, 30, 30);

        g.setColor(Color.CYAN);
        g.fillRect(xActual + 40, y + 6, 20, 20);
        g.fillRect(xActual + 65, y + 6, 35, 20);

        g.setColor(Color.BLACK);
        g.drawRect(xActual + 40, y + 6, 20, 20);
        g.drawRect(xActual + 65, y + 6, 35, 20);

        g.setColor(Color.RED);
        g.fillRect(xActual + 5, y + 31, 15, 15);
        g.setColor(Color.BLACK);
        g.drawRect(xActual + 5, y + 31, 15, 15);

        g.setColor(Color.YELLOW);
        g.fillRect(xActual + 140, y + 31, 10, 15);
        g.setColor(Color.BLACK);
        g.drawRect(xActual + 140, y + 31, 10, 15);

        g.setColor(tmp);
    }
}
