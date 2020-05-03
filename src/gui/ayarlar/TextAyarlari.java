package gui.ayarlar;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {

    /*
    *Odaklanma ayarları
     */
    private static String originalText;
    private static Color originalColor;

    public static void checkTheTextFocusGained(JTextField textFile, String org) {
        originalText = org;

        if (textFile.getText().trim().equals(org)) {
            originalColor = textFile.getForeground();
            textFile.setText("");
        }

        textFile.setForeground(Color.blue);

    }

    public static void checkTheTextFocusLost(JTextField textFile) {

        if (textFile.getText().trim().equals("")) {
            textFile.setText(originalText);
            textFile.setForeground(originalColor);
        } else {
            textFile.setForeground(Color.black);
        }

    }

    /*
    *Key ayarları
     */
    public static void setOnlyNumber(JTextField textfile) {
        textfile.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });

    }

    public static void setOnlyAlphabetic(JTextField textfile) {
        textfile.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)) {
                    e.consume();
                }
            }

        });

    }
    /*
    *Limit ayarları.
     */
    private static int limit;

    public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if (getLength() + str.length() <= limit) {
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });

    }

}
