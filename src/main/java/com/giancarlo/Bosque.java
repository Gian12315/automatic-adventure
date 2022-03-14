package com.giancarlo;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Bosque extends Cuadro {
    Color cielo = new Color(25, 28, 50);
    Color colorNube = new Color(71, 71, 107);
    Color cafe = new Color(75, 54, 33);
    Color verdePasto = new Color(50, 200, 50);

    Pasto pasto;
    Agua agua;
    Olas olas;
    Luna luna;
    Lluvia[] lluvia;
    Pozo pozo;
    Nube nube;
    Casa casa;
    Calle calle;
    Planta planta;
    Arbol arbol;
    Carro carro;

    public Bosque() {
        // setPreferredSize(new Dimension(800, 500));
        pasto = new Pasto();
        agua = new Agua();
        // olas = new Olas(-400, 1000, 120, 20);
        olas = new Olas(120, 290, 0, 40);
        luna = new Luna();
        lluvia = new Lluvia[5];
        for (int i = 0; i < lluvia.length; i++) {
            lluvia[i] = new Lluvia(10 + (i * 20));
        }
        pozo = new Pozo();
        nube = new Nube();
        calle = new Calle();
        arbol = new Arbol();
        carro = new Carro(-300, 1200, 370);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(cielo);

        pasto.dibujarPasto(g, 0, 200, new Color(50, 200, 50), 1.5);

        // agua.dibujarAgua(g, 0, 300, 1.0);

        for (int i = 0; i < lluvia.length; i++) {
            lluvia[i].dibujarLluvia(g, Color.WHITE, 1.0);
        }

        luna.dibujarLuna(g, 700, 18, Color.WHITE, cielo, 1.0);

        for (int i = 0; i < 3; i++) {
            nube.dibujarNube(g, 50 + (250 * i), 10, colorNube, 1.2);
        }

        for (int i = 0; i < 7; i++) {
            arbol.dibujarArbol(g, 20 + (i * 120), 200, cafe, verdePasto, 1.0);
        }

        pozo.dibujarPozo(g, 350, 320, 1.0);

        calle.dibujarCalle(g, 0, 400, 1.0);

        carro.dibujarCarro(g);
        carro.desplazar();

    }
}
