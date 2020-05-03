
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonAyarlari {
    /*
    *Arkaplan ve yazı rengi ayarları.
    */
    private static Color originalBgColor,originalFgColor;
    
    public static void setBgFg(JButton button,Color BgColor,Color FgColor){
//      Butonun orjinal rengini değişkene atadık.
        originalBgColor = button.getBackground();
        originalFgColor = button.getForeground();
//      Butona renkleri verdik.
        button.setBackground(BgColor);
        button.setForeground(FgColor);
    }
    public static void originalBgFg(JButton button){
//      Button rengini eski haline çevirdik.
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
    /*
    *
    */

    public static void setBgFg(JButton jButton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
