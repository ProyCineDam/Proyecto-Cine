/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author usuario
 */
public class CineInterface extends javax.swing.JFrame {

    /**
     * Creates new form Cine
     */
    public CineInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cine = new javax.swing.JMenu();
        CrearCine = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Añadirsala = new javax.swing.JMenuItem();
        ModificarSala = new javax.swing.JMenuItem();
        BorrarSala = new javax.swing.JMenuItem();
        listadoDeSalas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AñadirSesion = new javax.swing.JMenuItem();
        ModificarSesiones = new javax.swing.JMenuItem();
        BorrarSesiones = new javax.swing.JMenuItem();
        listaSesiones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AñadirPelicula = new javax.swing.JMenuItem();
        modificarPelicula = new javax.swing.JMenuItem();
        borrarPelicula = new javax.swing.JMenuItem();
        Listado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        importar = new javax.swing.JMenuItem();
        exportar = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        Cine.setText("Cine");

        CrearCine.setText("Crear Cine");
        CrearCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCineActionPerformed(evt);
            }
        });
        Cine.add(CrearCine);

        jMenuBar1.add(Cine);

        jMenu1.setText("Sala");

        Añadirsala.setText("Añadir sala");
        Añadirsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirsalaActionPerformed(evt);
            }
        });
        jMenu1.add(Añadirsala);

        ModificarSala.setText("Modificar Sala");
        ModificarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSalaActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarSala);

        BorrarSala.setText("Borrar Sala");
        BorrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarSalaActionPerformed(evt);
            }
        });
        jMenu1.add(BorrarSala);

        listadoDeSalas.setText("Listado de Salas");
        listadoDeSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoDeSalasActionPerformed(evt);
            }
        });
        jMenu1.add(listadoDeSalas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sesiones");

        AñadirSesion.setText("Añadir sesiones");
        AñadirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirSesionActionPerformed(evt);
            }
        });
        jMenu2.add(AñadirSesion);

        ModificarSesiones.setText("Modificar sesiones");
        ModificarSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSesionesActionPerformed(evt);
            }
        });
        jMenu2.add(ModificarSesiones);

        BorrarSesiones.setText("Borrar sesiones");
        BorrarSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarSesionesActionPerformed(evt);
            }
        });
        jMenu2.add(BorrarSesiones);

        listaSesiones.setText("Lista Sesiones");
        listaSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSesionesActionPerformed(evt);
            }
        });
        jMenu2.add(listaSesiones);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Peliculas");

        AñadirPelicula.setText("Añadir Pelicula");
        AñadirPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirPeliculaActionPerformed(evt);
            }
        });
        jMenu4.add(AñadirPelicula);

        modificarPelicula.setText("Modificar Pelicula");
        modificarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPeliculaActionPerformed(evt);
            }
        });
        jMenu4.add(modificarPelicula);

        borrarPelicula.setText("Borrar Pelicula");
        borrarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPeliculaActionPerformed(evt);
            }
        });
        jMenu4.add(borrarPelicula);

        Listado.setText("Listado De Peliculas");
        Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoActionPerformed(evt);
            }
        });
        jMenu4.add(Listado);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ficheros");

        importar.setText("Importar");
        jMenu5.add(importar);

        exportar.setText("Exportar");
        jMenu5.add(exportar);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSesionesActionPerformed
        presentacion.ModificarSesion modificarSesion = new presentacion.ModificarSesion();
        modificarSesion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ModificarSesionesActionPerformed

    private void AñadirsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirsalaActionPerformed
        presentacion.AñadirSala altaSala = new presentacion.AñadirSala();
        altaSala.setVisible(true);// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_AñadirsalaActionPerformed

    private void ModificarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSalaActionPerformed
        presentacion.ModificarSala modificarSala = new presentacion.ModificarSala();
        modificarSala.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ModificarSalaActionPerformed

    private void BorrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarSalaActionPerformed
        presentacion.BorrarSala borrarSala = new presentacion.BorrarSala();
        borrarSala.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_BorrarSalaActionPerformed

    private void AñadirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirSesionActionPerformed
        presentacion.AñadirSesion altaSesion = new presentacion.AñadirSesion();
        altaSesion.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_AñadirSesionActionPerformed

    private void BorrarSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarSesionesActionPerformed
        presentacion.BorrarSesion borrarSesion = new presentacion.BorrarSesion();
        borrarSesion.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_BorrarSesionesActionPerformed

    private void AñadirPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirPeliculaActionPerformed
        presentacion.AñadirPelicula altaPelicula = new presentacion.AñadirPelicula();
        altaPelicula.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_AñadirPeliculaActionPerformed

    private void modificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPeliculaActionPerformed
        presentacion.ModificarPelicula modificarPelicula = new presentacion.ModificarPelicula();
        modificarPelicula.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_modificarPeliculaActionPerformed

    private void borrarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPeliculaActionPerformed
        presentacion.BorrarPelicula borrarPelicula = new presentacion.BorrarPelicula();
        borrarPelicula.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_borrarPeliculaActionPerformed

    private void CrearCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCineActionPerformed
        presentacion.CrearCine cine = new presentacion.CrearCine();
        cine.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_CrearCineActionPerformed

    private void ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoActionPerformed
        presentacion.ListadoDePeliculas lista = new presentacion.ListadoDePeliculas();
        lista.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_ListadoActionPerformed

    private void listadoDeSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoDeSalasActionPerformed
        ListadoDeSalas lista = new presentacion.ListadoDeSalas();
        lista.setVisible(true);
    }//GEN-LAST:event_listadoDeSalasActionPerformed

    private void listaSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSesionesActionPerformed
         ListadoDeSesiones lista = new presentacion.ListadoDeSesiones();
        lista.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_listaSesionesActionPerformed

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
            java.util.logging.Logger.getLogger(CineInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CineInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CineInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CineInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CineInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AñadirPelicula;
    private javax.swing.JMenuItem AñadirSesion;
    private javax.swing.JMenuItem Añadirsala;
    private javax.swing.JMenuItem BorrarSala;
    private javax.swing.JMenuItem BorrarSesiones;
    private javax.swing.JMenu Cine;
    private javax.swing.JMenuItem CrearCine;
    private javax.swing.JMenuItem Listado;
    private javax.swing.JMenuItem ModificarSala;
    private javax.swing.JMenuItem ModificarSesiones;
    private javax.swing.JMenuItem borrarPelicula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem exportar;
    private javax.swing.JMenuItem importar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem listaSesiones;
    private javax.swing.JMenuItem listadoDeSalas;
    private javax.swing.JMenuItem modificarPelicula;
    // End of variables declaration//GEN-END:variables
}
