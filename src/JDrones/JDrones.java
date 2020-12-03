package JDrones;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.ArrayList;
public class JDrones extends javax.swing.JFrame {
    private DibujaDrones panel;
    private gPerformed panelG;
    private MiX x;
    private MiY y;
    private int x1=0;
    private int y1=0;
    int contDrones;
    private BufferedImage ima;
    private ArrayList<Dron> drones;
    private Grafica g;
    private int algoritmo=1;
    
    public JDrones() {
        
        this.setMinimumSize(new Dimension(800, 600));
        initComponents();
        try{                                        // PASARLO a MENU
            ima = ImageIO.read(new File("mapaCU.png"));
        }catch(IOException e){e.printStackTrace();}
        drones =new ArrayList<Dron>();
        this.contDrones=0;
        panel= new DibujaDrones(ima);
        panel.setBounds(0, 0,800,600);
        add(panel);
        limpiarAlgoritmo();
        limpiarCaso();        
    }
    
    private void limpiarAlgoritmo(){
        Mutex.setSelected(false);
        Semaforo.setSelected(false);
        vCondicion.setSelected(false);
        monitores.setSelected(false);
        Barreras.setSelected(false);   
    }
    private void limpiarCaso(){
        Dron_1.setSelected(false);
        Dron_2.setSelected(false);
        Dron_4.setSelected(false);
        Dron_6.setSelected(false);
        Dron_8.setSelected(false);   
        Dron_10.setSelected(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Dron_1 = new javax.swing.JRadioButtonMenuItem();
        Dron_2 = new javax.swing.JRadioButtonMenuItem();
        Dron_4 = new javax.swing.JRadioButtonMenuItem();
        Dron_6 = new javax.swing.JRadioButtonMenuItem();
        Dron_8 = new javax.swing.JRadioButtonMenuItem();
        Dron_10 = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Mutex = new javax.swing.JRadioButtonMenuItem();
        Semaforo = new javax.swing.JRadioButtonMenuItem();
        vCondicion = new javax.swing.JRadioButtonMenuItem();
        monitores = new javax.swing.JRadioButtonMenuItem();
        Barreras = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Graficar = new javax.swing.JRadioButtonMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Concurrente");

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Drones");

        Dron_1.setSelected(true);
        Dron_1.setText("1 Dron");
        Dron_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_1ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_1);

        Dron_2.setSelected(true);
        Dron_2.setText("2 Drones");
        Dron_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_2ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_2);

