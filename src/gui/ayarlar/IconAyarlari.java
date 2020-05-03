package gui.ayarlar;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconAyarlari {

    private static Icon originalIcon;

    public static void changeIcon(JLabel label,String fileName){
        originalIcon = label.getIcon();
        
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource(("/gui/iconlar/"+fileName+".png"))));

        
        //label.setIcon(new ImageIcon(Package.getPackage("gui").getClass().getResource(("/gui/iconlar/"+fileName+".png"))));
        
        
        /*
        *Alttaki şekilde yaptım böyle oluyordu. ama sizin yaptğınız şekilde olmuyor.
        */
        //ImageIcon icon =new ImageIcon("C:\\Users\\rojha\\Documents\\NetBeansProjects\\Sweet Bank\\src\\gui\\iconlar\\"+fileName+".png");
        //label.setIcon(icon);
    }
    
    public static void setOriginalIcon(JLabel label){
        label.setIcon(originalIcon);
    }

}
