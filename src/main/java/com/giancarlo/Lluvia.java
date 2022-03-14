package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;

public class Lluvia {
    Gota[] gotas;

    public Lluvia(int y) {
        gotas = new Gota[50];
        for (int i = 0; i < gotas.length; i++) {
            Gota gota = new Gota(y + ((int) (Math.random() * 20)), 500, (int) (Math.random() * 800));
            gotas[i] = gota;
        }
    }

    public void dibujarLluvia(Graphics g, Color colorGota, double escala) {
        Color tmp = g.getColor();

        for (int i = 0; i < gotas.length; i++) {
            gotas[i].dibujarGota(g, colorGota, 1.0);
            gotas[i].desplazar();
        }

        // g.fillRect(x, y, (int) (800 * escala), (int) (200 * escala));

        g.setColor(tmp);
    }
}
