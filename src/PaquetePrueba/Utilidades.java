package PaquetePrueba;

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Utilidades {
        
    public static void SetImageLabel (JLabel labelName, String root, boolean keepProportions){
        ImageIcon image = new ImageIcon(root);
        
        Icon icon;
        
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        int labelWidht = labelName.getWidth();
        int labelHeight = labelName.getHeight();
        
        if (keepProportions) {
            int proporcionWidth = labelWidht / imgWidth;
            int proporcionHeight = labelHeight / imgHeight;

            if (labelHeight < labelWidht) {
                if (imgWidth*proporcionHeight < labelWidht){
                    icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcionHeight, labelHeight, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                } else {
                    icon = new ImageIcon (image.getImage().getScaledInstance(labelWidht, imgHeight*proporcionWidth, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                }
            } else if(imgWidth < imgHeight) {
                if(imgHeight*proporcionWidth > labelHeight){
                    icon = new ImageIcon (image.getImage().getScaledInstance(labelWidht, imgHeight*proporcionWidth, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                } else {
                    icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcionHeight, labelHeight, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                }
            }
        } else {
            icon = new ImageIcon (image.getImage().getScaledInstance(labelWidht, labelHeight, Image.SCALE_DEFAULT));
            labelName.setIcon(icon);
        }
        
        labelName.repaint();
    }
    
    public static void SetImageLabelDimension (JLabel labelName, String root, Dimension dimension, boolean keepProportions){
            ImageIcon image = new ImageIcon(root);
        
            int dimensionWidth = dimension.width;
            int dimensionHeight = dimension.height;
            
        if (keepProportions) {
            int imgWidth = image.getIconWidth();
            int imgHeight = image.getIconHeight();
                      
            if (imgWidth > imgHeight) {
                if (imgHeight > dimensionHeight){
                    int proporcion = dimensionHeight / imgHeight;
                    Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcion, imgHeight*proporcion, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                } else {
                    int proporcion = dimensionWidth / imgWidth;
                    Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcion, imgHeight*proporcion, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                }
            } else if(imgWidth < imgHeight) {
                if(imgWidth > dimensionWidth){
                    int proporcion = dimensionWidth / imgWidth;
                    Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcion, imgHeight*proporcion, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                } else {
                    int proporcion = dimensionHeight / imgHeight;
                    Icon icon = new ImageIcon (image.getImage().getScaledInstance(imgWidth*proporcion, imgHeight*proporcion, Image.SCALE_DEFAULT));
                    labelName.setIcon(icon);
                }
            }
        } else {            
            Icon icon = new ImageIcon (image.getImage().getScaledInstance(dimensionWidth, dimensionHeight, Image.SCALE_DEFAULT));
            labelName.setIcon(icon);
        }
        labelName.repaint();
    }

    public static ArrayList<String> CrearRuta(String root, String nombre, String tipoArchivo, int dimension) {
        ArrayList<String> rootFinal = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            String rootSeparado = root + nombre + i + "." + tipoArchivo;
            rootFinal.add(rootSeparado);
        }

        return rootFinal;
    }
}
