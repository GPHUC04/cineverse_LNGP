package view;

import DatabaseConnection.CineVerseDAO;
import controller.MainController;
import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import model.CineVerseModel;

public class MainFrame extends javax.swing.JFrame {
    private CineVerseDAO cineVerseDAO;
    
    public MainFrame() {
        cineVerseDAO = new CineVerseDAO(new CineVerseModel());
        
        initComponents();
        sideBarPanel.setVisible(false);
        
        MainController mainController = new MainController(this);
                
        cineVerseDAO.setMovieData();
        setData();
        
        //set visible
        this.setVisible(true);
    }
    
    public void showPanel(String name) {
        CardLayout card = (CardLayout) contentPanel.getLayout();
        card.show(contentPanel, name);
        inactiveSideBar();
    }
    
    public void setData(){
        movieManagementPanel.setMovies(cineVerseDAO.getCineVerseModel().getMovies());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btn_Account = new javax.swing.JLabel();
        tf_Find = new javax.swing.JTextField();
        btn_Find1 = new javax.swing.JButton();
        btn_SignInSignUp = new javax.swing.JLabel();
        btn_menu = new javax.swing.JLabel();
        sideBarPanel = new javax.swing.JPanel();
        sideBar = new view.SideBar();
        contentPanel = new javax.swing.JPanel();
        homePagePanel = new view.HomePagePanel();
        movieManagementPanel = new view.MovieManagementPanel();
        screenRoomManagementPanel = new view.ScreenRoomManagementPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinéVerse");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(226, 226, 229));
        header.setPreferredSize(new java.awt.Dimension(1370, 80));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo181x60.png"))); // NOI18N

        btn_Account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-account.png"))); // NOI18N

        tf_Find.setBackground(new java.awt.Color(102, 23, 26));
        tf_Find.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Find.setForeground(new java.awt.Color(226, 226, 229));
        tf_Find.setBorder(null);
        tf_Find.setOpaque(true);
        tf_Find.setPreferredSize(new java.awt.Dimension(700, 30));
        tf_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_FindActionPerformed(evt);
            }
        });

        btn_Find1.setBackground(new java.awt.Color(103, 26, 23));
        btn_Find1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Find1.setForeground(new java.awt.Color(226, 226, 229));
        btn_Find1.setText("Find");
        btn_Find1.setBorder(null);
        btn_Find1.setBorderPainted(false);
        btn_Find1.setFocusPainted(false);
        btn_Find1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Find1ActionPerformed(evt);
            }
        });

        btn_SignInSignUp.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_SignInSignUp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_SignInSignUp.setText("Sign In/Sign Up");

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconMenu.png"))); // NOI18N
        btn_menu.setText("jLabel1");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_Find1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_SignInSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Account)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_menu)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Find1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_SignInSignUp)))))
                .addGap(7, 7, 7))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        sideBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        sideBarPanel.setBackground(new java.awt.Color(0, 0, 0, 130));
        sideBarPanel.setPreferredSize(new java.awt.Dimension(1366, 688));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sideBarPanel.add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        contentPanel.setLayout(new java.awt.CardLayout());
        contentPanel.add(homePagePanel, "homePage");
        contentPanel.add(movieManagementPanel, "movies");
        contentPanel.add(screenRoomManagementPanel, "screenRoom");

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1370, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_FindActionPerformed

    private void btn_Find1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Find1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Find1ActionPerformed
    
    public void setHeaderMouseListener(MouseListener ml){
        btn_menu.addMouseListener(ml);
    }
    
    public void activeSideBar(){
        sideBarPanel.setVisible(true);
        sideBarPanel.setEnabled(true);
        sideBar.showSideBar();
    }
    
    public void inactiveSideBar(){
        sideBarPanel.setVisible(false);
        sideBarPanel.setEnabled(false);
        sideBar.hideSidebar();
    }

    public HomePagePanel getHomePagePanel() {
        return homePagePanel;
    }

    public JLabel getBtn_menu() {
        return btn_menu;
    }

    public SideBar getSideBar() {
        return sideBar;
    }

    public MovieManagementPanel getMovieManagementPanel() {
        return movieManagementPanel;
    }

    public ScreenRoomManagementPanel getScreenRoomManagementPanel() {
        return screenRoomManagementPanel;
    }
    
    
    
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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Account;
    private javax.swing.JButton btn_Find1;
    private javax.swing.JLabel btn_SignInSignUp;
    private javax.swing.JLabel btn_menu;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel header;
    private view.HomePagePanel homePagePanel;
    private javax.swing.JLabel logo;
    private view.MovieManagementPanel movieManagementPanel;
    private view.ScreenRoomManagementPanel screenRoomManagementPanel;
    private view.SideBar sideBar;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JTextField tf_Find;
    // End of variables declaration//GEN-END:variables
}
