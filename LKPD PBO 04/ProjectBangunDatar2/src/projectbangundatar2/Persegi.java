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
public class Persegi {
    void hitungLuas(int x){
        int luas = x*x;
        System.out.println("Luas Persegi integer: " + luas + " Satuan luas");
    }
    
    void hitungLuas(double x){
        double luas = x*x;
        System.out.println("Luas Persegi double: " + luas + " Satuan luas");
    }
    
    void hitungKeliling(int x){
        int keliling = 4*x;
        System.out.println("Keliling persegi integer: " + keliling + " satuan keliling");
    }
    
    void hitungKeliling(double x){
        double keliling = 4*x;
        System.out.println("Keliling persegi double: " + keliling + " satuan keliling");
    }
}
