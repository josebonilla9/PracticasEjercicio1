package PaquetePrueba;

import java.awt.Dimension;
import java.util.ArrayList;

public class NewJFrame extends javax.swing.JFrame {
    
    String root = "src/images/logoAmazon.jpg";
    
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        fieldDimensiones.setVisible(false);
        botonAceptar.setVisible(false);
        labelimgDim.setVisible (false);
        panelRoot.setVisible(false);
        trueFalse.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelimgDim = new javax.swing.JLabel();
        boton1 = new javax.swing.JRadioButton();
        boton2 = new javax.swing.JRadioButton();
        boton3 = new javax.swing.JRadioButton();
        trueFalse = new javax.swing.JToggleButton();
        fieldDimensiones = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JLabel();
        panelRoot = new javax.swing.JPanel();
        fieldRoot = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        fieldCantidad = new javax.swing.JTextField();
        fieldTipoDeArchivo = new javax.swing.JTextField();
        botonAceptarRoot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelimgDim.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        labelimgDim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelimgDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 490, 470));

        grupoDeBotones.add(boton1);
        boton1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        boton1.setText("setImageLabel");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        grupoDeBotones.add(boton2);
        boton2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        boton2.setText("setImageLabelDimension");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        grupoDeBotones.add(boton3);
        boton3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        boton3.setText("rootMessage");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        trueFalse.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        trueFalse.setText("False");
        trueFalse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trueFalseMouseClicked(evt);
            }
        });
        trueFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueFalseActionPerformed(evt);
            }
        });
        jPanel1.add(trueFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        fieldDimensiones.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldDimensiones.setText("Dimensiones. Ej:120x100");
        fieldDimensiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldDimensionesMouseClicked(evt);
            }
        });
        jPanel1.add(fieldDimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 170, 30));

        botonAceptar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        botonAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAceptar.setText("Aceptar");
        botonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 70, 30));

        panelRoot.setBackground(new java.awt.Color(255, 255, 255));

        fieldRoot.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldRoot.setText("Root");
        fieldRoot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldRootMouseClicked(evt);
            }
        });

        fieldNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldNombre.setText("Nombre");
        fieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNombreMouseClicked(evt);
            }
        });

        fieldCantidad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldCantidad.setText("Cantidad");
        fieldCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldCantidadMouseClicked(evt);
            }
        });

        fieldTipoDeArchivo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldTipoDeArchivo.setText("Tipo de Archivo");
        fieldTipoDeArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldTipoDeArchivoMouseClicked(evt);
            }
        });

        botonAceptarRoot.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        botonAceptarRoot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAceptarRoot.setText("Aceptar");
        botonAceptarRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonAceptarRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAceptarRoot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarRootMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRootLayout.createSequentialGroup()
                .addComponent(fieldRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(fieldTipoDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(botonAceptarRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fieldRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonAceptarRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fieldTipoDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 920, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        labelimgDim.setVisible (true);
        panelRoot.setVisible(false);
        trueFalse.setVisible(true);
        SetImageLabelButton();
    }//GEN-LAST:event_boton1ActionPerformed

    private void trueFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueFalseActionPerformed
        
    }//GEN-LAST:event_trueFalseActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        labelimgDim.setVisible (true);
        panelRoot.setVisible(false);
        trueFalse.setVisible(true);
        SetImageLabelDimensionButton();
    }//GEN-LAST:event_boton2ActionPerformed

    private void fieldDimensionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldDimensionesMouseClicked
        fieldDimensiones.setText("");
    }//GEN-LAST:event_fieldDimensionesMouseClicked
    
    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        String dimensiones = fieldDimensiones.getText();
        String[] partes = dimensiones.split("x");
        int entradaWidth = Integer.parseInt(partes[0].trim());
        int entradaHeight = Integer.parseInt(partes[1].trim());
        
        Dimension nuevaDimension = new Dimension(entradaWidth, entradaHeight);
        
        CambiarImagenDimension(nuevaDimension);
    }//GEN-LAST:event_botonAceptarMouseClicked

    //Radio Button Tercera Elección
    
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        panelRoot.setVisible(true);
        fieldDimensiones.setVisible(false);
        botonAceptar.setVisible(false);
        trueFalse.setVisible(false);
        labelimgDim.setVisible (false);
    }//GEN-LAST:event_boton3ActionPerformed

    //Botones para Root Message
    
    private void botonAceptarRootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarRootMouseClicked
        ArrayList<String> rutas = Utilidades.CrearRuta(fieldRoot.getText(), fieldNombre.getText(), fieldTipoDeArchivo.getText(), Integer.parseInt(fieldCantidad.getText()));

        for (String rutaFinal : rutas) {
            System.out.println(rutaFinal);
        }
        
        fieldRoot.setText("Root");
        fieldNombre.setText("Nombre");
        fieldTipoDeArchivo.setText("Tipo de Archivo");
        fieldCantidad.setText("Cantidad");
    }//GEN-LAST:event_botonAceptarRootMouseClicked

    private void fieldRootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldRootMouseClicked
        fieldRoot.setText("");
    }//GEN-LAST:event_fieldRootMouseClicked

    private void fieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNombreMouseClicked
        fieldNombre.setText("");
    }//GEN-LAST:event_fieldNombreMouseClicked

    private void fieldTipoDeArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTipoDeArchivoMouseClicked
        fieldTipoDeArchivo.setText("");
    }//GEN-LAST:event_fieldTipoDeArchivoMouseClicked

    private void fieldCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCantidadMouseClicked
        fieldCantidad.setText("");
    }//GEN-LAST:event_fieldCantidadMouseClicked

    private void trueFalseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trueFalseMouseClicked
        if (trueFalse.isSelected()) {
            trueFalse.setText("True");
            Utilidades.SetImageLabel(labelimgDim, root, true);
        } else {
            trueFalse.setText("False");
            Utilidades.SetImageLabel(labelimgDim, root, false);
        }
    }//GEN-LAST:event_trueFalseMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private void SetImageLabelButton() {
        if (boton1.isSelected()) {
            fieldDimensiones.setVisible(false);
            botonAceptar.setVisible(false);
        }
    }
    
//    private void CambiarImagen() {
//        if (trueFalse.getText().equals("true")) {
//            Utilidades.SetImageLabel(labelimgDim, root, true);
//        } else {
//            Utilidades.SetImageLabel(labelimgDim, root, false);
//        }
//    }
    
    private void SetImageLabelDimensionButton() {
        if (boton2.isSelected()) {
            fieldDimensiones.setVisible(true);
            botonAceptar.setVisible(true);
        }
    }
    
    private void CambiarImagenDimension(Dimension dimensiones) {
        if (trueFalse.getText().equals("true")) {
            Utilidades.SetImageLabelDimension (labelimgDim, root, dimensiones, true);
        } else {
            Utilidades.SetImageLabelDimension (labelimgDim, root, dimensiones, false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boton1;
    private javax.swing.JRadioButton boton2;
    private javax.swing.JRadioButton boton3;
    private javax.swing.JLabel botonAceptar;
    private javax.swing.JLabel botonAceptarRoot;
    private javax.swing.JTextField fieldCantidad;
    private javax.swing.JTextField fieldDimensiones;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldRoot;
    private javax.swing.JTextField fieldTipoDeArchivo;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelimgDim;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JToggleButton trueFalse;
    // End of variables declaration//GEN-END:variables
}
