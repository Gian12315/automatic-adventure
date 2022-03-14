
package com.giancarlo;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Playa extends Cuadro {
    Arena arena;
    Agua agua;
    Olas olas;
    Sol sol;
    Nube nube;
    Barco barco;
    Planta planta;
    Palmera palmera;
    Sombrilla sombrilla;
    Tapete tapete;
    Persona persona1;
    Persona persona2;

    public Playa() {
        arena = new Arena();
        agua = new Agua();
        olas = new Olas(120, 290, 0, 40);
        sol = new Sol();
        nube = new Nube();
        barco = new Barco(100, 80, 200, Color.WHITE, 120);
        planta = new Planta();
        palmera = new Palmera();
        sombrilla = new Sombrilla();
        tapete = new Tapete();
        persona1 = new Persona(100, 700, 300);
        persona2 = new Persona(150, 750, 300);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.CYAN);

        arena.dibujarArena(g, 0, 300, 1.0);

        agua.dibujarAgua(g, 0, 300, 1.0);

        olas.dibujarOlas(g);
        olas.desplazar();

        sol.dibujarSol(g, 700, 18, Color.YELLOW, 1.0);

        for (int i = 0; i < 3; i++) {
            nube.dibujarNube(g, 50 + (250 * i), 10, Color.WHITE, 1.2);
        }

        barco.dibujarBarco(g);
        barco.desplazar();

        persona1.desplazar();
        persona1.dibujarPersona(g);

        persona2.desplazar();
        persona2.dibujarPersona(g);

        palmera.dibujarPalmera(g, 60, 300, 1.0);
        palmera.dibujarPalmera(g, 110, 300, 1.0);
        palmera.dibujarPalmera(g, 160, 300, 1.0);
        palmera.dibujarPalmera(g, 210, 300, 1.0);
        palmera.dibujarPalmera(g, 590, 300, 1.0);
        palmera.dibujarPalmera(g, 640, 300, 1.0);
        palmera.dibujarPalmera(g, 690, 300, 1.0);
        palmera.dibujarPalmera(g, 730, 300, 1.0);

        sombrilla.dibujarSombrilla(g, 320, 320, Color.WHITE, Color.LIGHT_GRAY, 1.0);
        tapete.dibujarTapete(g, 300, 370, Color.RED, Color.BLUE, 1.4);
        tapete.dibujarTapete(g, 430, 370, Color.GREEN, Color.RED, 1.4);

        // sol.dibujarSol(g, 18, 18, Color.YELLOW, 1.0);

        // for (int i = 0; i < 3; i++) {
        // nube.dibujarNube(g, 50 + (250 * i), 10, Color.WHITE, 1.2);
        // }

        // // casa.dibujarCasa(g, 100, 150, 1.0);

        // for (int i = 0; i < 2; i++) {
        // planta.dibujarPlanta(g, 505 + (50 * i), 300, cafe, verdePasto);
        // }

        // arbol.dibujarArbol(g, 685, 205, cafe, verdePasto, 1.0);

        // valla.dibujarVallas(g, 0, 270, cafe, 1.0, 3);
        // valla.dibujarVallas(g, 600, 270, cafe, 1.0, 6);

        // calle.dibujarCalle(g, 0, 400, 1.0);

        // persona.desplazar();
        // carro.desplazar();

        // persona.dibujarPersona(g);
        // carro.dibujarCarro(g);
    }
}
