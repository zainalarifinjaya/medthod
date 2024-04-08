package modu2202357201020;

public class Modu2202357201020 {
    
public double luas_lingkaran (int diameter){
        int jari2 = diameter / 2;
        double luas = Math.PI *Math.pow(jari2, 2);
        return luas;
    }
    public static void main(String[] args) {
        methodx mt = new methodx();
        System.out.print(mt.luas_lingkaran(20));
        System.exit(0);
    }
     
    }