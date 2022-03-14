package com.giancarlo;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.Event;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Driver extends JFrame {
    JButton[] botonesEscenario = new JButton[3];
    Cuadro[] cuadros = new Cuadro[3];
    Cuadro cuadroActual;
    JPanel panelCuadro;
    CardLayout card;

    Container content;

    public Driver() {
        setTitle("Pintor de Escenarios");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelCuadro = new JPanel();

        content = getContentPane();

        setLayout(new BorderLayout());

        cuadros[0] = new Campo();
        cuadros[1] = new Playa();
        cuadros[2] = new Bosque();
        cuadroActual = cuadros[0];

        Box botones = Box.createHorizontalBox();
        botones.add(Box.createHorizontalStrut(50));

        for (int i = 0; i < 3; i++) {
            botonesEscenario[i] = new JButton("Escenario " + i);
            botonesEscenario[i].setPreferredSize(new Dimension(260, 20));
            botonesEscenario[i].addActionListener(new CambioListener());
            botones.add(botonesEscenario[i]);
        }

        botones.add(Box.createHorizontalStrut(50));

        card = new CardLayout();
        panelCuadro.setLayout(card);
        for (int i = 0; i < 3; i++) {
            panelCuadro.add(cuadros[i], String.valueOf(i));
        }
        card.show(panelCuadro, "0");

        add(panelCuadro, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class CambioListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            for (int i = 0; i < 3; i++) {
                if (source == botonesEscenario[i]) {
                    card.show(panelCuadro, String.valueOf(i));
                    cuadroActual = cuadros[i];
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // Cuadro cuadro = new Campo();
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

        final Driver driver = new Driver();
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                driver.cuadroActual.repaint();
            }
        });
        timer.start();

        // SwingUtilities.invokeLater(new Runnable() {
        // public void run() {
        // // final Driver driver = new Driver();
        // // Timer timer = new Timer(100, new ActionListener() {
        // // public void actionPerformed(ActionEvent e) {
        // // driver.panelCuadro.repaint();
        // // }
        // // });
        // //
        // SwingWorker worker = new SwingWorker<Void, Void>() {
        // public Void doInBackground() {
        // final Driver driver = new Driver();
        // Timer timer = new Timer(100, new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // driver.panelCuadro.repaint();
        // }
        // });
        // timer.start();
        // }
        // };

        // worker.run();
        // }
        // });
    }
}
