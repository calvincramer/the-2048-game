/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the2048game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Calvin Cramer
 */
public class HighscoresWindow extends javax.swing.JFrame {

    /**
     * Creates new form HighscoresWindow
     */
    public HighscoresWindow(int x, int y) {
        initComponents();
        
        buttonColor = new Color(237, 153, 91);
        backgroundColor = new Color(250, 248, 239);
        
        getContentPane().setBackground(backgroundColor);
        
        AbstractBorder buttonLine = new TextBubbleBorder(buttonColor, 2, 8, 0);
        scoreLabel.setBorder(buttonLine);
        doneButton.setBorder(buttonLine);
        
        this.setBounds(x, y, this.getWidth(), this.getHeight());
        
        ScoreReader reader = new ScoreReader();
        int[] scores = reader.getTopScores(10);
        String text = "";
        for(int n = 0; n < scores.length; n++) {
            text += scores[n];
            if (n <= 8) text += "\n";
        }
        scoreTextArea.setText(text);
        
        this.addKeyListener(new UserInputListener());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        scoreTextArea = new javax.swing.JTextArea();
        scoreLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Highscores");
        setAlwaysOnTop(true);
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 0));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(187, 173, 160));
        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("1)\n2)\n3)\n4)\n5)\n6)\n7)\n8)\n9)\n10)");
        jTextArea1.setSelectionColor(new java.awt.Color(187, 173, 160));
        jScrollPane1.setViewportView(jTextArea1);

        scoreTextArea.setEditable(false);
        scoreTextArea.setBackground(new java.awt.Color(187, 173, 160));
        scoreTextArea.setColumns(12);
        scoreTextArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scoreTextArea.setForeground(new java.awt.Color(255, 255, 255));
        scoreTextArea.setRows(5);
        scoreTextArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        scoreTextArea.setSelectionColor(new java.awt.Color(187, 173, 160));
        jScrollPane2.setViewportView(scoreTextArea);

        scoreLabel.setBackground(new java.awt.Color(237, 153, 91));
        scoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("SCORES");
        scoreLabel.setOpaque(true);

        doneButton.setBackground(new java.awt.Color(237, 153, 91));
        doneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doneButton.setText("DONE");
        doneButton.setOpaque(true);
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_doneButtonMouseClicked

    
    private static Color backgroundColor;
    private static Color buttonColor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doneButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextArea scoreTextArea;
    // End of variables declaration//GEN-END:variables
}