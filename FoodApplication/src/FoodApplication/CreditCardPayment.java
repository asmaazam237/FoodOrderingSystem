package FoodApplication;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import FoodClasses.*;

public class CreditCardPayment extends javax.swing.JFrame {
        private Customer user;
        private Payment payment;
        public CreditCardPayment(Customer customer,Payment payment) {
        this.user = customer;
        this.payment= payment;
        initComponents();
        Color col =new Color(242,242,242);
        getContentPane().setBackground(col);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("FoodIcon.jpg")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        accnotxt = new javax.swing.JTextField();
        pintxt = new javax.swing.JPasswordField();
        proceedbtn = new javax.swing.JButton();
        pinradio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FOOD ORDERING APPLICATION");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credit Card Details");

        backbtn.setBackground(new java.awt.Color(204, 204, 204));
        backbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        backbtn.setText("BACK");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Account number:");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("pin:");

        accnotxt.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N

        pintxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        proceedbtn.setBackground(new java.awt.Color(0, 102, 102));
        proceedbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        proceedbtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedbtn.setText("PROCEED");
        proceedbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedbtnActionPerformed(evt);
            }
        });

        pinradio.setText("Show pin");
        pinradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinradioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(pinradio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accnotxt)
                    .addComponent(pintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(pinradio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceedbtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void proceedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedbtnActionPerformed
        String accno = accnotxt.getText().trim();
        String pin = pintxt.getText().trim();
        if(isValid(accno) & accno.length() == 16 & isValid(pin) & pin.length() == 4){
            JOptionPane.showMessageDialog(null, "Order confirmed!");
            if (payment!= null) {
            payment.dispose();
        }
            CheckOut co = new CheckOut(user);
            co.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Please enter valid account number and pin!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_proceedbtnActionPerformed

    private boolean isValid(String input) {
        // Check if the contact and contains only numbers
        return input != null && input.matches("\\d+");
    }
    
    private void pinradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinradioActionPerformed
        if (pinradio.isSelected()) {
            pintxt.setEchoChar((char) 0);
        } else {
            pintxt.setEchoChar('•');
        }
    }//GEN-LAST:event_pinradioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnotxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton pinradio;
    private javax.swing.JPasswordField pintxt;
    private javax.swing.JButton proceedbtn;
    // End of variables declaration//GEN-END:variables
}
