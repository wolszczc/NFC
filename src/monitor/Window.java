/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import container.Container;
import static container.Container.createWordsArray;
import static container.Reader.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static container.WriteData.*;
import generator.NGramContainer;
import generator.StatsGenerator;
import generator.TextGenerator;
import java.util.Date;
import javax.swing.JOptionPane;
import static generator.TextGenerator.*;
import static generator.Tree.addNGramToTree;
import static generator.Tree.addWordsToTree;
import static generator.Tree.checkWordsInDictionary;
import java.awt.Font;
import java.util.Random;
import java.util.TreeSet;
import javax.swing.JButton;

/**
 *
 * @author wolszczc
 */
public class Window extends javax.swing.JFrame {

    private static int[] arrayLength = new int[1];
    private static int[] indeksWordsInSettingsWindow = new int[5];
    private static int[] indeksWordsInSettingsWindow2 = new int[5];
    private static String wordsIn = "";
    private static String wordsInInfo = "";
    private static String newWords = "";
    private static String wordsInSettingsWindow = "";
    private static String wordsInSettingsWindow2 = "";
    private static Container[] con;
    private static Container[] dictionary;
    private static TextGenerator[] textGen;
    private static NGramContainer[] n_gram;
    public static TreeSet treeSet = null;
    public static TreeSet treeDictionary = null;
    private static int rankOfN_gram = 2;
    StatsWindow statsWindow;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        setTitle("NFC");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        statsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIn = new javax.swing.JTextArea();
        settingsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneOut = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemAdd = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNewWords = new javax.swing.JMenuItem();
        jMenuItemOpenDictionary = new javax.swing.JMenuItem();
        jMenuItemAddDictionary = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAboutProgram = new javax.swing.JMenuItem();
        jMenuItemAuthor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        statsButton.setText("Stats");
        statsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsButtonActionPerformed(evt);
            }
        });

        jTextAreaIn.setColumns(20);
        jTextAreaIn.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIn);

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPaneOut);

        jMenu1.setText("File");

        jMenuItemOpen.setText("Open file...");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOpen);

        jMenuItemAdd.setText("Add file...");
        jMenuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAdd);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Dictionary");

        jMenuItemNewWords.setText("New words");
        jMenuItemNewWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewWordsActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemNewWords);

        jMenuItemOpenDictionary.setText("Open Dictionary...");
        jMenuItemOpenDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenDictionaryActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOpenDictionary);

        jMenuItemAddDictionary.setText("Add Dictionary...");
        jMenuItemAddDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddDictionaryActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddDictionary);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        jMenuItemAboutProgram.setText("About Program");
        jMenuItemAboutProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutProgramActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAboutProgram);

        jMenuItemAuthor.setText("About Author");
        jMenuItemAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAuthorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAuthor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(quitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(settingsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(sendButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(sendButton)
                    .addComponent(statsButton)
                    .addComponent(settingsButton))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        Object source = evt.getSource();
        int ask = JOptionPane.showConfirmDialog(this, "Are you want to quit?", "Quit", JOptionPane.YES_NO_OPTION);
        if (ask == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_quitButtonActionPerformed

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        Object source = evt.getSource();
        if (source == jMenuItemOpen) {
            JFileChooser fileChoicer = new JFileChooser();
            if (fileChoicer.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChoicer.getSelectedFile();
                String tmp;
                if (file.isFile()) {

                    tmp = readFile(file.getAbsolutePath());
                    try {
                        saveFileToBase("base/Base", file, tmp, "base");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.err.println("File is not exist");
                }
            }
            con = createWordsArray(con, "base/Base", arrayLength);
            n_gram = createNGram(n_gram, con, rankOfN_gram);
        }
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jMenuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddActionPerformed
        Object source = evt.getSource();
        if (source == jMenuItemAdd) {
            JFileChooser fileChoicer = new JFileChooser();
            if (fileChoicer.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChoicer.getSelectedFile();
                String tmp;
                if (file.isFile()) {
                    tmp = readFile(file.getAbsolutePath());
                    try {
                        addFileToBase("base/Base", file, tmp, "base");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.err.println("File is not exist");
                }
            }
            con = createWordsArray(con, "base/Base", arrayLength);
            n_gram = createNGram(n_gram, con, rankOfN_gram);
        }
    }//GEN-LAST:event_jMenuItemAddActionPerformed

    private void jMenuItemAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAuthorActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Cezary Wolszczak \nElektryczny\nInformatyka 2014/2015", "About the Autor", WIDTH);
    }//GEN-LAST:event_jMenuItemAuthorActionPerformed

    private void jMenuItemAboutProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutProgramActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Jeszcze to dopracuje, wersja wczesna beta:P", "About the Program", WIDTH);
    }//GEN-LAST:event_jMenuItemAboutProgramActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        Object source = evt.getSource();
        if (source == sendButton) {
            StatsGenerator stats = new StatsGenerator();

            Random rand = new Random();
            Font font1 = new Font("Verdana", Font.BOLD, 12);
            String tempWords;
            Date date = new Date();

            jTextPaneOut.setFont(font1);
            tempWords = " " + jTextAreaIn.getText();
            newWords = newWords + checkWordsInDictionary(treeDictionary, tempWords);
            addTextToBase("base/Base", null, "base", tempWords);
            wordsIn = wordsIn + "\n" + "user:\n" + date + "\n" + jTextAreaIn.getText() + "\n";
            jTextAreaIn.setText("");
            con = createWordsArray(con, "base/Base", arrayLength);

            try {
                n_gram = createNGram(n_gram, con, rankOfN_gram);
            } catch (ArrayIndexOutOfBoundsException aioobe) {

            }
            treeSet = addNGramToTree(treeSet, n_gram, rankOfN_gram);

            stats.findMostCommonNGrams(n_gram); /*tworzy staty*/

            stats.findMostCommonSufiks(n_gram); /*tworzy staty*/

            wordsInSettingsWindow = stats.createStatsArray(n_gram);
            wordsInSettingsWindow2 = stats.createStatsArray2(n_gram);
            for (int i = 0; i < 5; i++) {
                indeksWordsInSettingsWindow[i] = stats.getPointer()[i];
                indeksWordsInSettingsWindow2[i] = stats.getPointerSufiks()[i];
                System.out.println(indeksWordsInSettingsWindow[i]);
            }
            int randInt = 0;
            try {
                randInt = rand.nextInt(arrayLength[0] - rankOfN_gram);
                while (randInt < 0) {
                    randInt = rand.nextInt(arrayLength[0] - rankOfN_gram);
                }
            } catch (IllegalArgumentException iae) {
                randInt = 0;
            }

            try {
                wordsIn = wordsIn + "\n" + "computer:\n" + date + "\n" + n_gram[randInt].getPrefiks() + "\n";
                jTextPaneOut.setText(wordsIn);
            } catch (NullPointerException npe) {

            }
            //      StatsWindow.setjButtonRefresh(sendButton);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void jMenuItemOpenDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenDictionaryActionPerformed
        Object source = evt.getSource();
        if (source == jMenuItemOpenDictionary) {
            JFileChooser fileChoicer = new JFileChooser();
            if (fileChoicer.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChoicer.getSelectedFile();
                String tmp;
                if (file.isFile()) {
                    tmp = readFile(file.getAbsolutePath());
                    try {
                        saveFileToBase("dictionary/Dictionary", file, tmp, "dictionary");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                System.err.println("File is not exist");
            }
            int[] dictionaryLength = new int[1];
            dictionary = createWordsArray(dictionary, "dictionary/Dictionary", dictionaryLength);
            treeDictionary = addWordsToTree(treeDictionary, dictionary);
        }
    }//GEN-LAST:event_jMenuItemOpenDictionaryActionPerformed

    private void jMenuItemAddDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddDictionaryActionPerformed
        Object source = evt.getSource();
        if (source == jMenuItemAddDictionary) {
            JFileChooser fileChoicer = new JFileChooser();
            if (fileChoicer.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChoicer.getSelectedFile();
                String tmp;
                if (file.isFile()) {
                    tmp = readFile(file.getAbsolutePath());
                    try {
                        addFileToBase("dictionary/Dictionary", file, tmp, "dictionary");
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                System.err.println("File is not exist");
            }
            int[] dictionaryLength = new int[1];
            dictionary = createWordsArray(dictionary, "dictionary/Dictionary", dictionaryLength);
            treeDictionary = addWordsToTree(treeDictionary, dictionary);
        }
    }//GEN-LAST:event_jMenuItemAddDictionaryActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        Object source = evt.getSource();
        if (settingsButton == source) {
            SettingsWindow settingWindow = new SettingsWindow();
            settingWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            settingWindow.setVisible(true);
        }
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void statsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsButtonActionPerformed
        Object source = evt.getSource();
        if (statsButton == source) {
            statsWindow = new StatsWindow();
            statsWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            statsWindow.setVisible(true);
        }

    }//GEN-LAST:event_statsButtonActionPerformed

    private void jMenuItemNewWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewWordsActionPerformed
        Object source = evt.getSource();
        if (jMenuItemNewWords == source) {
            DictionaryWindow dictionaryWindow = new DictionaryWindow();
            dictionaryWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            dictionaryWindow.setVisible(true);
            DictionaryWindow.setNewWords(newWords);
        }
    }//GEN-LAST:event_jMenuItemNewWordsActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Window().setVisible(true);
//            }
//        });
        Window window = new Window();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public static int getRankOfN_gram() {
        return rankOfN_gram;
    }

    public static void setRankOfN_gram(int rankOfN_gram) {
        Window.rankOfN_gram = rankOfN_gram;
    }

    public static String getWordsInSettingsWindow() {
        return wordsInSettingsWindow;
    }

    public static void setWordsInSettingsWindow(String wordsInSettingsWindow) {
        Window.wordsInSettingsWindow = wordsInSettingsWindow;
    }

    public static int[] getIndeksWordsInSettingsWindow() {
        return indeksWordsInSettingsWindow;
    }

    public static void setIndeksWordsInSettingsWindow(int[] indeksWordsInSettingsWindow) {
        Window.indeksWordsInSettingsWindow = indeksWordsInSettingsWindow;
    }

    public static int[] getIndeksWordsInSettingsWindow2() {
        return indeksWordsInSettingsWindow2;
    }

    public static void setIndeksWordsInSettingsWindow2(int[] indeksWordsInSettingsWindow2) {
        Window.indeksWordsInSettingsWindow2 = indeksWordsInSettingsWindow2;
    }

    public static String getWordsInSettingsWindow2() {
        return wordsInSettingsWindow2;
    }

    public static void setWordsInSettingsWindow2(String wordsInSettingsWindow2) {
        Window.wordsInSettingsWindow2 = wordsInSettingsWindow2;
    }

    public static int[] getArrayLength() {
        return arrayLength;
    }

    public static void setArrayLength(int[] arrayLength) {
        Window.arrayLength = arrayLength;
    }

    public JButton getSendButton() {
        return sendButton;
    }

    public void setSendButton(JButton sendButton) {
        this.sendButton = sendButton;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAboutProgram;
    private javax.swing.JMenuItem jMenuItemAdd;
    private javax.swing.JMenuItem jMenuItemAddDictionary;
    private javax.swing.JMenuItem jMenuItemAuthor;
    private javax.swing.JMenuItem jMenuItemNewWords;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemOpenDictionary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaIn;
    private javax.swing.JTextPane jTextPaneOut;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton statsButton;
    // End of variables declaration//GEN-END:variables
}
