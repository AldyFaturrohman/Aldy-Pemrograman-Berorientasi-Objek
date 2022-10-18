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
public class Lingkaran {
    void hitungLuas(int x){
        double luas = 3.14*x*x;
        System.out.println("Luas lingkaran integer: "+luas+" satuan luas");
    }
    void hitungLuas(double x){
        double luas = 3.14*x*x;
        System.out.println("Luas lingkaran double: "+luas+" satuan luas");
    }
    
    void hitungKeliling(int x){
        double keliling = 2*3.14*x;
        System.out.println("Keliling lingkaran integer: " +keliling+ " satuan keliling");
    }
    void hitungKeliling(double x){
        double keliling = 2*3.14*x;
        System.out.println("Keliling lingkaran double: " +keliling+ " satuan keliling");
    }
}
