package imagecomparisonfinal;

import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class mainFrame extends javax.swing.JFrame {

    public mainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Загрузить...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click1(evt);
            }
        });

        jButton2.setText("Загрузить...");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click2(evt);
            }
        });

        jToggleButton1.setText("Анализ");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyse(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file.png"))); // NOI18N
        jTabbedPane2.addTab("После", jLabel2);

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                depthSlider(evt);
            }
        });
        jSlider1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                depth(evt);
            }
        });

        jLabel3.setText("Чувствительность");

        jLabel4.setText("50");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file.png"))); // NOI18N
        jTabbedPane3.addTab("До", jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane3)
                    .addComponent(jTabbedPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        File file1 = new File("");
        File file2 = new File("");
        int dvalue = 120;
    private void click1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click1
        JFileChooser fileopen = new JFileChooser();             
        int ret = fileopen.showDialog(null, "Загрузить файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
        file1 = fileopen.getSelectedFile();
        jLabel1.setIcon(new ImageIcon(new ImageIcon(file1.getAbsolutePath()).getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT)));
}
    }//GEN-LAST:event_click1

    private void click2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click2
        JFileChooser fileopen = new JFileChooser();             
        int ret = fileopen.showDialog(null, "Загрузить файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
        file2 = fileopen.getSelectedFile();
        jLabel2.setIcon(new ImageIcon(new ImageIcon(file2.getAbsolutePath()).getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT)));
        }
        
    }//GEN-LAST:event_click2

    private void analyse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyse
        try{   
        ImageIO.write(difference.getDifference(ImageIO.read(new File(file1.getAbsolutePath())), ImageIO.read(new File(file2.getAbsolutePath())), dvalue), "jpg", new File("output.jpg"));
                    monochromiser mn = new monochromiser();
                    mn.monochromise("output.jpg");
        
        JFrame frame = new JFrame("Результат");
                try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("output2.jpg")))));
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        frame.pack();
        frame.setVisible(true);
        
        }
        catch(Exception e)
        {
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        JFrame frame = new JFrame("Oшибка");
//        frame.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
//        frame.setPreferredSize(new Dimension(400, 300));
//        JLabel label = new JLabel("Изображения не соответствуют!");
//        frame.add(label);
//        frame.pack();
//        frame.setVisible(true);
        }
    }//GEN-LAST:event_analyse

    private void depth(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_depth
        
    }//GEN-LAST:event_depth

    private void depthSlider(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_depthSlider
        int level = jSlider1.getValue();
        if (level>0 && level<=10){dvalue= 500; jLabel4.setText(Integer.toString(level));}
        if (level>11 && level<=20){dvalue= 350;jLabel4.setText(Integer.toString(level));}
        if (level>21 && level<=30){dvalue= 280;jLabel4.setText(Integer.toString(level));}
        if (level>31 && level<=40){dvalue= 200;jLabel4.setText(Integer.toString(level));}
        if (level>41 && level<=50){dvalue= 120;jLabel4.setText(Integer.toString(level));}
        if (level>51 && level<=60){dvalue= 100;jLabel4.setText(Integer.toString(level));}
        if (level>61 && level<=70){dvalue= 80;jLabel4.setText(Integer.toString(level));}
        if (level>71 && level<=80){dvalue= 60;jLabel4.setText(Integer.toString(level));}
        if (level>81 && level<=90){dvalue= 30;jLabel4.setText(Integer.toString(level));}
        if (level>91 && level<=100){dvalue= 10;jLabel4.setText(Integer.toString(level));}
    }//GEN-LAST:event_depthSlider

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new mainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
