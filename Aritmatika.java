package praktikum.tugas5.staticmethod;

public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
        hitungPerkalian(nilai, b);
    }

    public static void hitungPerkalian(int a, int b){
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b){
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil, String nil2) {
        double n1 = Double.parseDouble(nil);
        double n2 = Double.parseDouble(nil2);
        return n1 / n2;
    }
}

