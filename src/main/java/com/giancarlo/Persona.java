package com.giancarlo;

import java.awt.Color;
import java.awt.Graphics;

public class Persona {
    int xActual;
    int y;
    boolean retorno;
    boolean manosRectas;
    int contador;
    int xInicial;
    int xFinal;

    public Persona(int xInicial, int xFinal, int y) {
        this.xActual = xInicial;
        this.y = y;
        this.retorno = false;
        this.contador = 20;
        this.manosRectas = true;
        this.xInicial = xInicial;
        this.xFinal = xFinal;
    }

    public void desplazar() {
        if (!retorno && xActual < xFinal) {
            xActual++;
        } else {
            retorno = true;
        }

        if (retorno && xActual > xInicial) {
            xActual--;
        } else {
            retorno = false;
        }

        if (--contador == 0) {
            contador = 20;
            manosRectas = !manosRectas;
        }

    }

    public void dibujarPersona(Graphics g) {
        Color tmp = g.getColor();

        int xOjos;
        int inicioPelo;
        Color tez = new Color(245, 200, 167);

        int[] xPointsLM;
        int[] yPointsLM;
        int[] xPointsRM;
        int[] yPointsRM;

        int[] xPointsLP;
        int[] yPointsLP;
        int[] xPointsRP;
        int[] yPointsRP;

        if (manosRectas) {

            xPointsLM = new int[] { xActual - 12, xActual + 3, xActual + 12, xActual - 3 };
            yPointsLM = new int[] { y + 33, y + 28, y + 31, y + 36 };

            xPointsRM = new int[] { xActual + 8, xActual + 23, xActual + 32, xActual + 17 };
            yPointsRM = new int[] { y + 28, y + 23, y + 26, y + 31 };

            xPointsLP = new int[] { xActual - 2, xActual + 7, xActual + 13, xActual + 7 };
            yPointsLP = new int[] { y + 63, y + 66, y + 61, y + 58 };

            xPointsRP = new int[] { xActual + 8, xActual + 17, xActual + 23, xActual + 17 };
            yPointsRP = new int[] { y + 63, y + 58, y + 61, y + 66 };

        } else {

            xPointsLM = new int[] { xActual - 12, xActual + 3, xActual + 12, xActual - 3 };
            yPointsLM = new int[] { y + 28, y + 31, y + 26, y + 23 };

            xPointsRM = new int[] { xActual + 8, xActual + 23, xActual + 32, xActual + 17 };
            yPointsRM = new int[] { y + 33, y + 36, y + 31, y + 28 };

            xPointsRP = new int[] { xActual - 2, xActual + 7, xActual + 13, xActual + 7 };
            yPointsLP = new int[] { y + 63, y + 66, y + 61, y + 58 };

            xPointsLP = new int[] { xActual + 8, xActual + 17, xActual + 23, xActual + 17 };
            yPointsRP = new int[] { y + 63, y + 58, y + 61, y + 66 };
        }

        if (retorno) {
            xOjos = xActual + 2;
            inicioPelo = 0;
        } else {
            xOjos = xActual + 11;
            inicioPelo = 40;
        }

        g.setColor(tez);
        g.fillOval(xActual, y, 20, 20);
        g.fillRect(xActual + 7, y + 18, 5, 10);

        g.setColor(Color.BLACK);
        g.fillArc(xActual, y, 20, 20, inicioPelo, 150);

        g.setColor(Color.WHITE);
        g.fillOval(xOjos, y + 5, 8, 8);
        g.setColor(Color.BLACK);
        g.fillOval(xOjos + 2, y + 7, 3, 3);

        g.setColor(tez);

        if (retorno) {
            g.fillPolygon(xPointsLM, yPointsLM, 4);
            g.setColor(Color.RED);
            g.fillRect(xActual + 4, y + 23, 10, 20);

            g.setColor(Color.CYAN);
            g.fillRect(xActual + 4, y + 43, 10, 20);
            g.setColor(tez);
            g.fillPolygon(xPointsRM, yPointsRM, 4);
        } else {
            g.fillPolygon(xPointsRM, yPointsRM, 4);
            g.setColor(Color.RED);
            g.fillRect(xActual + 4, y + 23, 10, 20);

            g.setColor(Color.CYAN);
            g.fillRect(xActual + 4, y + 43, 10, 20);
            g.setColor(tez);
            g.fillPolygon(xPointsLM, yPointsLM, 4);
        }

        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(xPointsLP, yPointsLP, 4);
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPointsRP, yPointsRP, 4);

        // int[] xPointsR = { xActual + 28, xActual + 43, xActual + 52, xActual + 37 };
        // int[] yPointsR = { y + 35, y + 38, y + 33, y + 30 };

        g.setColor(tmp);
    }
}
