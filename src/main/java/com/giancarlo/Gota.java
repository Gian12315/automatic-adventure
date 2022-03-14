
package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Gota {
    int x;
    int yInicial;
    int yActual;
    int yFinal;

    public Gota(int yInicial, int yFinal, int x) {
        this.x = x;
        this.yInicial = yInicial;
        this.yActual = yInicial;
        this.yFinal = yFinal;
    }

    public void desplazar() {
        if (yActual < yFinal) {
            yActual += 3;
        } else {
            yActual = yInicial;
            x = (int) (Math.random() * 800);
        }
    }

    public void dibujarGota(Graphics g, Color colorGota, double escala) {
        Color tmp = g.getColor();

        g.setColor(colorGota);
        g.fillOval(x, yActual, (int) (5 * escala), (int) (5 * escala));

        g.setColor(tmp);
    }
}
