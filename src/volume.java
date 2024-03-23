/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
import java.util.Scanner;
public class volume {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        System.out.print("masukkan diameter:");
        double diameter =Scanner.nextDouble();
        double volume=volume_tabung(diameter);
        System.out.println("volume"+volume);
    }
    public static double volume_tabung(double diameter){
        double jari2=diameter/2;
        double tinggi=10;
        double volume=Math.PI*Math.pow(jari2,2)*tinggi;
        return volume;
    }
    
}
