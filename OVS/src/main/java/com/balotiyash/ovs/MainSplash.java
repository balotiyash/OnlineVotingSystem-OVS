package com.balotiyash.ovs;

public class MainSplash extends javax.swing.JFrame {

    public MainSplash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javaLogo_lbl = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OVS - Online Voting System [Group No. 20]");
        setResizable(false);

        javaLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\JavaLogo1.png")); // NOI18N
        javaLogo_lbl.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(javaLogo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(javaLogo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 682, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void display() {
        MainSplash ms = new MainSplash();
        ms.setVisible(true);
        
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
                ms.progressBar.setValue(i);
                
                if (i == 100) {
                    ms.dispose();
                    MainLogin ml = new MainLogin();
                    ml.display();
                }
            } catch (InterruptedException ie) {}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel javaLogo_lbl;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