        Dron_4.setSelected(true);
        Dron_4.setText("4 Drones");
        Dron_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_4ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_4);

        Dron_6.setSelected(true);
        Dron_6.setText("6 Drones");
        Dron_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_6ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_6);

        Dron_8.setSelected(true);
        Dron_8.setText("8 Drones");
        Dron_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_8ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_8);

        Dron_10.setSelected(true);
        Dron_10.setText("10 Drones");
        Dron_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dron_10ActionPerformed(evt);
            }
        });
        jMenu2.add(Dron_10);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Sincronización");

        Mutex.setSelected(true);
        Mutex.setText("Mutex");
        Mutex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutexActionPerformed(evt);
            }
        });
        jMenu5.add(Mutex);

        Semaforo.setSelected(true);
        Semaforo.setText("Semáforo");
        Semaforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemaforoActionPerformed(evt);
            }
        });
        jMenu5.add(Semaforo);

        vCondicion.setSelected(true);
        vCondicion.setText("Variable de Condición");
        vCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vCondicionActionPerformed(evt);
            }
        });
        jMenu5.add(vCondicion);

        monitores.setSelected(true);
        monitores.setText("Monitores");
        monitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitoresActionPerformed(evt);
            }
        });
        jMenu5.add(monitores);

        Barreras.setSelected(true);
        Barreras.setText("Barreras");
        Barreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarrerasActionPerformed(evt);
            }
        });
        jMenu5.add(Barreras);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Grafica");

        Graficar.setSelected(true);
        Graficar.setText("Graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });
        jMenu6.add(Graficar);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void borrarDrones(){
        for(Dron k: drones){
                    k.kill=true;
        }
        panel.limpiarCirculo();
        drones.clear(); 
    }

    private void BarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarrerasActionPerformed
        limpiarCaso();
        limpiarAlgoritmo();
        borrarDrones();
        Barreras.setSelected(true);
        algoritmo=5;
        panel.repaint();
        panel.setDivisiones(0);
    }//GEN-LAST:event_BarrerasActionPerformed

    private void SemaforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemaforoActionPerformed
        limpiarCaso();
        limpiarAlgoritmo();
        borrarDrones();
        Semaforo.setSelected(true);
        algoritmo=2;
        panel.repaint();
        panel.setDivisiones(0);
    }//GEN-LAST:event_SemaforoActionPerformed

    private void Dron_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_1ActionPerformed
        limpiarCaso();
        Dron_1.setSelected(true);
        borrarDrones();
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,0));
        panel.setDivisiones(1);
        drones.get(0).setLimites(-2, 760, 0, 500);
        panel.CreaCirculo();
        drones.get(0).start();
        drones.get(0).algoritmo(algoritmo); 
    }//GEN-LAST:event_Dron_1ActionPerformed

    private void Dron_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_2ActionPerformed
        limpiarCaso();
        Dron_2.setSelected(true);
        borrarDrones();
            for(int i=0; i<2;i++){
                    x1 = 0;
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,i));
            }
                panel.setDivisiones(2);
                try{
                        drones.get(0).x.setX(0);
                        drones.get(0).setLimites(-2, 380, 0, 500);
                        drones.get(1).x.setX(380);
                        drones.get(1).setLimites(380, 760, 0, 500);
                        
                    for(Dron d: drones){
                        d.start();
                        d.algoritmo(algoritmo);
                        panel.CreaCirculo();
                    }

                }catch(Exception ex){ex.printStackTrace();} 
    }//GEN-LAST:event_Dron_2ActionPerformed

    private void Dron_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_4ActionPerformed
        limpiarCaso();
        Dron_4.setSelected(true);
        borrarDrones();
            for(int i=0; i<4;i++){
                    x1 = 0;
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,i));
            }
                try{
                        panel.setDivisiones(4);
                        drones.get(0).x.setX(0);
                        drones.get(0).setLimites(-2, 380, 0, 250);
                        drones.get(1).x.setX(380);
                        drones.get(1).setLimites(380, 760, 0, 250);
                        drones.get(2).x.setX(0);
                        drones.get(2).y.setY(250);
                        drones.get(2).setLimites(-2, 380, 250, 500);
                        drones.get(3).x.setX(380);
                        drones.get(3).y.setY(250);
                        drones.get(3).setLimites(380, 760, 250, 500);
                        for(Dron d: drones){
                            d.start();
                            d.algoritmo(algoritmo);
                            panel.CreaCirculo();
                        }

                }catch(Exception ex){ex.printStackTrace();} 
    }//GEN-LAST:event_Dron_4ActionPerformed

    private void Dron_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_6ActionPerformed
        limpiarCaso();
        Dron_6.setSelected(true);
        borrarDrones();
            for(int i=0; i<6;i++){
                    x1 = 0;
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,i));
            }
                try{
                    panel.setDivisiones(6);
                        drones.get(0).x.setX(0);
                        drones.get(0).setLimites(-2, 260, 0, 250);
                        drones.get(1).x.setX(260);
                        drones.get(1).setLimites(260,520, 0, 250);
                        drones.get(2).y.setY(260);
                        drones.get(2).setLimites(-2, 260, 250, 500);
                        drones.get(3).x.setX(260);
                        drones.get(3).y.setY(250);
                        drones.get(3).setLimites(260,520, 250, 500);
                        drones.get(4).x.setX(520);
                        drones.get(4).setLimites(520,780, 0, 250);
                        drones.get(5).x.setX(520);
                        drones.get(5).y.setY(250);
                        drones.get(5).setLimites(520,780, 250, 500);
                        
                        for(Dron d: drones){
                            d.start();
                            d.algoritmo(algoritmo);
                            panel.CreaCirculo();
                        }
                        
                }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_Dron_6ActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
       
    }//GEN-LAST:event_GraficarActionPerformed

    private void MutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutexActionPerformed
        limpiarCaso();
        limpiarAlgoritmo();
        borrarDrones();
        Mutex.setSelected(true);
        algoritmo=1;
        panel.repaint();
        panel.setDivisiones(0);
    }//GEN-LAST:event_MutexActionPerformed

    private void vCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vCondicionActionPerformed
        limpiarCaso();
        limpiarAlgoritmo();
        borrarDrones();
        vCondicion.setSelected(true);
        algoritmo=3;
        panel.repaint();
        panel.setDivisiones(0);
    }//GEN-LAST:event_vCondicionActionPerformed

    private void monitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitoresActionPerformed
        limpiarCaso();
        limpiarAlgoritmo();
        borrarDrones();
        monitores.setSelected(true);
        algoritmo=4;
        panel.repaint();
        panel.setDivisiones(0);
    }//GEN-LAST:event_monitoresActionPerformed

    private void Dron_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_8ActionPerformed
        limpiarCaso();
        Dron_8.setSelected(true);
        borrarDrones();
            for(int i=0; i<8;i++){
                    x1 = 0;
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,i));
            }
                try{
                        panel.setDivisiones(8);
                        drones.get(0).x.setX(0);
                        drones.get(1).x.setX(195);
                        drones.get(0).setLimites(-2, 195, 0, 250);
                        drones.get(1).setLimites(195,390, 0, 250);
                        drones.get(2).x.setX(390);
                        drones.get(2).setLimites(390,585, 0, 250); 
                        drones.get(3).x.setX(585);
                        drones.get(3).setLimites(585,780, 0, 250); 
                        drones.get(4).y.setY(250);
                        drones.get(4).setLimites(-2,195, 250, 500);
                        drones.get(5).x.setX(195);
                        drones.get(5).y.setY(250);
                        drones.get(5).setLimites(195,390, 250, 500);
                        drones.get(6).x.setX(390);
                        drones.get(6).y.setY(250);
                        drones.get(6).setLimites(390,585, 250, 500); 
                        drones.get(7).x.setX(585);
                        drones.get(7).y.setY(250);
                        drones.get(7).setLimites(585,780, 250, 500);
                    for(Dron d: drones){
                            d.start();
                            d.algoritmo(algoritmo);
                            panel.CreaCirculo();
                        }
                        
                }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_Dron_8ActionPerformed

    private void Dron_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dron_10ActionPerformed
        limpiarCaso();
        Dron_10.setSelected(true);
        borrarDrones();
            for(int i=0; i<10;i++){
                    x1 = 0;
                    x = new MiX(0);
                    y = new MiY(0);  
                drones.add(new Dron(x,y,panel,i));
            }
                try{
                        panel.setDivisiones(10);
                        drones.get(0).x.setX(0);
                        drones.get(1).x.setX(156);
                        drones.get(0).setLimites(-2, 156, 0, 250);
                        drones.get(1).setLimites(156,312, 0, 250);
                        drones.get(2).x.setX(312);
                        drones.get(2).setLimites(312,468, 0, 250); 
                        drones.get(3).x.setX(468);
                        drones.get(3).setLimites(468,624, 0, 250); 
                        drones.get(4).x.setX(624);
                        drones.get(4).setLimites(624,780, 0, 250); 
                        
                        drones.get(5).y.setY(250);
                        drones.get(5).setLimites(-2,156, 250, 500);
                        drones.get(6).x.setX(156);
                        drones.get(6).y.setY(250);
                        drones.get(6).setLimites(156,312, 250, 500);
                        drones.get(7).x.setX(312);
                        drones.get(7).y.setY(250);
                        drones.get(7).setLimites(312,468, 250, 500); 
                        drones.get(8).x.setX(468);
                        drones.get(8).y.setY(250);
                        drones.get(8).setLimites(468,624, 250, 500);
                        drones.get(9).x.setX(624);
                        drones.get(9).y.setY(250);
                        drones.get(9).setLimites(624,780, 250, 500);
                    for(Dron d: drones){
                            d.start();
                            d.algoritmo(algoritmo);
                            panel.CreaCirculo();
                        }
                        
                }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_Dron_10ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDrones().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Barreras;
    private javax.swing.JRadioButtonMenuItem Dron_1;
    private javax.swing.JRadioButtonMenuItem Dron_10;
    private javax.swing.JRadioButtonMenuItem Dron_2;
    private javax.swing.JRadioButtonMenuItem Dron_4;
    private javax.swing.JRadioButtonMenuItem Dron_6;
    private javax.swing.JRadioButtonMenuItem Dron_8;
    private javax.swing.JRadioButtonMenuItem Graficar;
    private javax.swing.JRadioButtonMenuItem Mutex;
    private javax.swing.JRadioButtonMenuItem Semaforo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem monitores;
    private javax.swing.JRadioButtonMenuItem vCondicion;
    // End of variables declaration//GEN-END:variables
}
