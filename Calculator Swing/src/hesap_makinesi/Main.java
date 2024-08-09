package hesap_makinesi;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hesap Makinesi");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Başlık

        JLabel labelBaslik = new JLabel("Hesap Makinesi", JLabel.CENTER);
        labelBaslik.setFont(new Font("Arial", Font.BOLD, 24));


        JPanel panelHesapMakinesi = new makine().panel;


        JPanel panelAna = new JPanel(new BorderLayout());
        panelAna.add(labelBaslik, BorderLayout.NORTH);
        panelAna.add(panelHesapMakinesi, BorderLayout.CENTER);

        frame.setContentPane(panelAna);

        frame.setVisible(true);

    }
}
