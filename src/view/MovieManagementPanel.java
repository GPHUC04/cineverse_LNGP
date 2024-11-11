/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DatabaseConnection.CineVerseDAO;
import font.SetFont;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Movie;

/**
 *
 * @author ADMIN
 */
public class MovieManagementPanel extends javax.swing.JPanel {
    private SetFont font;
    private List<Movie> movies;
        
    public MovieManagementPanel() {
        font = new SetFont();
        movies = new ArrayList<Movie>();
        
        initComponents();
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_content = new javax.swing.JPanel();
        jp_infor = new javax.swing.JPanel();
        jl_movieManagement = new javax.swing.JLabel();
        sp_movie = new javax.swing.JScrollPane();
        jt_movie = new javax.swing.JTable();
        jl_title = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        jl_movieID = new javax.swing.JLabel();
        tf_movieID = new javax.swing.JTextField();
        jl_genre = new javax.swing.JLabel();
        tf_genre = new javax.swing.JTextField();
        jl_language = new javax.swing.JLabel();
        tf_language = new javax.swing.JTextField();
        jl_subtitle = new javax.swing.JLabel();
        tf_subtitle = new javax.swing.JTextField();
        jl_duration = new javax.swing.JLabel();
        tf_duration = new javax.swing.JTextField();
        jl_releaseDate = new javax.swing.JLabel();
        tf_releaseDate = new javax.swing.JTextField();
        jl_endDate = new javax.swing.JLabel();
        tf_endDate = new javax.swing.JTextField();
        jl_director = new javax.swing.JLabel();
        tf_director = new javax.swing.JTextField();
        jl_cast = new javax.swing.JLabel();
        tf_cast = new javax.swing.JTextField();
        jl_description = new javax.swing.JLabel();
        sp_description = new javax.swing.JScrollPane();
        ta_description = new javax.swing.JTextArea();
        jp_button = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_content.setBackground(new java.awt.Color(226, 226, 229));
        jp_content.setBackground(new java.awt.Color(226, 226, 229, 123));
        jp_content.setPreferredSize(new java.awt.Dimension(1200, 650));
        jp_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_infor.setBackground(new java.awt.Color(255, 255, 255));
        jp_infor.setOpaque(false);
        jp_infor.setLayout(null);

        jl_movieManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        font.setFontFutura(jl_movieManagement, 24f);
        jl_movieManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_movieManagement.setText("Movie Management");
        jp_infor.add(jl_movieManagement);
        jl_movieManagement.setBounds(7, 2, 1190, 32);

        sp_movie.setBorder(null);
        sp_movie.setDoubleBuffered(true);
        sp_movie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(sp_movie, 14f);

        jt_movie.setBackground(new java.awt.Color(226, 226, 229));
        jt_movie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(jt_movie, 14f);
        jt_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie ID", "Title", "Genre", "Language", "Subtitle", "Duration", "Director", "Cast", "Release Date", "End Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_movie.setViewportView(jt_movie);

        jp_infor.add(sp_movie);
        sp_movie.setBounds(20, 40, 1150, 260);

        jl_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_title, 18f);
        jl_title.setText("Title:");
        jl_title.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_title);
        jl_title.setBounds(20, 310, 150, 30);

        tf_title.setBackground(new java.awt.Color(226, 226, 229));
        tf_title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_title, 14f);
        tf_title.setBorder(null);
        tf_title.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_title.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_title);
        tf_title.setBounds(170, 310, 610, 30);

        jl_movieID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_movieID, 18f);
        jl_movieID.setText("Movie ID:");
        jl_movieID.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_movieID);
        jl_movieID.setBounds(800, 310, 150, 30);

        tf_movieID.setBackground(new java.awt.Color(226, 226, 229));
        tf_movieID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_movieID, 14f);
        tf_movieID.setBorder(null);
        tf_movieID.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_movieID.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_movieID);
        tf_movieID.setBounds(950, 310, 220, 30);

        jl_genre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_genre, 18f);
        jl_genre.setText("Genre:");
        jl_genre.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_genre);
        jl_genre.setBounds(20, 350, 150, 30);

        tf_genre.setBackground(new java.awt.Color(226, 226, 229));
        tf_genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_genre, 14f);
        tf_genre.setBorder(null);
        tf_genre.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_genre.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_genre);
        tf_genre.setBounds(170, 350, 220, 30);

        jl_language.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_language, 18f);
        jl_language.setText("Language:");
        jl_language.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_language);
        jl_language.setBounds(410, 350, 150, 30);

        tf_language.setBackground(new java.awt.Color(226, 226, 229));
        tf_language.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_language, 14f);
        tf_language.setBorder(null);
        tf_language.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_language.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_language);
        tf_language.setBounds(560, 350, 220, 30);

        jl_subtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_subtitle, 18f);
        jl_subtitle.setText("Subtitle:");
        jl_subtitle.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_subtitle);
        jl_subtitle.setBounds(800, 350, 150, 30);

        tf_subtitle.setBackground(new java.awt.Color(226, 226, 229));
        tf_subtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_subtitle, 14f);
        tf_subtitle.setBorder(null);
        tf_subtitle.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_subtitle.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_subtitle);
        tf_subtitle.setBounds(950, 350, 220, 30);

        jl_duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_duration, 18f);
        jl_duration.setText("Duration:");
        jl_duration.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_duration);
        jl_duration.setBounds(20, 390, 150, 30);

        tf_duration.setBackground(new java.awt.Color(226, 226, 229));
        tf_duration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_duration, 14f);
        tf_duration.setBorder(null);
        tf_duration.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_duration.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_duration);
        tf_duration.setBounds(170, 390, 220, 30);

        jl_releaseDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_releaseDate, 18f);
        jl_releaseDate.setText("Release date:");
        jl_releaseDate.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_releaseDate);
        jl_releaseDate.setBounds(410, 390, 150, 30);

        tf_releaseDate.setBackground(new java.awt.Color(226, 226, 229));
        tf_releaseDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_releaseDate, 14f);
        tf_releaseDate.setBorder(null);
        tf_releaseDate.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_releaseDate.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_releaseDate);
        tf_releaseDate.setBounds(560, 390, 220, 30);

        jl_endDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_endDate, 18f);
        jl_endDate.setText("End date:");
        jl_endDate.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_endDate);
        jl_endDate.setBounds(800, 390, 150, 30);

        tf_endDate.setBackground(new java.awt.Color(226, 226, 229));
        tf_endDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_endDate, 14f);
        tf_endDate.setBorder(null);
        tf_endDate.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_endDate.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_endDate);
        tf_endDate.setBounds(950, 390, 220, 30);

        jl_director.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_director, 18f);
        jl_director.setText("Director:");
        jl_director.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_director);
        jl_director.setBounds(20, 430, 150, 30);

        tf_director.setBackground(new java.awt.Color(226, 226, 229));
        tf_director.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_director, 14f);
        tf_director.setBorder(null);
        tf_director.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_director.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_director);
        tf_director.setBounds(170, 430, 220, 30);

        jl_cast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_cast, 18f);
        jl_cast.setText("Cast:");
        jl_cast.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_cast);
        jl_cast.setBounds(410, 430, 150, 30);

        tf_cast.setBackground(new java.awt.Color(226, 226, 229));
        tf_cast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(tf_cast, 14f);
        tf_cast.setBorder(null);
        tf_cast.setMaximumSize(new java.awt.Dimension(370, 30));
        tf_cast.setPreferredSize(new java.awt.Dimension(100, 30));
        jp_infor.add(tf_cast);
        tf_cast.setBounds(560, 430, 610, 30);

        jl_description.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        font.setFontRoboto(jl_description, 18f);
        jl_description.setText("Description:");
        jl_description.setPreferredSize(new java.awt.Dimension(150, 16));
        jp_infor.add(jl_description);
        jl_description.setBounds(20, 470, 150, 30);

        sp_description.setBorder(null);

        ta_description.setBackground(new java.awt.Color(226, 226, 229));
        ta_description.setColumns(20);
        ta_description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        font.setFontRoboto(ta_description, 14f);
        ta_description.setRows(5);
        ta_description.setBorder(null);
        sp_description.setViewportView(ta_description);

        jp_infor.add(sp_description);
        sp_description.setBounds(170, 466, 1000, 110);

        jp_content.add(jp_infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 590));

        jp_button.setOpaque(false);
        jp_button.setPreferredSize(new java.awt.Dimension(1196, 40));
        jp_button.setLayout(new java.awt.GridLayout(1, 5, 70, 30));

        btn_insert.setBackground(new java.awt.Color(102, 23, 26));
        btn_insert.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_insert, 20f);
        btn_insert.setForeground(new java.awt.Color(226, 226, 229));
        btn_insert.setText("Insert");
        btn_insert.setBorder(null);
        btn_insert.setFocusPainted(false);
        btn_insert.setPreferredSize(new java.awt.Dimension(200, 40));
        jp_button.add(btn_insert);

        btn_delete.setBackground(new java.awt.Color(102, 23, 26));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_delete, 20f);
        btn_delete.setForeground(new java.awt.Color(226, 226, 229));
        btn_delete.setText("Delete");
        btn_delete.setBorder(null);
        btn_delete.setFocusPainted(false);
        btn_delete.setPreferredSize(new java.awt.Dimension(200, 40));
        jp_button.add(btn_delete);

        btn_edit.setBackground(new java.awt.Color(102, 23, 26));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_edit, 20f);
        btn_edit.setForeground(new java.awt.Color(226, 226, 229));
        btn_edit.setText("Edit");
        btn_edit.setBorder(null);
        btn_edit.setFocusPainted(false);
        btn_edit.setPreferredSize(new java.awt.Dimension(200, 40));
        jp_button.add(btn_edit);

        btn_ok.setBackground(new java.awt.Color(102, 23, 26));
        btn_ok.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_ok, 20f);
        btn_ok.setForeground(new java.awt.Color(226, 226, 229));
        btn_ok.setText("OK");
        btn_ok.setBorder(null);
        btn_ok.setFocusPainted(false);
        btn_ok.setPreferredSize(new java.awt.Dimension(200, 40));
        jp_button.add(btn_ok);

        btn_cancel.setBackground(new java.awt.Color(102, 23, 26));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        font.setFontRobotoBold(btn_cancel, 20f);
        btn_cancel.setForeground(new java.awt.Color(226, 226, 229));
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(null);
        btn_cancel.setFocusPainted(false);
        btn_cancel.setPreferredSize(new java.awt.Dimension(150, 40));
        jp_button.add(btn_cancel);

        jp_content.add(jp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 597, 1140, -1));

        add(jp_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 19, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        background.setText("jLabel2");
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jl_cast;
    private javax.swing.JLabel jl_description;
    private javax.swing.JLabel jl_director;
    private javax.swing.JLabel jl_duration;
    private javax.swing.JLabel jl_endDate;
    private javax.swing.JLabel jl_genre;
    private javax.swing.JLabel jl_language;
    private javax.swing.JLabel jl_movieID;
    private javax.swing.JLabel jl_movieManagement;
    private javax.swing.JLabel jl_releaseDate;
    private javax.swing.JLabel jl_subtitle;
    private javax.swing.JLabel jl_title;
    private javax.swing.JPanel jp_button;
    private javax.swing.JPanel jp_content;
    private javax.swing.JPanel jp_infor;
    private javax.swing.JTable jt_movie;
    private javax.swing.JScrollPane sp_description;
    private javax.swing.JScrollPane sp_movie;
    private javax.swing.JTextArea ta_description;
    private javax.swing.JTextField tf_cast;
    private javax.swing.JTextField tf_director;
    private javax.swing.JTextField tf_duration;
    private javax.swing.JTextField tf_endDate;
    private javax.swing.JTextField tf_genre;
    private javax.swing.JTextField tf_language;
    private javax.swing.JTextField tf_movieID;
    private javax.swing.JTextField tf_releaseDate;
    private javax.swing.JTextField tf_subtitle;
    private javax.swing.JTextField tf_title;
    // End of variables declaration//GEN-END:variables

    public void setMovies(List<Movie> movies){
        this.movies = movies;
        setData();
    }
    
    public void setData(){
        DefaultTableModel model = (DefaultTableModel) jt_movie.getModel();
        model.setRowCount(0);
        
        for (Movie m : movies) {
            String[] rowData = {
                m.getMid(),
                m.getTitle(),
                m.getGenre(),
                m.getLanguage(),
                m.getSubtitle(),
                String.valueOf(m.getDuration()),
                m.getDirector(),
                m.getCast(),
                m.getRelease_date().toString(), // Chuyển Date sang String
                m.getEnd_date().toString(),     // Chuyển Date sang String
                m.getDescription()
            };
            // Thêm dòng vào bảng
            model.addRow(rowData);
        
        }
    }
    
    public void setActionListener(ActionListener ac){
        btn_insert.addActionListener(ac);
        btn_edit.addActionListener(ac);
        btn_delete.addActionListener(ac);
        btn_ok.addActionListener(ac);
        btn_cancel.addActionListener(ac);
    }
    
    public void insertMovie() {
        refreshMovieInfor();
    }

    public void editMovie() {
        Movie movie = getSelectedRow();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        //show movie to textfield
        tf_movieID.setText(movie.getMid());
        tf_title.setText(movie.getTitle());
        tf_genre.setText(movie.getGenre());
        tf_language.setText(movie.getLanguage());
        tf_subtitle.setText(movie.getSubtitle());
        tf_duration.setText(movie.getDuration() + "");
        
        tf_releaseDate.setText(movie.getRelease_date() + "");
        tf_endDate.setText(movie.getEnd_date() + "");
//        tf_releaseDate.setText(sdf.format(movie.getRelease_date()));
//        tf_endDate.setText(sdf.format(movie.getEnd_date()));
        
        tf_director.setText(movie.getDirector());
        tf_cast.setText(movie.getCast());
        ta_description.setText(movie.getDescription());
        
    }

    public void deleteMovie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void saveMovie() {
        Movie m = getSelectedRow();
        CineVerseDAO.createAndUpdateMovie(m);
    }

    public void refreshMovieInfor() {
        tf_title.setText("");
        tf_movieID.setText("");
        tf_genre.setText("");
        tf_language.setText("");
        tf_subtitle.setText("");
        tf_duration.setText("");
        tf_releaseDate.setText("");
        tf_endDate.setText("");
        tf_director.setText("");
        tf_cast.setText("");
        ta_description.setText("");
    }

    public JTable getJt_movie() {
        return jt_movie;
    }

    private Movie getSelectedRow() {
        DefaultTableModel model = (DefaultTableModel) jt_movie.getModel();
        int selectedRow = jt_movie.getSelectedRow();
        
        String movieID = model.getValueAt(selectedRow, 0) + "";
        String title = model.getValueAt(selectedRow, 1) + "";
        String genre = model.getValueAt(selectedRow, 2) + "";
        String language = model.getValueAt(selectedRow, 3) + "";
        String subtitle = model.getValueAt(selectedRow, 4) + "";
        int duration = Integer.valueOf(model.getValueAt(selectedRow, 5) + "");
        String director = model.getValueAt(selectedRow, 6) + "";
        String cast = model.getValueAt(selectedRow, 7) + "";
        
        LocalDate releaseDate = LocalDate.parse(model.getValueAt(selectedRow, 8) + "");
        LocalDate endDate = LocalDate.parse(model.getValueAt(selectedRow, 9) + "");
//        String[] ymdReleaseDate = (model.getValueAt(selectedRow, 8) + "").split("-");
//        Date releaseDate = new Date(Integer.valueOf(ymdReleaseDate[0]), Integer.valueOf(ymdReleaseDate[1]), Integer.valueOf(ymdReleaseDate[2]));
//        String[] ymdEndDate = (model.getValueAt(selectedRow, 9) + "").split("-");
//        Date endDate = new Date(Integer.valueOf(ymdEndDate[0]), Integer.valueOf(ymdEndDate[1]), Integer.valueOf(ymdEndDate[2]));
        
        String description = model.getValueAt(selectedRow, 10) + "";
        
        return new Movie(movieID, title, genre, language, subtitle, duration, director, cast, releaseDate, endDate, description);
    }
    
    
    
}
