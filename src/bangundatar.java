/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
import javax.swing.JOptionPane;
public class bangundatar {
    public static void main(String[] args) {
        String []options={"persegi panjang","segi tiga","lingkaran"};
        String selectedoption=(String)JOptionPane.showInputDialog(null,"pilih bangun datar","pilihan",
                JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        if(selectedoption!=null){
            switch(selectedoption){
                case"persegi panjang":
                    luas_persegi_panjang();
                    break;
                case"segi tiga":
                    luas_segi_tiga();
                    break;
                case"lingkaran":
                    luas_lingkaran();
                    break;
                    
            }
        }
        
        
    }
    public static void luas_persegi_panjang() {
        double panjang=getInputDouble("masukkan panjang");
        double lebar =getInputDouble("masukkan lebar");
        double luas=panjang*lebar;
        JOptionPane.showMessageDialog(null,"luas persegi panjang:"+ luas);
    }
    public static void luas_segi_tiga() {
        double alas=getInputDouble("masukkan alas");
        double tinggi=getInputDouble("masukkan tinggi");
        double luas=0.5*alas*tinggi;
        JOptionPane.showMessageDialog(null,"luas segi tiga:"+ luas);
    }
    public static void luas_lingkaran() {
        double jari2=getInputDouble("masukkan jari2");
        double luas= luas= Math.PI*jari2*jari2;
        JOptionPane.showMessageDialog(null,"luas lingkaran:"+ luas);
        
                
    }
    public static double getInputDouble(String message) {
        String input=JOptionPane.showInputDialog(null,message);
        return Double.parseDouble(input);
    }
}
