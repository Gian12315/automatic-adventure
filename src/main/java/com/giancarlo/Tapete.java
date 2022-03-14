package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Tapete {

    public void dibujarTapete(Graphics g, int x, int y, Color colorPar, Color colorImpar, double escala) {
        Color tmp = g.getColor();

        for (int i = 0; i < 7; i++) {
            Color colorActual;
            if (i % 2 == 0) {
                colorActual = colorPar;
            } else {
                colorActual = colorImpar;
            }

            g.setColor(colorActual);
            g.fillRect(x, y + (10 * i), 50, 10);
        }

        g.setColor(tmp);
    }
}
