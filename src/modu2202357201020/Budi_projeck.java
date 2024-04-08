package modu2202357201020;

import javax.swing.JOptionPane;

public class Budi_projeck {
    
    public static double LuasPersegiPanjang(double panjang, double lebar){
        return panjang * lebar;
    }
    public static double LuasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
    public static double LuasLingkaran(double Jarijari){
        return Math.PI*Math.pow(Jarijari, 2);
    }
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        double luasPersegiPanjang = LuasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        JOptionPane.showConfirmDialog(null,"luas persegi panjang : "+luasPersegiPanjang);
        System.out.println("luas persegi panjang: "+ luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double luasSegitiga = LuasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showConfirmDialog(null,"luas segitiga : "+luasSegitiga);
        System.out.println("luas segitiga: "+ luasSegitiga);
        
        double JarijariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari jari lingkaran:"));
        double luasLingkaran = LuasLingkaran(JarijariLingkaran);
        JOptionPane.showConfirmDialog(null,"luas lungkaran : "+luasLingkaran);
        System.out.println("luas lingkaran: "+ luasLingkaran);
    }
    
}
