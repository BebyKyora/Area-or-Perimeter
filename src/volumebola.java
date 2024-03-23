
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
import java.util.Scanner;
public class volumebola {
     public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        System.out.print("masukkan diameter:");
        double diameter =Scanner.nextDouble();
        double volume=volume_bola(diameter);
        System.out.println("volume:"+volume);
    }
    public static double volume_bola(double diameter){
        double jari2=diameter/2;
        double volume=(4.0/3.0)*Math.PI*Math.pow(jari2,3);
        return volume;
    
    }
}
