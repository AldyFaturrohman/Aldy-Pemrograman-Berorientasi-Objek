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
public class Segitiga {
    void hitungLuas(int x, int y){
        double luas = 0.5*x*y;
        System.out.println("Luas segitiga integer: "+luas+" satuan luas");
    }
    void hitungLuas(int x, double y){
        double luas = 0.5*x*y;
        System.out.println("Luas segitiga double: "+luas+" satuan luas");
    }    
    void hitungLuas(double x, int y){
        double luas = 0.5*x*y;
        System.out.println("Luas segitiga double: "+luas+" satuan luas");
    }
    void hitungLuas(double x, double y){
        double luas = 0.5*x*y;
        System.out.println("Luas segitiga double: "+luas+" satuan luas");
    }
}
