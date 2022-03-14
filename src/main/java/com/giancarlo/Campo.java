
package com.giancarlo;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Campo extends Cuadro {
    Color naranja = new Color(248, 154, 43);
    Color naranjaFuerte = new Color(221, 100, 44);
    Color cafe = new Color(75, 54, 33);
    Color verdePasto = new Color(50, 200, 50);

    Pasto pasto;
    Sol sol;
    Nube nube;
    Casa casa;
    Planta planta;
    Arbol arbol;
    Valla valla;
    Calle calle;
    Persona persona;
    Carro carro;

    public Campo() {
        // setPreferredSize(new Dimension(800, 500));
        pasto = new Pasto();
        sol = new Sol();
        nube = new Nube();
        casa = new Casa(naranja, naranjaFuerte, cafe);
        planta = new Planta();
        arbol = new Arbol();
        valla = new Valla();
        calle = new Calle();
        persona = new Persona(100, 500, 300);
        carro = new Carro(-200, 1100, 370);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.CYAN);

        pasto.dibujarPasto(g, 0, 300, verdePasto, 1.0);

        sol.dibujarSol(g, 18, 18, Color.YELLOW, 1.0);

        for (int i = 0; i < 3; i++) {
            nube.dibujarNube(g, 50 + (250 * i), 10, Color.WHITE, 1.2);
        }

        casa.dibujarCasa(g, 100, 150, 1.0);

        for (int i = 0; i < 2; i++) {
            planta.dibujarPlanta(g, 505 + (50 * i), 300, cafe, verdePasto);
        }

        arbol.dibujarArbol(g, 685, 205, cafe, verdePasto, 1.0);

        valla.dibujarVallas(g, 0, 270, cafe, 1.0, 3);
        valla.dibujarVallas(g, 600, 270, cafe, 1.0, 6);

        calle.dibujarCalle(g, 0, 400, 1.0);

        persona.desplazar();
        carro.desplazar();

        persona.dibujarPersona(g);
        carro.dibujarCarro(g);
    }

    // public static void main(String[] args) {
    // // SwingUtilities.invokeLater(new Runnable() {
    // // public void run() {
    // JFrame frame = new JFrame();
    // Cuadro cuadro = new Cuadro();
    // frame.setTitle("Casa");
    // frame.setSize(800, 500);
    // frame.setLocationRelativeTo(null);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.add(cuadro);
    // frame.setVisible(true);
    // while (true) {
    // frame.repaint();
    // try {
    // Thread.sleep(10);
    // } catch (Exception e) {
    // System.err.println("Meh");
    // }
    // }
    // // }
    // // });
    // }
}
