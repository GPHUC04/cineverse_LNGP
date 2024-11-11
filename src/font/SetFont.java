/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package font;

import java.awt.Font;
import java.io.InputStream;
import javax.swing.JComponent;

/**
 *
 * @author ADMIN
 */
public class SetFont {
    
    public void setFontFuturaDisplay(JComponent jComboComponent, float fontSize) {
        try {
            // Sử dụng getResourceAsStream để lấy font từ package "font"
            InputStream fontStream = getClass().getResourceAsStream("Futura-Display.ttf");

            if (fontStream != null) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(fontSize);
                jComboComponent.setFont(font);
            } else {
                System.err.println("Không tìm thấy file font!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setFontFutura(JComponent jComboComponent, float fontSize) {
        try {
            // Sử dụng getResourceAsStream để lấy font từ package "font"
            InputStream fontStream = getClass().getResourceAsStream("futur.ttf");

            if (fontStream != null) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(fontSize);
                jComboComponent.setFont(font);
            } else {
                System.err.println("Không tìm thấy file font!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setFontRobotoBold(JComponent jComboComponent, float fontSize) {
        try {
            // Sử dụng getResourceAsStream để lấy font từ package "font"
            InputStream fontStream = getClass().getResourceAsStream("Roboto-Bold.ttf");

            if (fontStream != null) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(fontSize);
                jComboComponent.setFont(font);
            } else {
                System.err.println("Không tìm thấy file font!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setFontRoboto(JComponent jComboComponent, float fontSize) {
        try {
            // Sử dụng getResourceAsStream để lấy font từ package "font"
            InputStream fontStream = getClass().getResourceAsStream("Roboto-Regular.ttf");

            if (fontStream != null) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(fontSize);
                jComboComponent.setFont(font);
            } else {
                System.err.println("Không tìm thấy file font!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setFontHagrid(JComponent jComboComponent, float fontSize) {
        try {
            // Sử dụng getResourceAsStream để lấy font từ package "font"
            InputStream fontStream = getClass().getResourceAsStream("Hagrid-Regular.ttf");

            if (fontStream != null) {
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(fontSize);
                jComboComponent.setFont(font);
            } else {
                System.err.println("Không tìm thấy file font!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}