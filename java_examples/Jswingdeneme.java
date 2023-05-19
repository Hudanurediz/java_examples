package jswingdeneme;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class Jswingdeneme {
    JFrame frame;
    //constructor olusturulur
     Jswingdeneme(){
        JButton giris;
        JButton colorSelector;
        JTextField email;
        JPasswordField pass;
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        giris= new JButton("Giris Yap");
        colorSelector= new JButton("Buton renklerini seç");
        giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean girisBasarili = true; // Giriş başarılıysa true, değilse false olarak ayarlayın
                // Giriş başarılıysa mesajı görüntüle
                if (girisBasarili) {
                    JFrame parentComponent = new JFrame();//pop-up mesajını belirli bir bileşenin üzerinde görüntülemek
                    JOptionPane.showMessageDialog(parentComponent, "Giriş yapılıyor!");
                }
            }
        });
        email= new JTextField("Mail adresini giriniz");
        pass= new JPasswordField();
        // Ekran boyutunu alma
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        // Yüzde değerlerini piksellere dönüştürme
        int x = (int) (screenWidth * 0.40); // x = Ekran genişliğinin %x'si
        int y = (int) (screenHeight * 0.55); // y = Ekran yüksekliğinin %y'u
        
        giris.setBounds(x,y,200,50);
        giris.setBackground(Color.decode("#b187b0"));
        
        colorSelector.setBounds((int)(screenWidth * 0.40),(int)(screenHeight * 0.65),200,50);
        colorSelector.setBackground(Color.decode("#b187b0"));
        
        email.setBounds((int)(screenWidth * 0.30),(int)(screenHeight * 0.30),(int)(screenHeight * 0.60),50);
        email.setBackground(Color.decode("#b187b0"));
        
        pass.setBounds((int)(screenWidth * 0.40),(int)(screenHeight * 0.40),200,50);
        pass.setBackground(Color.decode("#b187b0"));
        
        email.setText("Mail adresini giriniz");
        email.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (email.getText().equals("Mail adresini giriniz")) {
                email.setText("");
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (email.getText().isEmpty()) {
                email.setText("Mail adresini giriniz");
            }
        }
    });
        colorSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(frame, "Renk Seç", Color.CYAN);
                colorSelector.setBackground(c);
                giris.setBackground(c);
            }
        });
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\hudan\\OneDrive\\Masaüstü\\icon.png");  
        frame.setIconImage(icon);
        frame.add(giris);
        frame.add(email);
        frame.add(pass);
        frame.add(colorSelector);
        frame.setSize(screenWidth,screenHeight);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Jswingdeneme();
    }
    
}
