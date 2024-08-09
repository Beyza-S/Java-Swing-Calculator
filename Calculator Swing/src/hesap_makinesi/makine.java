package hesap_makinesi;

import javax.swing.*;

public class makine {
    public JPanel panel;
    public JTextField textislem;
    public JButton buttoncarp;
    public JButton buttoncikar;
    public JButton buttontopla;
    public JButton buttonesittir;
    public JButton buttonc;
    public JButton button7;
    public JButton button4;
    public JButton button1;
    public JButton button0;
    public JButton buttonsil;
    public JButton buttonbol;
    public JButton button9;
    public JButton button6;
    public JButton button3;
    public JButton buttonmod;
    public JButton button8;
    public JButton button5;
    public JButton button2;
    public JButton buttonnokta;
    public JRadioButton onRadioButton;
    public JPanel on;

    public double sayi1, sayi2;
    public char islem;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hesap Makinesi");
        frame.setContentPane(new makine().panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public makine() {

        // TextField hizalamasını sağa ayarlama
        textislem.setHorizontalAlignment(JTextField.RIGHT);

        // Defaultu sıfır olarak ayarlama
        textislem.setText("0");

        button1.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("1");
            } else {
                textislem.setText(textislem.getText() + "1");
            }
        });
        button2.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("2");
            } else {
                textislem.setText(textislem.getText() + "2");
            }
        });
        button3.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("3");
            } else {
                textislem.setText(textislem.getText() + "3");
            }
        });
        button4.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("4");
            } else {
                textislem.setText(textislem.getText() + "4");
            }
        });
        button5.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("5");
            } else {
                textislem.setText(textislem.getText() + "5");
            }
        });
        button6.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("6");
            } else {
                textislem.setText(textislem.getText() + "6");
            }
        });
        button7.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("7");
            } else {
                textislem.setText(textislem.getText() + "7");
            }
        });
        button8.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("8");
            } else {
                textislem.setText(textislem.getText() + "8");
            }
        });
        button9.addActionListener(e -> {
            if (textislem.getText().equals("0")) {
                textislem.setText("9");
            } else {
                textislem.setText(textislem.getText() + "9");
            }
        });
        button0.addActionListener(e -> {
            if (!textislem.getText().equals("0")) {
                textislem.setText(textislem.getText() + "0");
            }
        });

        buttontopla.addActionListener(e -> {
            sayi1 = Double.parseDouble(textislem.getText());
            islem = '+';
            textislem.setText("0");
        });

        buttoncikar.addActionListener(e -> {
            sayi1 = Double.parseDouble(textislem.getText());
            islem = '-';
            textislem.setText("0");
        });

        buttoncarp.addActionListener(e -> {
            sayi1 = Double.parseDouble(textislem.getText());
            islem = '*';
            textislem.setText("0");
        });

        buttonbol.addActionListener(e -> {
            sayi1 = Double.parseDouble(textislem.getText());
            islem = '/';
            textislem.setText("0");
        });

        buttonesittir.addActionListener(e -> {
            sayi2 = Double.parseDouble(textislem.getText());
            double sonuc = 0;
            switch (islem) {
                case '+':
                    sonuc = sayi1 + sayi2;
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                    break;
                case '/':
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
                    } else {
                        textislem.setText("Hata");
                        return;
                    }
                    break;
            }
            textislem.setText(String.valueOf(sonuc));
        });

        buttonc.addActionListener(e -> textislem.setText("0"));

        buttonsil.addActionListener(e -> {
            String currentText = textislem.getText();
            if (currentText.length() > 1) {
                textislem.setText(currentText.substring(0, currentText.length() - 1));
            } else {
                textislem.setText("0");
            }
        });

        buttonnokta.addActionListener(e -> {
            if (!textislem.getText().contains(".")) {
                textislem.setText(textislem.getText() + ".");
            }
        });

        // RadioButton'a ActionListener ekleme ve Hesap Makinesini etkinleştirme

        onRadioButton.addActionListener(e -> {
            boolean acik = onRadioButton.isSelected();
            textislem.setEnabled(acik);
            button1.setEnabled(acik);
            button2.setEnabled(acik);
            button3.setEnabled(acik);
            button4.setEnabled(acik);
            button5.setEnabled(acik);
            button6.setEnabled(acik);
            button7.setEnabled(acik);
            button8.setEnabled(acik);
            button9.setEnabled(acik);
            button0.setEnabled(acik);
            buttontopla.setEnabled(acik);
            buttoncikar.setEnabled(acik);
            buttoncarp.setEnabled(acik);
            buttonbol.setEnabled(acik);
            buttonesittir.setEnabled(acik);
            buttonc.setEnabled(acik);
            buttonsil.setEnabled(acik);
            buttonnokta.setEnabled(acik);
            buttonmod.setEnabled(acik);
        });

        // Hesap makinesini devre dışı bırakma

        onRadioButton.setSelected(false);
        textislem.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button0.setEnabled(false);
        buttontopla.setEnabled(false);
        buttoncikar.setEnabled(false);
        buttoncarp.setEnabled(false);
        buttonbol.setEnabled(false);
        buttonesittir.setEnabled(false);
        buttonc.setEnabled(false);
        buttonsil.setEnabled(false);
        buttonnokta.setEnabled(false);
        buttonmod.setEnabled(false);
    }
}
