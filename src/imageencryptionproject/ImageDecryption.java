/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageencryptionproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ImageDecryption extends javax.swing.JFrame {

    /**
     * Creates new form ImageDisplay
     */
    public ImageDecryption() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        RandomImage_filepath = new javax.swing.JTextField();
        RandomImage_Label = new javax.swing.JLabel();
        EncryptedImage_filepath = new javax.swing.JTextField();
        PlainImage_Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        originalmage_button = new javax.swing.JButton();
        HybridImage_Label = new javax.swing.JLabel();
        decryptbutton = new javax.swing.JButton();
        displayimage_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Image Encryption System", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Browse Random Image");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Browse Encrypted Image");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        RandomImage_filepath.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Hybrided Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        originalmage_button.setBackground(new java.awt.Color(255, 255, 255));
        originalmage_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        originalmage_button.setText("Generate Original Image");
        originalmage_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        originalmage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalmage_buttonActionPerformed(evt);
            }
        });

        HybridImage_Label.setBackground(new java.awt.Color(255, 255, 255));
        HybridImage_Label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        decryptbutton.setBackground(new java.awt.Color(255, 255, 255));
        decryptbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        decryptbutton.setText("Decrypt Image");
        decryptbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decryptbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptbuttonActionPerformed(evt);
            }
        });

        displayimage_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        displayimage_Button.setText("Display Image");
        displayimage_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayimage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayimage_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HybridImage_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(decryptbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(originalmage_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayimage_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(decryptbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(HybridImage_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayimage_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(originalmage_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RandomImage_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RandomImage_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PlainImage_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EncryptedImage_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(RandomImage_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RandomImage_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EncryptedImage_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlainImage_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        RandomImage_filepath.setText(f.getAbsolutePath());
        RandomImage_Label.setIcon(new ImageIcon(f.getAbsolutePath()));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        EncryptedImage_filepath.setText(f.getAbsolutePath());
        PlainImage_Label.setIcon(new ImageIcon(f.getAbsolutePath()));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void originalmage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalmage_buttonActionPerformed
BufferedImage image1 = null;
               try{
                   File input1 = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\ImageEncryptionProject\\src\\images\\RandomImage.jpg");
                   image1 = ImageIO.read(input1);
               }
               catch(IOException e){
                   System.out.println(e);
               }
            
        BufferedImage image2 = null;        
                try{
                   File input2 = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\ImageEncryptionProject\\src\\images\\DecryptedImage.jpg");
                   image2 = ImageIO.read(input2);
               }
               catch(IOException e){
                   System.out.println(e);
                   
               }
              int width = Math.min(image1.getWidth(), image2.getWidth());
              int height = Math.min(image1.getHeight(), image2.getHeight());
              
             // System.out.println(width);
             // System.out.println(height);
              BufferedImage image3 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            for (int x =0; x < width; x++){
                for (int y =0; y < height; y++){
                    int colorValue1 = image1.getRGB(x, y);
                    Color pixelColor1 = new Color(colorValue1);
                    int red1 = pixelColor1.getRed();
                    int green1 = pixelColor1.getGreen();
                    int blue1 = pixelColor1.getBlue();
                    
        
                    int colorValue2 = image2.getRGB(x, y);
                    Color pixelColor2 = new Color(colorValue2);
                    int red2 = pixelColor2.getRed();
                    int green2 = pixelColor2.getGreen();
                    int blue2 = pixelColor2.getBlue();
        
                    int red3 = Math.min(Math.abs(red2 - red1), 255);
                    int green3 = Math.min(Math.abs(green2 - green1), 255);
                    int blue3 = Math.min(Math.abs(blue2 + blue1), 255);
                
                    
                    Color newPixelColor = new Color(red3, green3, blue3);
                    int newRGBvalue = newPixelColor.getRGB();
                    image3.setRGB(x, y, newRGBvalue);
            }
        }
        File f = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\ImageEncryptionProject\\src\\images\\HybridImage.jpg");
        try {
            ImageIO.write(image3, "jpg", f);
        } catch (IOException ex) {
            Logger.getLogger(ImageEncryption.class.getName()).log(Level.SEVERE, null, ex);
        }
       /* BufferedImage image3 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            for (int x =0; x < width; x++){
                for (int y =0; y < height; y++){
                    int  p = Math.abs(image1.getRGB(x, y) - image2.getRGB(x, y));
                        int result = (p<0)?0:p;
                    image3.setRGB(x, y, result);
                }
            }
        File f = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\IMAGENCRYPTIONSYSTEM\\src\\images\\Original.jpg");
        try {
            ImageIO.write(image3, "jpg", f);
        } catch (IOException ex) {
            Logger.getLogger(DecryptImage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_originalmage_buttonActionPerformed

    private void decryptbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptbuttonActionPerformed
        try{
            FileInputStream file = new FileInputStream(EncryptedImage_filepath.getText());
            FileOutputStream outStream = new FileOutputStream("C:\\Users\\user\\Documents\\NetBeansProjects\\ImageEncryptionProject\\src\\images\\DecryptedImage.jpg");
            byte k[] = "Nith5252".getBytes();
            SecretKeySpec key = new SecretKeySpec(k, "BLOWFISH");
            Cipher enc = Cipher.getInstance("BLOWFISH");
            enc.init(Cipher.DECRYPT_MODE, key);
            CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            byte[] buf = new byte[1024];
            int read;
            while((read =file.read(buf)) != -1){
                cos.write(buf, 0, read);
            }
            file.close();
            outStream.flush();
            cos.close();
            JOptionPane.showMessageDialog(null, "The Image was decrypted Successfully");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_decryptbuttonActionPerformed

    private void displayimage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayimage_ButtonActionPerformed
        BufferedImage image = null;
        try
        {
          image = ImageIO.read(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\ImageEncryptionProject\\src\\images\\OriginalImage.jpg"));
        }
        catch (Exception e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        ImageIcon imageIcon = new ImageIcon(image);
        HybridImage_Label.setIcon(imageIcon);
    }//GEN-LAST:event_displayimage_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ImageDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageDecryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EncryptedImage_filepath;
    private javax.swing.JLabel HybridImage_Label;
    private javax.swing.JLabel PlainImage_Label;
    private javax.swing.JLabel RandomImage_Label;
    private javax.swing.JTextField RandomImage_filepath;
    private javax.swing.JButton decryptbutton;
    private javax.swing.JButton displayimage_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton originalmage_button;
    // End of variables declaration//GEN-END:variables
}
