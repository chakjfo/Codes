/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cce107;

import java.util.Date;

/**
 *
 * @author chari
 */
public class StandardRoom extends javax.swing.JFrame {
    /**
     * Creates new form StandardRoom
     */
    private Date checkInDate;
    private Date checkOutDate;
    private String roomType;
    private double totalPrice;
    
    public StandardRoom(Date checkInDate, Date checkOutDate, String roomType, double totalPrice) {
        initComponents();
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.totalPrice = totalPrice;
    }
    public double calculateTotalPrice(Date checkInDate, Date checkOutDate, String roomType) {
    // Calculate the duration of the stay in days
    long durationInMillis = checkOutDate.getTime() - checkInDate.getTime();
    int durationInDays = (int) (durationInMillis / (1000 * 60 * 60 * 24));

    // Determine the base price of the room based on its type
    double basePrice = 0.0;
    if (roomType.equals("Standard Room")) {
        basePrice = 100.0; // Example price for a standard room
    } else if (roomType.equals("Twin Room")) {
        basePrice = 150.0; // Example price for a deluxe room
    } else if (roomType.equals("Family Room")) {
        basePrice = 250.0; // Example price for a deluxe room
    } else if (roomType.equals("Business Room")) {
        basePrice = 300.0; // Example price for a deluxe room
    } else if (roomType.equals("Luxury Room")) {
        basePrice = 350.0; // Example price for a deluxe room
    }
    // Add additional logic for other room types

    // Calculate the total price
    double totalPrice = basePrice * durationInDays;

    // Additional logic can be added here for applying discounts, taxes, etc.

    return totalPrice;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBook.setText("jButton1");
        jButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(720, Short.MAX_VALUE)
                .addComponent(jButtonBook)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jButtonBook)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookActionPerformed
        // TODO add your handling code here:
        InfoFillOut infoFillOut = new InfoFillOut(this, true, checkInDate, checkOutDate, roomType, totalPrice);
        infoFillOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBookActionPerformed

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
            java.util.logging.Logger.getLogger(StandardRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBook;
    // End of variables declaration//GEN-END:variables

}
    
