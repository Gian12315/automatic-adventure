package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Casa {
    Color primario;
    Color secundario;
    Color terciario;

    Techo techo;
    Ventana ventana;
    Puerta puerta;

    public Casa(Color primario, Color secundario, Color terciario) {
        this.primario = primario;
        this.secundario = secundario;
        this.terciario = terciario;

        this.techo = new Techo();
        this.ventana = new Ventana();
        this.puerta = new Puerta();
    }

    public void dibujarCasa(Graphics g, int x, int y, double escala) {
        Color tmp = g.getColor();

        g.setColor(primario);

        g.fillRect(x, y, (int) (500 * escala), (int) (200 * escala));

        g.setColor(Color.BLACK);
        g.drawRect(x, y, (int) (500 * escala), (int) (200 * escala));
        g.drawRect(x, y, (int) (200 * escala), (int) (200 * escala));
        g.drawRect(x * 3, y, (int) (200 * escala), (int) (200 * escala));

        techo.dibujarTecho(g, 100, 150, secundario);

        // Poner en la CASA
        g.setColor(terciario);

        g.fillRect(100, 150, 500, 5);

        ventana.dibujarVentana(g, 140, 190, Color.CYAN, 1.0);

        puerta.dibujarPuerta(g, 365, 230, terciario, 1.0);

        g.setColor(tmp);
    }
}
