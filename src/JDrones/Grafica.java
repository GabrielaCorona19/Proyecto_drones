/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDrones;

import java.util.ArrayList;

/**
 *
 * @author Corona
 */
public class Grafica extends javax.swing.JFrame {
    private gPerformed panelG;
    private MiX x;
    private MiY y;
    private int x1=0;
    private int y1=0;
    int contDrones;
    private ArrayList<Dron> drones;
    Grafica(){
        
    }
    public Grafica(ArrayList<Dron> drones) {
        drones =new ArrayList<Dron>();
        this.contDrones=0;
        panelG= new gPerformed();
        panelG.setBounds(800,0,700,700);
        add(panelG);
        //panelG.actualizar(drones.get(1).datosX,drones.get(1).datosY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
