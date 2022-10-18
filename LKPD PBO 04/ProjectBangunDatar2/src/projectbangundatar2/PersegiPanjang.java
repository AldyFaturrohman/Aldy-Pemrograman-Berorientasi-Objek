/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author maldy
 */
public class PersegiPanjang {
    void hitungLuas(int x, int y){
        int luas = x*y;
        System.out.println("Luas persegi panjang integer: " +luas+" satuan luas");
    }
    void hitungLuas(int x, double y){
        double luas = x*y;
        System.out.println("Luas persegi panjang dobule: " +luas+" satuan luas");
    }
    void hitungLuas(double x, int y){
        double luas = x*y;
        System.out.println("Luas persegi panjang dobule: " +luas+" satuan luas");
    }
    void hitungLuas(double x, double y){
        double luas = x*y;
        System.out.println("Luas persegi panjang dobule: " +luas+" satuan luas");
    }
    
    void hitungKeliling(int x, int y){
        int keliling = 2*(x+y);
        System.out.println("Keliling persegi panjang integer: "+keliling+" satuan keliling");
    }
    void hitungKeliling(int x, double y){
        double keliling = 2*(x+y);
        System.out.println("Keliling persegi panjang double: "+keliling+" satuan keliling");
    }
    void hitungKeliling(double x, int y){
        double keliling = 2*(x+y);
        System.out.println("Keliling persegi panjang double: "+keliling+" satuan keliling");
    }
    void hitungKeliling(double x, double y){
        double keliling = 2*(x+y);
        System.out.println("Keliling persegi panjang double: "+keliling+" satuan keliling");
    }
}
