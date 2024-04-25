/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Reaster
 */
import javax.swing.*;

public class DisplayScene extends javax.swing.JFrame {

    //ImageIcon imageMap=new ImageIcon("Resources/Map.png");

    /**
     * Creates new form Test
     */
    public Game game;
    
    private static DisplayScene singleton;
    public static DisplayScene getInstance(){
        if(singleton==null)
        {
            singleton = new DisplayScene();
        }
            return singleton;
    }
    public DisplayScene() {
        initComponents();
        this.setLocationRelativeTo(null);
        Map.setText("");
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
            java.util.logging.Logger.getLogger(DisplayScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }
    
    int pId=1;
    public int SetPlayerId(){
        return pId++;
    }
    public void SetLabel(int pos,int num){
        switch(pos){
                case 1 -> jLabel1.setText("Player" + ++num);
                case 2 -> jLabel2.setText("Player" + ++num);
                case 3 -> jLabel3.setText("Player" + ++num);
                case 4 -> jLabel4.setText("Player" + ++num);
                case 5 -> jLabel5.setText("Player" + ++num);
                case 6 -> jLabel6.setText("Player" + ++num);
                case 7 -> jLabel7.setText("Player" + ++num);
                case 8 -> jLabel8.setText("Player" + ++num);
                case 9 -> jLabel9.setText("Player" + ++num);
                case 10 -> jLabel10.setText("Player" + ++num);
                case 11 -> jLabel11.setText("Player" + ++num);
                case 12 -> jLabel12.setText("Player" + ++num);
                case 13 -> jLabel13.setText("Player" + ++num);
                case 14 -> jLabel14.setText("Player" + ++num);
                case 15 -> jLabel15.setText("Player" + ++num);
                case 16 -> jLabel16.setText("Player" + ++num);
                case 17 -> jLabel17.setText("Player" + ++num);
                case 18 -> jLabel18.setText("Player" + ++num);
                case 19 -> jLabel19.setText("Player" + ++num);
                case 20 -> jLabel20.setText("Player" + ++num);
                case 21 -> jLabel21.setText("Player" + ++num);
                case 22 -> jLabel22.setText("Player" + ++num);
                case 23 -> jLabel23.setText("Player" + ++num);
            }
    }
    //String s_buffer;
    public void SetConsole(String s){
        console.setText(s);
    }
    
    public void AddConsole(String s){
        console.append("\n"+s);
    }
    private JLabel previousLabel = null;
    public void setIcon(Square square, Player currentPlayer) {
        int labelIndex = square.index;
        int previousposition = currentPlayer.getPreviousPosition();
        System.out.println("Attempting to move to label at index: " + labelIndex);
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\dalto\\IdeaProjects\\COM3101_Monopoly-v2\\Resources\\player.png");


        // Update the new label based on the label index
        switch (labelIndex) {
            case 1 -> jLabel23.setIcon(imageIcon);
            case 2 -> jLabel24.setIcon(imageIcon);
            case 3 -> jLabel25.setIcon(imageIcon);
            case 4 -> jLabel26.setIcon(imageIcon);
            case 5 -> jLabel27.setIcon(imageIcon);
            case 6 -> jLabel28.setIcon(imageIcon);
            case 7 -> jLabel29.setIcon(imageIcon);
            case 8 -> jLabel30.setIcon(imageIcon);
            case 9 -> jLabel31.setIcon(imageIcon);
            case 10 -> jLabel32.setIcon(imageIcon);
            case 11 -> jLabel33.setText(currentPlayer.getName());
            case 12 -> jLabel34.setText(currentPlayer.getName());
            case 13 -> jLabel35.setText(currentPlayer.getName());
            case 14 -> jLabel36.setText(currentPlayer.getName());
            case 15 -> jLabel37.setText(currentPlayer.getName());
            case 16 -> jLabel38.setText(currentPlayer.getName());
            case 17 -> jLabel39.setText(currentPlayer.getName());
            case 18 -> jLabel40.setText(currentPlayer.getName());
            case 19 -> jLabel41.setText(currentPlayer.getName());
            case 20 -> jLabel42.setText(currentPlayer.getName());
            case 21 -> jLabel43.setText(currentPlayer.getName());
            case 22 -> jLabel44.setText(currentPlayer.getName());
            case 23 -> jLabel45.setText(currentPlayer.getName());
            default -> System.out.println("Invalid label index: " + labelIndex);
        }
        if (previousposition!=100){
            switch (previousposition){
                case 1 -> jLabel23.setText("");
                case 2 -> jLabel24.setText("");
                case 3 -> jLabel25.setText("");
                case 4 -> jLabel26.setText("");
                case 5 -> jLabel27.setText("");
                case 6 -> jLabel28.setText("");
                case 7 -> jLabel29.setText("");
                case 8 -> jLabel30.setText("");
                case 9 -> jLabel31.setText("");
                case 10 -> jLabel32.setText("");
                case 11 -> jLabel33.setText("");
                case 12 -> jLabel34.setText("");
                case 13 -> jLabel35.setText("");
                case 14 -> jLabel36.setText("");
                case 15 -> jLabel37.setText("");
                case 16 -> jLabel38.setText("");
                case 17 -> jLabel39.setText("");
                case 18 -> jLabel40.setText("");
                case 19 -> jLabel41.setText("");
                case 20 -> jLabel42.setText("");
                case 21 -> jLabel43.setText("");
                case 22 -> jLabel44.setText("");
                case 23 -> jLabel45.setText("");
                default -> System.out.println("Invalid label index: " + previousposition);
            }

        }

        previousposition = currentPlayer.setPreviousPosition(labelIndex);
    }


    public String GetConsole(){
        return console.getText();
    }
    
    public String SetGetInputDialog(String s){
        String input=JOptionPane.showInputDialog(null, s);
        return input;
    }
    
    public void Roll(){
        JOptionPane.showMessageDialog(null, "Press enter to roll", "Roll", JOptionPane.INFORMATION_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        rollBt = new javax.swing.JButton();
        inputTf = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        Map = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 613, 61, 0);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(148, 500, 61, 0);

        jLabel3.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 390, 61, 0);

        jLabel4.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(145, 277, 61, 0);

        jLabel5.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 165, 61, 0);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 53, 61, 0);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 5, 61, 0);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 5, 61, 0);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 5, 61, 0);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(590, 5, 61, 0);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(675, 5, 61, 0);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(765, 52, 61, 0);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(807, 163, 61, 0);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(850, 275, 61, 0);

        jLabel15.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(890, 387, 61, 0);

        jLabel16.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(850, 500, 61, 0);

        jLabel17.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(810, 610, 61, 0);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(765, 725, 61, 0);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(675, 725, 61, 0);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(585, 725, 61, 0);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel21);
        jLabel21.setBounds(495, 725, 61, 0);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setMaximumSize(new java.awt.Dimension(61, 17));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(410, 725, 61, 0);

        //jLabel23.setText("jLabel1");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(190, 670, 41, 17);

        //jLabel24.setText("jLabel2");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(148, 560, 41, 17);

        //jLabel25.setText("jLabel3");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(100, 450, 41, 17);

        //jLabel26.setText("jLabel4");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(145, 337, 41, 17);

        //jLabel27.setText("jLabel5");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(190, 225, 41, 17);

        //jLabel28.setText("jLabel6");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(230, 113, 41, 17);

        //jLabel29.setText("jLabel7");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(320, 65, 41, 17);

        //jLabel30.setText("jLabel8");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(410, 65, 41, 17);

        //jLabel31.setText("jLabel9");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(500, 65, 41, 17);

        //jLabel32.setText("jLabel10");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(590, 65, 48, 17);

        //jLabel33.setText("jLabel11");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(675, 65, 48, 17);

        //jLabel34.setText("jLabel12");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(765, 112, 48, 17);

        //jLabel35.setText("jLabel13");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(807, 223, 48, 17);

       //jLabel36.setText("jLabel14");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(850, 335, 48, 17);

        //jLabel37.setText("jLabel15");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(890, 447, 48, 17);

        //jLabel38.setText("jLabel16");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(850, 560, 48, 17);

        //jLabel39.setText("jLabel17");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(810, 670, 48, 17);

        //jLabel40.setText("jLabel18");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(765, 785, 48, 17);

        //jLabel41.setText("jLabel19");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(675, 785, 48, 17);

        //jLabel42.setText("jLabel20");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(585, 785, 48, 17);

        //jLabel43.setText("jLabel21");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(495, 785, 48, 17);

        //jLabel44.setText("jLabel22");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(410, 785, 48, 17);

        rollBt.setText("rollBt");
        getContentPane().add(rollBt);
        rollBt.setBounds(920, 810, 72, 23);

        inputTf.setText("inputTf");
        inputTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTfActionPerformed(evt);

            }
        });
        inputTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTfKeyPressed(evt);
            }
        });
        getContentPane().add(inputTf);
        inputTf.setBounds(710, 860, 130, 30);

        jLabel45.setText("jLabel45");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(270, 770, 48, 17);

        jLabel46.setText("jLabel46");
        getContentPane().add(jLabel46);
        jLabel46.setBounds(270, 790, 48, 17);

        console.setColumns(20);
        console.setRows(5);
        jScrollPane.setViewportView(console);

        getContentPane().add(jScrollPane);
        jScrollPane.setBounds(930, 500, 234, 220);

        Map.setBackground(new java.awt.Color(142, 142, 142));
        Map.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Map.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalto\\IdeaProjects\\COM3101_Monopoly-v2\\Resources\\Map.png")); // NOI18N
        Map.setToolTipText("");
        Map.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                MapHierarchyChanged(evt);
            }
        });
        getContentPane().add(Map);
        Map.setBounds(6, 0, 951, 881);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MapHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_MapHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_MapHierarchyChanged

    private void inputTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputTfActionPerformed

    private void inputTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTfKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Map;
    private javax.swing.JTextArea console;
    private javax.swing.JTextField inputTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton rollBt;


}
