package PaquetePrueba;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NewJFrame extends javax.swing.JFrame {
    
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);        

//        SetImageLabelDimension (labelimgDim, "src/images/logoNike.png", "180x100", false);
        
//        ArrayList<String> rutas = CrearRuta("src/images/", "logo", "png", 25);
//
//        for (String rutaFinal : rutas) {
//            System.out.println(rutaFinal);
//        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelimgDim = new javax.swing.JLabel();
        boton1 = new javax.swing.JRadioButton();
        boton2 = new javax.swing.JRadioButton();
        trueFalse = new javax.swing.JToggleButton();
        fieldDimensiones = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelimgDim.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        labelimgDim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelimgDim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelimgDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 910, 510));

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

        trueFalse.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        trueFalse.setText("False");
        trueFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueFalseActionPerformed(evt);
            }
        });
        jPanel1.add(trueFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        fieldDimensiones.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        fieldDimensiones.setText("Dimensiones");
        fieldDimensiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldDimensionesMouseClicked(evt);
            }
        });
        jPanel1.add(fieldDimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 110, 30));

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
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        SetImageLabelButton();
    }//GEN-LAST:event_boton1ActionPerformed

    private void trueFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueFalseActionPerformed
        CambiarImagen();
        if (trueFalse.isSelected()) {
            trueFalse.setText("True");
        } else {
            trueFalse.setText("False");
        }
    }//GEN-LAST:event_trueFalseActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        SetImageLabelDimensionButton();
    }//GEN-LAST:event_boton2ActionPerformed

    private void fieldDimensionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldDimensionesMouseClicked
        fieldDimensiones.setText("");
    }//GEN-LAST:event_fieldDimensionesMouseClicked

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        fieldDimensiones.setText("");
        CambiarImagenDimension(fieldDimensiones.getText());
    }//GEN-LAST:event_botonAceptarMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel (JLabel labelName, String root, boolean keepProportions){
        ImageIcon image = new ImageIcon(root);
        
        if (keepProportions) {
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();
            
            labelName.setSize(imgWidth, imgHeight);
            
            
            Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth, imgHeight, Image.SCALE_DEFAULT));
            labelimgDim.setIcon(icon);
        } else {    
            Icon icon = new ImageIcon (image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
            labelimgDim.setIcon(icon);
        }
        
        labelName.repaint();
    }
    
    private void SetImageLabelDimension (JLabel labelName, String root, String dimension, boolean keepProportions){
            ImageIcon image = new ImageIcon(root);
        
        if (keepProportions) {
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();
            
            labelName.setSize(imgWidth, imgHeight);
            
            
            Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth, imgHeight, Image.SCALE_DEFAULT));
            labelimgDim.setIcon(icon);
        } else {
            String[] dimensions = dimension.split("x");

            int width = Integer.parseInt(dimensions[0].trim());
            int height = Integer.parseInt(dimensions[1].trim());

            labelName.setSize(width, height);

            Icon icon = new ImageIcon (image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
            labelimgDim.setIcon(icon);
        }
        this.repaint();
    }

    public static ArrayList<String> CrearRuta(String root, String nombre, String tipoArchivo, int dimension) {
        ArrayList<String> rootFinal = new ArrayList<>();

        for (int i = 1; i <= dimension; i++) {
            String rootSeparado = root + nombre + i + "." + tipoArchivo;
            rootFinal.add(rootSeparado);
        }

        return rootFinal;
    }
    
    private void SetImageLabelButton() {
        if (boton1.isSelected()) {
            fieldDimensiones.setVisible(false);
            botonAceptar.setVisible(false);
            CambiarImagen();
        }
    }
    
    private void CambiarImagen() {
        if (trueFalse.isSelected()) {
            SetImageLabel(labelimgDim, "src/images/logoNike.png", true);
        } else {
            SetImageLabel(labelimgDim, "src/images/logoNike.png", false);
        }
    }
    
    private void SetImageLabelDimensionButton() {
        if (boton2.isSelected()) {
            fieldDimensiones.setVisible(true);
            botonAceptar.setVisible(true);
        }
    }
    
    private void CambiarImagenDimension(String dimensiones) {
        if (trueFalse.isSelected()) {
            SetImageLabelDimension (labelimgDim, "src/images/logoNike.png", dimensiones, true);
        } else {
            SetImageLabelDimension (labelimgDim, "src/images/logoNike.png", dimensiones, false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boton1;
    private javax.swing.JRadioButton boton2;
    private javax.swing.JLabel botonAceptar;
    private javax.swing.JTextField fieldDimensiones;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelimgDim;
    private javax.swing.JToggleButton trueFalse;
    // End of variables declaration//GEN-END:variables
}
