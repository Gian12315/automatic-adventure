package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Ventana {

    public void dibujarVentana(Graphics g, int x, int y, Color colorVentana, double escala) {
        Color tmp = g.getColor();

        int ladoCuadrados = (int) (24 * escala);
        g.setColor(colorVentana);

        g.setColor(Color.CYAN);
        g.fillRect(x, y, (int) (120 * escala), (int) (120 * escala));

        g.setColor(Color.BLACK);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g.drawRect(x + (ladoCuadrados * i), y + (ladoCuadrados * j), ladoCuadrados, ladoCuadrados);
            }
        }
        g.setColor(tmp);
    }
}
