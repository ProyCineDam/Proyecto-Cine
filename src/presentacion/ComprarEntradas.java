/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import gestion.Asiento;
import gestion.Disponibilidad;
import gestion.Pelicula;
import gestion.Sesion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ComprarEntradas extends javax.swing.JFrame {

    DefaultTableModel dtm1;
    Pelicula peli;
    Sesion sesionActiva=null;
    JButton[][] asiento;
    int numClicks = 0;
    // private ArrayList<Sesion> listaSesiones;

    /**
     * Creates new form ComprarEntradas
     */
    public ComprarEntradas() {

        initComponents();

        dtm1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaSesiones.setModel(dtm1);
        dtm1.addColumn("Nº Sala ");
        dtm1.addColumn("Sesión");
        dtm1.addColumn("HORA");
        dtm1.addColumn("FECHA");
        dtm1.addColumn("Precio");

        //setLocationRelativeTo(null);
        setResizable(false);
        ((JPanel) getContentPane()).setOpaque(fal­se);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/recursos/comprarEntra.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), u­no.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSesiones = new javax.swing.JTable();
        panelAsientos = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sesiones De Pelicula");

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Asientos");

        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Seleccionar.png"))); // NOI18N
        Seleccionar.setContentAreaFilled(false);
        Seleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/SeleccionarAma.png"))); // NOI18N
        Seleccionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Seleccionarlinea.png"))); // NOI18N
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Compra De Entradas");

        Comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/comprar.png"))); // NOI18N
        Comprar.setContentAreaFilled(false);
        Comprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/comprarrer.png"))); // NOI18N
        Comprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/comprarrer.png"))); // NOI18N
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        tablaSesiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSesiones.setFocusable(false);
        jScrollPane3.setViewportView(tablaSesiones);
        if (tablaSesiones.getColumnModel().getColumnCount() > 0) {
            tablaSesiones.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelAsientosLayout = new javax.swing.GroupLayout(panelAsientos);
        panelAsientos.setLayout(panelAsientosLayout);
        panelAsientosLayout.setHorizontalGroup(
            panelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        panelAsientosLayout.setVerticalGroup(
            panelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panelAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(panelAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(100, 0, 752, 633);
    }// </editor-fold>//GEN-END:initComponents

    public void cogerPelicula(Pelicula p) {
        this.peli = p;
    }

    void llenarTablaSesiones(ArrayList<Sesion> ls) {

        for (int i = 0; i < ls.size(); i++) {
            Sesion sesion = ls.get(i);
            Object[] datos = {sesion.getSala().getNumSala(), sesion.getNomSesion(), sesion.getHora(), sesion.getFecha(), sesion.getPrecio()};
            dtm1.addRow(datos);
            tablaSesiones.setModel(dtm1);
        }
    }

    public void borrarTablaSesion() {

        while (0 < dtm1.getRowCount()) {
            dtm1.removeRow(0);
        }
    }

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        int row = tablaSesiones.getSelectedRow();
        String nSesio = (tablaSesiones.getValueAt(row, 1).toString());
        Disponibilidad disponible;
        Sesion sesionActiva = gestion.Pelicula.buscaSesion(nSesio);
        int k, l;
        int filas = sesionActiva.getSala().getFilas();
        int columnas = sesionActiva.getSala().getColumnas();

        this.panelAsientos.removeAll();
        this.panelAsientos.setLayout(new java.awt.GridLayout(filas, columnas));
        this.asiento = new JButton[filas][columnas];
        int cont = 0;
        for (int i = 0; i < this.asiento.length; i++) {
            for (int j = 0; j < this.asiento[i].length; j++) {
                k = i + 1;
                l = j + 1;
                asiento[i][j] = new JButton(k + "-" + l);
                if (sesionActiva.asientos.get(cont).getDispo().equals(Disponibilidad.LIBRE)) {
                    asiento[i][j].setBackground(Color.GREEN);
                } else {
                    asiento[i][j].setBackground(Color.RED);
                }
                this.panelAsientos.add(asiento[i][j]);
                cont++;
            }
        }
        this.panelAsientos.updateUI();
    }//GEN-LAST:event_SeleccionarActionPerformed

    public void cargarAsientos() {
        int row = tablaSesiones.getSelectedRow();
        String nSesio = (tablaSesiones.getValueAt(row, 1).toString());
        Disponibilidad disponible;
        Sesion sesionActiva = gestion.Pelicula.buscaSesion(nSesio);
        int iAux, jAux;
        int filas = sesionActiva.getSala().getFilas();
        int columnas = sesionActiva.getSala().getColumnas();
        int cont = 0;
        
        this.panelAsientos.removeAll();
        this.panelAsientos.setLayout(new java.awt.GridLayout(filas, columnas));
        this.asiento = new JButton[filas][columnas];

        for (int i = 0; i < this.asiento.length; i++) {
            for (int j = 0; j < this.asiento[i].length; j++) {
                iAux = i + 1;
                jAux = j + 1;
                asiento[i][j] = new JButton(iAux + "-" + jAux);
                if (sesionActiva.asientos.get(cont).getDispo().equals(Disponibilidad.LIBRE)) {
                    asiento[i][j].setBackground(Color.GREEN);
                } else {
                    asiento[i][j].setBackground(Color.RED);
                }
                asiento[i][j].addActionListener(this);
                this.panelAsientos.add(asiento[i][j]);
                cont++;
            }
        }
        this.panelAsientos.updateUI();

    }
    
    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        deReservadosAOcupados();
        JOptionPane.showMessageDialog(this, "Asientos reservados ");
        cargarAsientos();
    }//GEN-LAST:event_ComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarEntradas().setVisible(true);
            }
        });
    }

    public void deReservadosAOcupados() {
        int row = tablaSesiones.getSelectedRow();
        String nSesio = (tablaSesiones.getValueAt(row, 1).toString());

        Sesion sesion = gestion.Pelicula.buscaSesion(nSesio);
        for (Asiento a : sesion.asientos) {
            if (a.getDispo().equals(Disponibilidad.RESERVADO)) {
                a.setDispo(Disponibilidad.OCUPADO);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        int row = tablaSesiones.getSelectedRow();
        String nSesio = (tablaSesiones.getValueAt(row, 1).toString());
        Disponibilidad disponible;
        Sesion sesionActiva = gestion.Pelicula.buscaSesion(nSesio);
        int filas = sesionActiva.getSala().getFilas();
        int columnas = sesionActiva.getSala().getColumnas();
        this.asiento = new JButton[filas][columnas];

        numClicks++;
        String[] textoBotonPulsado = e.getActionCommand().split("-");//necesitamos el texto del boton pulsado para poder trabajar con ese asiento
        int fila = Integer.parseInt(textoBotonPulsado[0]);
        int columna = Integer.parseInt(textoBotonPulsado[1]);
        fila--;//a la inversa e cuando metimos el texto que le sumamos 1 para eliminar el 0
        columna--;
        //reservamos
        try {
            sesionActiva.crearReserva(fila, columna);
            this.asiento[fila][columna].setBackground(Color.ORANGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelAsientos;
    private javax.swing.JTable tablaSesiones;
    // End of variables declaration//GEN-END:variables
}
