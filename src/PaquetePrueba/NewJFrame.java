package PaquetePrueba;

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NewJFrame extends javax.swing.JFrame {
    
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        SetImageLabel (labelimgDim, "src/images/logoNike.png", true);

//        SetImageLabelDimension (labelimgDim, "src/images/logoNike.png", "180x100", false);
        
        ArrayList<String> rutas = CrearRuta("src/images/", "logo", "png", 25);

        for (String rutaFinal : rutas) {
            System.out.println(rutaFinal);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelimgDim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelimgDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelimgDim;
    // End of variables declaration//GEN-END:variables
}
