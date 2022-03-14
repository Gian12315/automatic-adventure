package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Barco {
    int x;
    int yInicial;
    int yActual;
    int yFinal;
    Color colorBarco;
    int delay;
    int contador;

    public Barco(int yInicial, int yFinal, int x, Color colorBarco, int delay) {
        this.x = x;
        this.yInicial = yInicial;
        this.yActual = yInicial;
        this.yFinal = yFinal;
        this.colorBarco = colorBarco;
        this.delay = delay;
        this.contador = 0;
    }

    public void desplazar() {
        int desplazamiento = 10 + Math.abs(yFinal - yInicial) * 2;
        if (contador > desplazamiento + delay) {
            contador = 0;
        } else if (contador > delay) {
            if (contador <= (desplazamiento / 2) + delay) {
                yActual += 1;
            } else {
                yActual -= 1;
            }
        }
        contador++;
    }

    public void dibujarBarco(Graphics g) {
        Color tmp = g.getColor();

        // Color pipas = new Color(208, 201, 0);
        Color pipas = Color.WHITE;

        g.setColor(colorBarco);
        // g.fillArc(x, y, 300, 200, 0, -180);

        int[] xPoints = { x, x + 25, x + 275, x + 300 };
        int[] yPoints = { yActual + 100, yActual + 150, yActual + 150, yActual + 100 };

        g.fillPolygon(xPoints, yPoints, 4);

        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 4);

        g.drawRect(x + 180, yActual + 60, 90, 40);
        // Cabina
        g.setColor(pipas);
        g.fillRect(x + 180, yActual + 60, 90, 40);
        for (int i = 0; i < 2; i++) {
            g.setColor(pipas);
            g.fillRect(x + 90 + (i * 40), yActual + 50 + (i * -20), 30 + (i * 15), 50 + (i * 20));
            g.setColor(Color.BLACK);
            g.drawRect(x + 90 + (i * 40), yActual + 50 + (i * -20), 30 + (i * 15), 50 + (i * 20));
        }
        for (int i = 0; i < 3; i++) {
            g.setColor(Color.CYAN);
            g.fillRect(x + 185 + (i * 30), yActual + 70, 20, 20);
            g.setColor(Color.BLACK);
            g.drawRect(x + 185 + (i * 30), yActual + 70, 20, 20);
        }

        g.setColor(Color.RED);

        xPoints = new int[] { x, x + 8, x + 292, x + 300 };
        yPoints = new int[] { yActual + 100, yActual + 115, yActual + 115, yActual + 100 };

        g.fillPolygon(xPoints, yPoints, 4);

        g.drawString("ST. CATARINA", x + 40, yActual + 135);

        // // Ventanas
        // for (int i = 0; i < 6; i++) {
        // g.setColor(Color.CYAN);
        // g.fillOval(x + 30 + (i * 40), y + 100, 20, 20);
        // g.setColor(Color.BLACK);
        // g.drawOval(x + 30 + (i * 40), y + 100, 20, 20);
        // }

        g.setColor(tmp);
    }
}
