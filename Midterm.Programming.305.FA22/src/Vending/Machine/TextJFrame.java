package Vending.Machine;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *<p>
 * TextJFrame is a basic Swing JFrame with a jTextArea in the middle
 * Caller can create an TextJFrame object
 * pass the info to be displayed on jTextArea
 * caller can also Append2TextArea after initialization
 * the caller must make this object JFrame visible with JFrame.setVisible(true)
 * <br>Date: Oct 2020
 * </p>
 * @author Prof A. Nuzen anuzen@sandiego.edu
 */
public class TextJFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstJFrame
     * @param title String
     * @param info  String to be appended into the jTextArea
     */
    public TextJFrame(String title, String info) {
        initComponents();
		// Read-only-TextArea
        jTextArea1.setEditable(false);
        centerFrame();
        this.setTitle(title);
	//Destroy this JFrame when the user close the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add text to jTextArea
        Append2TextArea(info);
    }
    /**
     * Center frame divides the screen width and height by 4
     */
    void centerFrame(){
        //center JFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(screenSize.width/4, screenSize.height/4);
    }
    public void Append2TextArea(String text){
        jTextArea1.append(text);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        closeBtn = new javax.swing.JButton();
        AboutMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setAlignmentX(10.0F);
        jTextArea1.setAlignmentY(10.0F);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(jTextArea1);

        closeBtn.setForeground(new java.awt.Color(51, 51, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        AboutMenu.add(jMenu1);

        setJMenuBar(AboutMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        // using showMessageDialog(component parentComponent,String message,
        //								String messageTitle,int optionType) 
        JOptionPane.showMessageDialog(null,
                "Java JTextFrame NetBeans GUI Builder.",
                "About TextJFrame", 
                JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar AboutMenu;
    private javax.swing.JButton closeBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
